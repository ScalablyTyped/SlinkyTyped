package typingsSlinky.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginBottom extends js.Object {
  
  var backgroundColor: String = js.native
  
  var borderRadius: js.UndefOr[scala.Nothing] = js.native
  
  var boxShadow: js.UndefOr[scala.Nothing] = js.native
  
  var color: js.UndefOr[scala.Nothing] = js.native
  
  var display: js.UndefOr[scala.Nothing] = js.native
  
  var float: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: js.UndefOr[scala.Nothing] = js.native
  
  var fontSize: js.UndefOr[scala.Nothing] = js.native
  
  var height: js.UndefOr[scala.Nothing] = js.native
  
  var lineHeight: js.UndefOr[scala.Nothing] = js.native
  
  var listStyleType: js.UndefOr[scala.Nothing] = js.native
  
  var margin: js.UndefOr[scala.Nothing] = js.native
  
  var marginBottom: js.UndefOr[scala.Nothing] = js.native
  
  var marginLeft: js.UndefOr[scala.Nothing] = js.native
  
  var marginRight: js.UndefOr[scala.Nothing] = js.native
  
  var padding: js.UndefOr[scala.Nothing] = js.native
  
  var position: String = js.native
  
  var transition: js.UndefOr[scala.Nothing] = js.native
  
  var visibility: js.UndefOr[scala.Nothing] = js.native
  
  var width: String = js.native
  
  var zIndex: js.UndefOr[scala.Nothing] = js.native
}
object MarginBottom {
  
  @scala.inline
  def apply(backgroundColor: String, position: String, width: String): MarginBottom = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginBottom]
  }
  
  @scala.inline
  implicit class MarginBottomOps[Self <: MarginBottom] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
