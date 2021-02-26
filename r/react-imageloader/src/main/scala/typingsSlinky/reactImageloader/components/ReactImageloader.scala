package typingsSlinky.reactImageloader.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageloader.mod.ImageLoaderProps
import typingsSlinky.reactImageloader.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImageloader {
  
  @scala.inline
  def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageLoaderProps]))
  }
  
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgProps(value: js.Any): this.type = set("imgProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: /* event */ js.Any => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: /* event */ js.Any => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def preloader(value: /* params */ js.Any => ReactElement): this.type = set("preloader", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapper(value: /* props */ js.Any => ReactElement): this.type = set("wrapper", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ImageLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
