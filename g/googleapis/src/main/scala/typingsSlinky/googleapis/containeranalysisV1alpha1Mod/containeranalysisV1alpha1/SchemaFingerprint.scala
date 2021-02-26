package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of properties that uniquely identify a given Docker image.
  */
@js.native
trait SchemaFingerprint extends StObject {
  
  /**
    * The layer-id of the final layer in the Docker image&#39;s v1
    * representation. This field can be used as a filter in list requests.
    */
  var v1Name: js.UndefOr[String] = js.native
  
  /**
    * The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The name of the image&#39;s v2 blobs computed via: [bottom]
    * := v2_blobbottom := sha256(v2_blob[N] + &quot; &quot; + v2_name[N+1])
    * Only the name of the final blob is kept. This field can be used as a
    * filter in list requests.
    */
  var v2Name: js.UndefOr[String] = js.native
}
object SchemaFingerprint {
  
  @scala.inline
  def apply(): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFingerprint]
  }
  
  @scala.inline
  implicit class SchemaFingerprintMutableBuilder[Self <: SchemaFingerprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setV1Name(value: String): Self = StObject.set(x, "v1Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV1NameUndefined: Self = StObject.set(x, "v1Name", js.undefined)
    
    @scala.inline
    def setV2Blob(value: js.Array[String]): Self = StObject.set(x, "v2Blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV2BlobUndefined: Self = StObject.set(x, "v2Blob", js.undefined)
    
    @scala.inline
    def setV2BlobVarargs(value: String*): Self = StObject.set(x, "v2Blob", js.Array(value :_*))
    
    @scala.inline
    def setV2Name(value: String): Self = StObject.set(x, "v2Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV2NameUndefined: Self = StObject.set(x, "v2Name", js.undefined)
  }
}
