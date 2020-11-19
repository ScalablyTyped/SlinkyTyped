package typingsSlinky.reactSketchapp.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.defsMod.DefsProps
import typingsSlinky.reactSketchapp.defsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Defs {
  
  @JSImport("react-sketchapp/lib/components/Svg/Defs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Defs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
