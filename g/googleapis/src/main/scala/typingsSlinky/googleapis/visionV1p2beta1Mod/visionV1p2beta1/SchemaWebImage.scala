package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for online images.
  */
@js.native
trait SchemaWebImage extends StObject {
  
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaWebImage {
  
  @scala.inline
  def apply(): SchemaWebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebImage]
  }
  
  @scala.inline
  implicit class SchemaWebImageMutableBuilder[Self <: SchemaWebImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
