package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportLabelsTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
    */
  var InputS3Path: js.UndefOr[UriString] = js.native
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var Replace: js.UndefOr[ReplaceBoolean] = js.native
}

object ImportLabelsTaskRunProperties {
  @scala.inline
  def apply(): ImportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportLabelsTaskRunProperties]
  }
  @scala.inline
  implicit class ImportLabelsTaskRunPropertiesOps[Self <: ImportLabelsTaskRunProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputS3Path(value: UriString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputS3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputS3Path")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: ReplaceBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(js.undefined)
        ret
    }
  }
  
}

