package typingsSlinky.reactDocumentTitle.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactDocumentTitle.mod.DocumentTitleProps
import typingsSlinky.reactDocumentTitle.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDocumentTitle {
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def children(value: ReactChild): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenNull: this.type = set("children", null)
  }
  
  def withProps(p: DocumentTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DocumentTitleProps]))
  }
}

