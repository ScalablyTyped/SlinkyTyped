package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object Anon21 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiMqttEndpoint => js.Any): Anon21 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon21]
  }
}

