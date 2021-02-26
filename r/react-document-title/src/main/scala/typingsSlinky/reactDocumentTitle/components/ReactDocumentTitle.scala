package typingsSlinky.reactDocumentTitle.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactDocumentTitle.mod.DocumentTitleProps
import typingsSlinky.reactDocumentTitle.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDocumentTitle {
  
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DocumentTitleProps]))
  }
  
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def children(value: ReactChild): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenNull: this.type = set("children", null)
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DocumentTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
