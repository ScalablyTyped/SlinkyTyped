package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `18` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object `18` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiMqttEndpoint => js.Any): `18` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`18`]
  }
}

