package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportLabelsTaskRunProperties extends js.Object {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will export the labels.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.native
}
object ExportLabelsTaskRunProperties {
  
  @scala.inline
  def apply(): ExportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLabelsTaskRunProperties]
  }
  
  @scala.inline
  implicit class ExportLabelsTaskRunPropertiesOps[Self <: ExportLabelsTaskRunProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputS3Path(value: UriString): Self = this.set("OutputS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3Path: Self = this.set("OutputS3Path", js.undefined)
  }
}
