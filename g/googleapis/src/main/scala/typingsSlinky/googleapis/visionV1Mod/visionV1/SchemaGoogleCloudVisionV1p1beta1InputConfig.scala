package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired input location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1InputConfig extends js.Object {
  
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1GcsSource] = js.native
  
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1InputConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1InputConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1InputConfigOps[Self <: SchemaGoogleCloudVisionV1p1beta1InputConfig] (val x: Self) extends AnyVal {
    
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
    def setGcsSource(value: SchemaGoogleCloudVisionV1p1beta1GcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
