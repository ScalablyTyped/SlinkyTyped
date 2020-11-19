package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.Name
import typingsSlinky.cathoQuantum.anon.`1`
import typingsSlinky.cathoQuantum.socialsMod.NonEmptyArray
import typingsSlinky.cathoQuantum.socialsMod.SocialsProps
import typingsSlinky.cathoQuantum.socialsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Socials {
  
  @JSImport("@catho/quantum/Socials", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: `1`): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withBox(value: Boolean): this.type = set("withBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(items: NonEmptyArray[Name]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialsProps]))
  }
}
