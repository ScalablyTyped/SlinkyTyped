package typingsSlinky.kiiDashCloudDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorExisted extends js.Object {
  def failure(error: js.Error): js.Any
  def success(existed: Boolean): js.Any
}

object Anon_ErrorExisted {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: Boolean => js.Any): Anon_ErrorExisted = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorExisted]
  }
}

