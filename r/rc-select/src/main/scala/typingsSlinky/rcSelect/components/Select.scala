package typingsSlinky.rcSelect.components

import typingsSlinky.rcSelect.generateMod.SelectProps
import typingsSlinky.rcSelect.generatorMod.Key
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.optGroupMod.OptGroupProps
import typingsSlinky.rcSelect.optionMod.OptionProps
import typingsSlinky.rcSelect.selectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[VT](p: SelectProps[OptionsType, VT]): SharedBuilder_SelectProps1708738485[default[VT], VT] = new SharedBuilder_SelectProps1708738485[default[VT], VT](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[VT](): SharedBuilder_SelectProps1708738485[default[VT], VT] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_SelectProps1708738485[default[VT], VT](js.Array(this.component, __props.asInstanceOf[SelectProps[OptionsType, VT]]))
  }
  
  implicit def make[VT](companion: Select.type): SharedBuilder_SelectProps1708738485[default[VT], VT] = new SharedBuilder_SelectProps1708738485[default[VT], VT](js.Array(this.component, js.Dictionary.empty))()
  
  object OptGroup {
    
    @JSImport("rc-select/lib/Select", "default.OptGroup")
    @js.native
    object component extends js.Object
    
    def withProps(p: OptGroupProps): SharedBuilder_OptGroupProps_1488126908 = new SharedBuilder_OptGroupProps_1488126908(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: OptGroup.type): SharedBuilder_OptGroupProps_1488126908 = new SharedBuilder_OptGroupProps_1488126908(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Option {
    
    @JSImport("rc-select/lib/Select", "default.Option")
    @js.native
    object component extends js.Object
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps961284514 = new SharedBuilder_OptionProps961284514(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(value: Key): SharedBuilder_OptionProps961284514 = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new SharedBuilder_OptionProps961284514(js.Array(this.component, __props.asInstanceOf[OptionProps]))
    }
  }
}
