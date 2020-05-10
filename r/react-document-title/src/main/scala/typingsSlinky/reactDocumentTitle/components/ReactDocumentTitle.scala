package typingsSlinky.reactDocumentTitle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDocumentTitle.mod.DocumentTitleProps
import typingsSlinky.reactDocumentTitle.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDocumentTitle {
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DocumentTitleProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(title: String): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[DocumentTitleProps]))
  }
}

