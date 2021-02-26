package typingsSlinky.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceSettings extends StObject {
  
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.native
  
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.native
  
  var synchronizeTabs: js.UndefOr[Boolean] = js.native
}
object PersistenceSettings {
  
  @scala.inline
  def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  
  @scala.inline
  implicit class PersistenceSettingsMutableBuilder[Self <: PersistenceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentalForceOwningTab(value: Boolean): Self = StObject.set(x, "experimentalForceOwningTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalForceOwningTabUndefined: Self = StObject.set(x, "experimentalForceOwningTab", js.undefined)
    
    @scala.inline
    def setExperimentalTabSynchronization(value: Boolean): Self = StObject.set(x, "experimentalTabSynchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalTabSynchronizationUndefined: Self = StObject.set(x, "experimentalTabSynchronization", js.undefined)
    
    @scala.inline
    def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronizeTabsUndefined: Self = StObject.set(x, "synchronizeTabs", js.undefined)
  }
}
