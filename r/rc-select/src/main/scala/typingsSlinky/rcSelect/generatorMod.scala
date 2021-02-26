package typingsSlinky.rcSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.anon.Dictname
import typingsSlinky.rcSelect.anon.FilterOption
import typingsSlinky.rcSelect.anon.LabelInValue
import typingsSlinky.rcSelect.generateMod.RefSelectProps
import typingsSlinky.rcSelect.generateMod.SelectProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorMod {
  
  @JSImport("rc-select/lib/interface/generator", "INTERNAL_PROPS_MARK")
  @js.native
  val INTERNAL_PROPS_MARK: /* "RC_SELECT_INTERNAL_PROPS_MARK" */ String = js.native
  
  @JSImport("rc-select/lib/interface/generator", "RefSelectFunc")
  @js.native
  def RefSelectFunc[OptionsType /* <: js.Array[js.Object] */, ValueType](Component: ReactComponentClass[RefSelectProps]): ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) with RefAttributes[RefSelectProps]
  ] = js.native
  
  @js.native
  trait CustomTagProps extends StObject {
    
    var closable: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var label: DefaultValueType = js.native
    
    def onClose(): Unit = js.native
    def onClose(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    var value: DefaultValueType = js.native
  }
  
  type DefaultValueType = RawValueType | (js.Array[LabelValueType | RawValueType]) | LabelValueType
  
  @js.native
  trait DisplayLabelValueType extends LabelValueType {
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object DisplayLabelValueType {
    
    @scala.inline
    def apply(): DisplayLabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayLabelValueType]
    }
    
    @scala.inline
    implicit class DisplayLabelValueTypeMutableBuilder[Self <: DisplayLabelValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  type FilterFunc[OptionType] = js.Function2[/* inputValue */ String, /* option */ js.UndefOr[OptionType], Boolean]
  
  type FilterOptions[OptionsType /* <: js.Array[js.Object] */] = js.Function3[
    /* searchValue */ String, 
    /* options */ OptionsType, 
    /* config */ FilterOption[OptionsType], 
    OptionsType
  ]
  
  type FlattenOptionsType[OptionsType /* <: js.Array[js.Object] */] = js.Array[Dictname[OptionsType]]
  
  type GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] = js.Function2[/* value */ RawValueType, /* config */ LabelInValue[FOT], LabelValueType]
  
  type Key = String | Double
  
  @js.native
  trait LabelValueType extends StObject {
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object LabelValueType {
    
    @scala.inline
    def apply(): LabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelValueType]
    }
    
    @scala.inline
    implicit class LabelValueTypeMutableBuilder[Self <: LabelValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type OnClear = js.Function0[Unit]
  
  type RawValueType = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcSelect.rcSelectStrings.option
    - typingsSlinky.rcSelect.rcSelectStrings.selection
    - typingsSlinky.rcSelect.rcSelectStrings.input
  */
  trait SelectSource extends StObject
  object SelectSource {
    
    @scala.inline
    def input: typingsSlinky.rcSelect.rcSelectStrings.input = "input".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.input]
    
    @scala.inline
    def option: typingsSlinky.rcSelect.rcSelectStrings.option = "option".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.option]
    
    @scala.inline
    def selection: typingsSlinky.rcSelect.rcSelectStrings.selection = "selection".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.selection]
  }
  
  type SingleType[MixType] = MixType
}
