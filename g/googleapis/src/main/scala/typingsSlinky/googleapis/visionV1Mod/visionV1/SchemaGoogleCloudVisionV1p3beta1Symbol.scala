package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single symbol representation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1Symbol extends js.Object {
  
  /**
    * The bounding box for the symbol. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:   * when the text is horizontal it might look
    * like:      0----1      |    |      3----2   * when it&#39;s rotated 180
    * degrees around the top-left corner it becomes:      2----3      |    |
    * 1----0   and the vertice order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = js.native
  
  /**
    * Confidence of the OCR results for the symbol. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Additional information detected for the symbol.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1TextAnnotationTextProperty] = js.native
  
  /**
    * The actual UTF-8 representation of the symbol.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p3beta1Symbol {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1Symbol]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1SymbolOps[Self <: SchemaGoogleCloudVisionV1p3beta1Symbol] (val x: Self) extends AnyVal {
    
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
    def setBoundingBox(value: SchemaGoogleCloudVisionV1p3beta1BoundingPoly): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaGoogleCloudVisionV1p3beta1TextAnnotationTextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
