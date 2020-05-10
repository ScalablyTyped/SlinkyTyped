package typingsSlinky.reactIntl.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIntl.messageMod.Props
import typingsSlinky.reactIntl.messageMod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Message {
  @JSImport("react-intl/lib/components/message", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[V <: Record[String, js.Any]] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
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
    def values(value: V): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps[V <: Record[String, js.Any]](p: Props[V]): Builder[V] = new Builder[V](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[V <: Record[String, js.Any]](companion: Message.type): Builder[V] = new Builder[V](js.Array(this.component, js.Dictionary.empty))()
}

