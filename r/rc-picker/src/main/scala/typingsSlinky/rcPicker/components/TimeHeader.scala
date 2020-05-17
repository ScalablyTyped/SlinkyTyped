package typingsSlinky.rcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.timeHeaderMod.TimeHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimeHeader {
  @JSImport("rc-picker/lib/panels/TimePanel/TimeHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps[DateType](p: TimeHeaderProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[DateType](format: String, generateConfig: GenerateConfig[DateType], locale: Locale, prefixCls: String): Builder[DateType] = {
    val __props = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[TimeHeaderProps[DateType]]))
  }
}

