package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import typingsSlinky.rcFieldForm.rcFieldFormStrings.external
import typingsSlinky.rcFieldForm.rcFieldFormStrings.internal
import typingsSlinky.rcFieldForm.rcFieldFormStrings.reset
import typingsSlinky.rcFieldForm.rcFieldFormStrings.setField
import typingsSlinky.rcFieldForm.rcFieldFormStrings.validateFinish
import typingsSlinky.rcFieldForm.rcFieldFormStrings.valueUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typingsSlinky.rcFieldForm.interfaceMod.ValidateFinishInfo
  - typingsSlinky.rcFieldForm.interfaceMod.ResetInfo
  - typingsSlinky.rcFieldForm.interfaceMod.SetFieldInfo
  - typingsSlinky.rcFieldForm.interfaceMod.DependenciesUpdateInfo
*/
trait NotifyInfo extends StObject
object NotifyInfo {
  
  @scala.inline
  def DependenciesUpdateInfo(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): typingsSlinky.rcFieldForm.interfaceMod.DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.DependenciesUpdateInfo]
  }
  
  @scala.inline
  def ResetInfo(`type`: reset): typingsSlinky.rcFieldForm.interfaceMod.ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.ResetInfo]
  }
  
  @scala.inline
  def SetFieldInfo(data: FieldData, `type`: setField): typingsSlinky.rcFieldForm.interfaceMod.SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.SetFieldInfo]
  }
  
  @scala.inline
  def ValidateFinishInfo(`type`: validateFinish): typingsSlinky.rcFieldForm.interfaceMod.ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.ValidateFinishInfo]
  }
  
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): typingsSlinky.rcFieldForm.interfaceMod.ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.ValueUpdateInfo]
  }
}
