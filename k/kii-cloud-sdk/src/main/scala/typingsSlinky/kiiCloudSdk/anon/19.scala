package typingsSlinky.kiiCloudSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `19` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(): js.Any
}

object `19` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: () => js.Any): `19` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`19`]
  }
}

