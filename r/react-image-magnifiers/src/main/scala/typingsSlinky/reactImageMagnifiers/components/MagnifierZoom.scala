package typingsSlinky.reactImageMagnifiers.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageMagnifiers.mod.MagnifierZoomProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MagnifierZoom {
  
  @JSImport("react-image-magnifiers", "MagnifierZoom")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onImageLoad(value: /* ev */ SyntheticEvent[Event, Element] => Unit): this.type = set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MagnifierZoomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(imageSrc: String): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MagnifierZoomProps]))
  }
}
