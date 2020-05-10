package typingsSlinky.fineUploader.azureMod.azure

import typingsSlinky.fineUploader.coreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureResumableFileObject extends ResumableFileObject {
  /**
    * The associated file's blob name in Azure Blob Storage
    */
  var key: js.UndefOr[String] = js.native
}

object AzureResumableFileObject {
  @scala.inline
  def apply(): AzureResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureResumableFileObject]
  }
  @scala.inline
  implicit class AzureResumableFileObjectOps[Self <: AzureResumableFileObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

