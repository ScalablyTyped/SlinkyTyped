package typingsSlinky.kiiDashCloudDashSdk

import typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSuccess extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing): js.Any
}

object Anon_ErrorFailureSuccess {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiThing => js.Any): Anon_ErrorFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSuccess]
  }
}

