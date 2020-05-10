package typingsSlinky.reactIntl.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.reactIntl.mod.Props3
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedHTMLMessage {
  @JSImport("react-intl", "FormattedHTMLMessage")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactIntl.mod.FormattedHTMLMessage] {
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
  
  def withProps(p: Props3[Record[String, PrimitiveType]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormattedHTMLMessage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

