package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `16` extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object `16` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiGcmInstallationResponse => js.Any): `16` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`16`]
  }
}

