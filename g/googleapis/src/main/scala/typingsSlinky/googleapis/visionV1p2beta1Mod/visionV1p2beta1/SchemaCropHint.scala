package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Single crop hint that is used to generate a new crop when serving an image.
  */
@js.native
trait SchemaCropHint extends StObject {
  
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image&#39;s scale.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
  
  /**
    * Confidence of this being a salient region.  Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Fraction of importance of this salient region with respect to the
    * original image.
    */
  var importanceFraction: js.UndefOr[Double] = js.native
}
object SchemaCropHint {
  
  @scala.inline
  def apply(): SchemaCropHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHint]
  }
  
  @scala.inline
  implicit class SchemaCropHintMutableBuilder[Self <: SchemaCropHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setImportanceFraction(value: Double): Self = StObject.set(x, "importanceFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceFractionUndefined: Self = StObject.set(x, "importanceFraction", js.undefined)
  }
}
