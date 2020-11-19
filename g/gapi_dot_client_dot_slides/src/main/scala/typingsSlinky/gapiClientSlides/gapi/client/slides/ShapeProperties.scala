package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeProperties extends js.Object {
  
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[Link] = js.native
  
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for
    * new shapes created in the Slides editor.
    */
  var outline: js.UndefOr[Outline] = js.native
  
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited from
    * a parent placeholder if it exists. If the shape has no parent, then the
    * default shadow matches the defaults for new shapes created in the Slides
    * editor. This property is read-only.
    */
  var shadow: js.UndefOr[Shadow] = js.native
  
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
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
  implicit class ShapePropertiesOps[Self <: ShapeProperties] (val x: Self) extends AnyVal {
    
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
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setOutline(value: Outline): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setShadow(value: Shadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShapeBackgroundFill(value: ShapeBackgroundFill): Self = this.set("shapeBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeBackgroundFill: Self = this.set("shapeBackgroundFill", js.undefined)
  }
}
