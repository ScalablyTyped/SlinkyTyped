package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSettings extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: PpMouseActivation): ActionSetting = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ActionSettings_typekey")
  var PowerPointDotActionSettings_typekey: ActionSettings = js.native
}
object ActionSettings {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpMouseActivation => ActionSetting,
    Parent: js.Any,
    PowerPointDotActionSettings_typekey: ActionSettings
  ): ActionSettings = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ActionSettings_typekey")(PowerPointDotActionSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSettings]
  }
  
  @scala.inline
  implicit class ActionSettingsMutableBuilder[Self <: ActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: PpMouseActivation => ActionSetting): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotActionSettings_typekey(value: ActionSettings): Self = StObject.set(x, "PowerPoint.ActionSettings_typekey", value.asInstanceOf[js.Any])
  }
}
