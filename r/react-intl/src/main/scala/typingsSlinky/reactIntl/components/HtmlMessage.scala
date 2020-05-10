package typingsSlinky.reactIntl.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.reactIntl.htmlMessageMod.default
import typingsSlinky.reactIntl.messageMod.Props
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HtmlMessage {
  @JSImport("react-intl/lib/components/html-message", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def defaultMessage(value: String): this.type = set("defaultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: String | js.Object): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def tagNameFunctionComponent(value: ReactComponentClass[_]): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def tagNameComponentClass(value: ReactComponentClass[_]): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: ReactElement): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def values(value: Record[String, PrimitiveType]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props[Record[String, PrimitiveType]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HtmlMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

