package typingsSlinky.rcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.decadeHeaderMod.YearHeaderProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DecadeHeader {
  
  @JSImport("rc-picker/es/panels/DecadePanel/DecadeHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[DateType](p: YearHeaderProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onNextDecades: () => Unit,
    onPrevDecades: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = js.Any.fromFunction0(onNextDecades), onPrevDecades = js.Any.fromFunction0(onPrevDecades), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[YearHeaderProps[DateType]]))
  }
}
