package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeProperties extends StObject {
  
  /**
    * The alignment of the content in the shape. If unspecified, the alignment is inherited from a parent placeholder if it exists. If the shape has no parent, the default alignment
    * matches the alignment for new shapes created in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  
  /** The hyperlink destination of the shape. If unset, there is no link. Links are not inherited from parent placeholders. */
  var link: js.UndefOr[Link] = js.native
  
  /**
    * The outline of the shape. If unset, the outline is inherited from a parent placeholder if it exists. If the shape has no parent, then the default outline depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.native
  
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited from a parent placeholder if it exists. If the shape has no parent, then the default shadow matches the
    * defaults for new shapes created in the Slides editor. This property is read-only.
    */
  var shadow: js.UndefOr[Shadow] = js.native
  
  /**
    * The background fill of the shape. If unset, the background fill is inherited from a parent placeholder if it exists. If the shape has no parent, then the default background fill
    * depends on the shape type, matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.native
}
object ShapeProperties {
  
  @scala.inline
  def apply(): ShapeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeProperties]
  }
  
  @scala.inline
  implicit class ShapePropertiesMutableBuilder[Self <: ShapeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShapeBackgroundFill(value: ShapeBackgroundFill): Self = StObject.set(x, "shapeBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeBackgroundFillUndefined: Self = StObject.set(x, "shapeBackgroundFill", js.undefined)
  }
}
