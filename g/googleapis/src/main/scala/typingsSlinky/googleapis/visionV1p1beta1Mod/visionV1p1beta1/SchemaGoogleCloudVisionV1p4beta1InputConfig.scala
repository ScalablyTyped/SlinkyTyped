package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired input location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1InputConfig extends js.Object {
  
  /**
    * File content, represented as a stream of bytes. Note: As with all `bytes`
    * fields, protobuffers use a pure binary representation, whereas JSON
    * representations use base64.  Currently, this field only works for
    * BatchAnnotateFiles requests. It does not work for AsyncBatchAnnotateFiles
    * requests.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1GcsSource] = js.native
  
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1InputConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1InputConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1InputConfigOps[Self <: SchemaGoogleCloudVisionV1p4beta1InputConfig] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudVisionV1p4beta1GcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
