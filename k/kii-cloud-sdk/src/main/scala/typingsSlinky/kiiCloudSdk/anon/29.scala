package typingsSlinky.kiiCloudSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `29` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(existed: Boolean): js.Any
}

object `29` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: Boolean => js.Any): `29` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`29`]
  }
}

