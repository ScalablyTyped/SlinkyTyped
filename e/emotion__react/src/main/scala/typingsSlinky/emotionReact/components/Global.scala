package typingsSlinky.emotionReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionReact.emotionReactMod.GlobalProps
import typingsSlinky.emotionReact.emotionReactMod.Theme
import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global {
  
  @JSImport("@emotion/react", "Global")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def styles(value: Interpolation[Theme]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesNull: this.type = set("styles", null)
  }
  
  def withProps(p: GlobalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Global.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
