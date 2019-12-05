package typingsSlinky.newrelic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var moduleName: String
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  def onRequire(): Unit
}

object Anon_Err {
  @scala.inline
  def apply(moduleName: String, onRequire: () => Unit, onError: /* err */ js.Error => Unit = null): Anon_Err = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[Anon_Err]
  }
}

