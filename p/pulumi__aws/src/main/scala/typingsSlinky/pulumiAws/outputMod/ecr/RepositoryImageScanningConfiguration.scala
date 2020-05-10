package typingsSlinky.pulumiAws.outputMod.ecr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryImageScanningConfiguration extends js.Object {
  /**
    * Indicates whether images are scanned after being pushed to the repository (true) or not scanned (false).
    */
  var scanOnPush: Boolean = js.native
}

object RepositoryImageScanningConfiguration {
  @scala.inline
  def apply(scanOnPush: Boolean): RepositoryImageScanningConfiguration = {
    val __obj = js.Dynamic.literal(scanOnPush = scanOnPush.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryImageScanningConfiguration]
  }
  @scala.inline
  implicit class RepositoryImageScanningConfigurationOps[Self <: RepositoryImageScanningConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScanOnPush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanOnPush")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

