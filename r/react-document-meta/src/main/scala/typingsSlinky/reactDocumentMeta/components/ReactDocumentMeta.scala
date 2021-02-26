package typingsSlinky.reactDocumentMeta.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDocumentMeta.mod.DocumentMetaProps
import typingsSlinky.reactDocumentMeta.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDocumentMeta {
  
  @JSImport("react-document-meta", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def canonical(value: String): this.type = set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDocumentMeta.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DocumentMetaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
