package typingsSlinky.reactour.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactour.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("reactour", "Badge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
