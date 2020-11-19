package typingsSlinky.rcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.decadeBodyMod.YearBodyProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DecadeBody {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeBody", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
  }
  
  def withProps[DateType](p: YearBodyProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onSelect: DateType => Unit,
    prefixCls: String,
    viewDate: DateType
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[YearBodyProps[DateType]]))
  }
}
