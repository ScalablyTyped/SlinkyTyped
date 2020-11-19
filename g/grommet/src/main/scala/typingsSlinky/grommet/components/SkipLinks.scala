package typingsSlinky.grommet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.SkipTo
import typingsSlinky.grommet.skipLinksMod.SkipLinksProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkipLinks {
  
  @JSImport("grommet/es6", "SkipLinks")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def messages(value: SkipTo): this.type = set("messages", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkipLinksProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SkipLinks.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
