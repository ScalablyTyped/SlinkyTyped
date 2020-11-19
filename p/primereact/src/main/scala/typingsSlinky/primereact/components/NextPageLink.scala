package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.nextPageLinkMod.NextPageLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NextPageLink {
  
  @JSImport("primereact/components/paginator/NextPageLink", "NextPageLink")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.nextPageLinkMod.NextPageLink] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
  }
  
  def withProps(p: NextPageLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NextPageLink.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
