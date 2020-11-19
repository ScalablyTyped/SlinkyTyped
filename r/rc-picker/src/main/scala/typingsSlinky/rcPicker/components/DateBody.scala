package typingsSlinky.rcPicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.dateBodyMod.DateBodyProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateBody {
  
  @JSImport("rc-picker/es/panels/DatePanel/DateBody", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixColumn(value: DateType => ReactElement): this.type = set("prefixColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowClassName(value: DateType => String): this.type = set("rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps[DateType](p: DateBodyProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: DateType => Unit,
    prefixCls: String,
    rowCount: Double,
    viewDate: DateType
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[DateBodyProps[DateType]]))
  }
}
