package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerVersionContentOutput extends StObject {
  
  /**
    * The SHA-256 hash of the layer archive.
    */
  var CodeSha256: js.UndefOr[String] = js.native
  
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.native
  
  /**
    * A link to the layer archive in Amazon S3 that is valid for 10 minutes.
    */
  var Location: js.UndefOr[String] = js.native
}
object LayerVersionContentOutput {
  
  @scala.inline
  def apply(): LayerVersionContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionContentOutput]
  }
  
  @scala.inline
  implicit class LayerVersionContentOutputMutableBuilder[Self <: LayerVersionContentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    @scala.inline
    def setCodeSize(value: Long): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
