package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object Anon19 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiGcmInstallationResponse => js.Any): Anon19 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon19]
  }
}

