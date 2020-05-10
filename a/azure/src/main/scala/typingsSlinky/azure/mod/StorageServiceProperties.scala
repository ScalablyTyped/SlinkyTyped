package typingsSlinky.azure.mod

import typingsSlinky.azure.AnonDelete
import typingsSlinky.azure.AnonEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageServiceProperties extends js.Object {
  var DefaultServiceVersion: String = js.native
  var Logging: AnonDelete = js.native
  var Metrics: AnonEnabled = js.native
}

object StorageServiceProperties {
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: AnonDelete, Metrics: AnonEnabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceProperties]
  }
  @scala.inline
  implicit class StorageServicePropertiesOps[Self <: StorageServiceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultServiceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultServiceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogging(value: AnonDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

