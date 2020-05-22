package typingsSlinky.rcSteps.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[TagMod[Any]] = js.undefined
  var finish: js.UndefOr[TagMod[Any]] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: TagMod[Any] = null, finish: TagMod[Any] = null): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

