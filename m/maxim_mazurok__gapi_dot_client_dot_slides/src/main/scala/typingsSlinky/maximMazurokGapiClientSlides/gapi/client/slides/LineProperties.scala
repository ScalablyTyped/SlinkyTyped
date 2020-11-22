package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineProperties extends js.Object {
  
  /** The dash style of the line. */
  var dashStyle: js.UndefOr[String] = js.native
  
  /** The style of the arrow at the end of the line. */
  var endArrow: js.UndefOr[String] = js.native
  
  /** The connection at the end of the line. If unset, there is no connection. Only lines with a Type indicating it is a "connector" can have an `end_connection`. */
  var endConnection: js.UndefOr[LineConnection] = js.native
  
  /** The fill of the line. The default line fill matches the defaults for new lines created in the Slides editor. */
  var lineFill: js.UndefOr[LineFill] = js.native
  
  /** The hyperlink destination of the line. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.native
  
  /** The style of the arrow at the beginning of the line. */
  var startArrow: js.UndefOr[String] = js.native
  
  /** The connection at the beginning of the line. If unset, there is no connection. Only lines with a Type indicating it is a "connector" can have a `start_connection`. */
  var startConnection: js.UndefOr[LineConnection] = js.native
  
  /** The thickness of the line. */
  var weight: js.UndefOr[Dimension] = js.native
}
object LineProperties {
  
  @scala.inline
  def apply(): LineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProperties]
  }
  
  @scala.inline
  implicit class LinePropertiesOps[Self <: LineProperties] (val x: Self) extends AnyVal {
    
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
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setEndArrow(value: String): Self = this.set("endArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndArrow: Self = this.set("endArrow", js.undefined)
    
    @scala.inline
    def setEndConnection(value: LineConnection): Self = this.set("endConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndConnection: Self = this.set("endConnection", js.undefined)
    
    @scala.inline
    def setLineFill(value: LineFill): Self = this.set("lineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineFill: Self = this.set("lineFill", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setStartArrow(value: String): Self = this.set("startArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartArrow: Self = this.set("startArrow", js.undefined)
    
    @scala.inline
    def setStartConnection(value: LineConnection): Self = this.set("startConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartConnection: Self = this.set("startConnection", js.undefined)
    
    @scala.inline
    def setWeight(value: Dimension): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
