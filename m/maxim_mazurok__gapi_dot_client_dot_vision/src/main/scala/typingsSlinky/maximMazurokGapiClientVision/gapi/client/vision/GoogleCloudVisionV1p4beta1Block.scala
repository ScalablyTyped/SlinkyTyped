package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1Block extends StObject {
  
  /** Detected block type (text, image etc) for this block. */
  var blockType: js.UndefOr[String] = js.native
  
  /**
    * The bounding box for the block. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
    * represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | |
    * 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[GoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /** Confidence of the OCR results on the block. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** List of paragraphs in this block (if this blocks is of type text). */
  var paragraphs: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1Paragraph]] = js.native
  
  /** Additional information detected for the block. */
  var property: js.UndefOr[GoogleCloudVisionV1p4beta1TextAnnotationTextProperty] = js.native
}
object GoogleCloudVisionV1p4beta1Block {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1Block]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1BlockMutableBuilder[Self <: GoogleCloudVisionV1p4beta1Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockType(value: String): Self = StObject.set(x, "blockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockTypeUndefined: Self = StObject.set(x, "blockType", js.undefined)
    
    @scala.inline
    def setBoundingBox(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setParagraphs(value: js.Array[GoogleCloudVisionV1p4beta1Paragraph]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: GoogleCloudVisionV1p4beta1Paragraph*): Self = StObject.set(x, "paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setProperty(value: GoogleCloudVisionV1p4beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
