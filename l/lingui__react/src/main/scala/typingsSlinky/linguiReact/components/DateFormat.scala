package typingsSlinky.linguiReact.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateFormat {
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.linguiReact.mod.DateFormat] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: DateTimeFormatOptions): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def renderReactElement(value: ReactElement): this.type = set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: TagMod[Any]): this.type = set("render", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: js.Date): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]]))
  }
}

