package typingsSlinky.rcSelect.anon

import typingsSlinky.rcSelect.optionListMod.OptionListProps
import typingsSlinky.rcSelect.optionListMod.RefOptionListProps
import typingsSlinky.rcSelect.rcSelectStrings.options
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionList[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var optionList: ForwardRefExoticComponent[
    (PropsWithoutRef[(Omit[OptionListProps[OptionsType], options]) with Options[OptionsType]]) with RefAttributes[RefOptionListProps]
  ] = js.native
}
object OptionList {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](
    optionList: ForwardRefExoticComponent[
      (PropsWithoutRef[(Omit[OptionListProps[OptionsType], options]) with Options[OptionsType]]) with RefAttributes[RefOptionListProps]
    ]
  ): OptionList[OptionsType] = {
    val __obj = js.Dynamic.literal(optionList = optionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionList[OptionsType]]
  }
  
  @scala.inline
  implicit class OptionListMutableBuilder[Self <: OptionList[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with OptionList[OptionsType]) extends AnyVal {
    
    @scala.inline
    def setOptionList(
      value: ForwardRefExoticComponent[
          (PropsWithoutRef[(Omit[OptionListProps[OptionsType], options]) with Options[OptionsType]]) with RefAttributes[RefOptionListProps]
        ]
    ): Self = StObject.set(x, "optionList", value.asInstanceOf[js.Any])
  }
}
