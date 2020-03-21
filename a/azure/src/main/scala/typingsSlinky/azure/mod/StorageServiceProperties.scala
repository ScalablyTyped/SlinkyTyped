package typingsSlinky.azure.mod

import typingsSlinky.azure.AnonDelete
import typingsSlinky.azure.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceProperties extends js.Object {
  var DefaultServiceVersion: String
  var Logging: AnonDelete
  var Metrics: AnonEnabled
}

object StorageServiceProperties {
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: AnonDelete, Metrics: AnonEnabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageServiceProperties]
  }
}

