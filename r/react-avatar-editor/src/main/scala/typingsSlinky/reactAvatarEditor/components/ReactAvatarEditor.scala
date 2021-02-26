package typingsSlinky.reactAvatarEditor.components

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.File
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAvatarEditor.mod.AvatarEditorProps
import typingsSlinky.reactAvatarEditor.mod.ImageState
import typingsSlinky.reactAvatarEditor.mod.Position
import typingsSlinky.reactAvatarEditor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAvatarEditor {
  
  @scala.inline
  def apply(image: String | File): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarEditorProps]))
  }
  
  @JSImport("react-avatar-editor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def border(value: Double | js.Array[Double]): this.type = set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderVarargs(value: Double*): this.type = set("border", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: js.Array[Double]): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorVarargs(value: Double*): this.type = set("color", js.Array(value :_*))
    
    @scala.inline
    def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableBoundaryChecks(value: Boolean): this.type = set("disableBoundaryChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableDrop(value: Boolean): this.type = set("disableDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDropFile(value: /* event */ DragEvent => Unit): this.type = set("onDropFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def onImageChange(value: () => Unit): this.type = set("onImageChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def onImageReady(value: /* event */ Event => Unit): this.type = set("onImageReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadFailure(value: /* event */ Event => Unit): this.type = set("onLoadFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadSuccess(value: /* imgInfo */ ImageState => Unit): this.type = set("onLoadSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* event */ Event => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: () => Unit): this.type = set("onMouseUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPositionChange(value: /* position */ Position => Unit): this.type = set("onPositionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
