package typingsSlinky.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignX extends js.Object {
  
  var alignX: String = js.native
  
  var alignY: String = js.native
  
  var animate: Boolean = js.native
  
  var animateOption: Appear = js.native
  
  var capture: Boolean = js.native
  
  var containerTpl: String = js.native
  
  var events: js.Any = js.native
  
  var html: String = js.native
  
  var id: String = js.native
  
  var locationType: String = js.native
  
  var name: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var `type`: String = js.native
  
  var updateAutoRender: Boolean = js.native
  
  var visible: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var zIndex: Double = js.native
}
object AlignX {
  
  @scala.inline
  def apply(
    alignX: String,
    alignY: String,
    animate: Boolean,
    animateOption: Appear,
    capture: Boolean,
    containerTpl: String,
    events: js.Any,
    html: String,
    id: String,
    locationType: String,
    name: String,
    offsetX: Double,
    offsetY: Double,
    `type`: String,
    updateAutoRender: Boolean,
    visible: Boolean,
    x: Double,
    y: Double,
    zIndex: Double
  ): AlignX = {
    val __obj = js.Dynamic.literal(alignX = alignX.asInstanceOf[js.Any], alignY = alignY.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateOption = animateOption.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], containerTpl = containerTpl.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], updateAutoRender = updateAutoRender.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignX]
  }
  
  @scala.inline
  implicit class AlignXOps[Self <: AlignX] (val x: Self) extends AnyVal {
    
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
    def setAlignX(value: String): Self = this.set("alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignY(value: String): Self = this.set("alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateOption(value: Appear): Self = this.set("animateOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoRender(value: Boolean): Self = this.set("updateAutoRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
}
