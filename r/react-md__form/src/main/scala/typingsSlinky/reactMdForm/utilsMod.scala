package typingsSlinky.reactMdForm

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactMdList.getListItemHeightMod.SimpleListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/form/types/select/utils", "defaultIsOptionDisabled")
  @js.native
  def defaultIsOptionDisabled(option: ListboxOption): Boolean = js.native
  
  @JSImport("@react-md/form/types/select/utils", "getDisplayLabel")
  @js.native
  def getDisplayLabel(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactElement = js.native
  
  @JSImport("@react-md/form/types/select/utils", "getOptionId")
  @js.native
  def getOptionId(baseId: String, index: Double): String = js.native
  
  @JSImport("@react-md/form/types/select/utils", "getOptionLabel")
  @js.native
  def getOptionLabel(option: ListboxOption, labelKey: String): ReactElement = js.native
  
  @JSImport("@react-md/form/types/select/utils", "isListboxOptionProps")
  @js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
  
  type ListboxOption = ListboxOptionProps | String | Double | Null
  
  @js.native
  trait ListboxOptionProps
    extends SimpleListItemProps
       with /* labelKey */ StringDictionary[ReactElement]
  object ListboxOptionProps {
    
    @scala.inline
    def apply(): ListboxOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListboxOptionProps]
    }
  }
}
