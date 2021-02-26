package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Allowmergecommit
import typingsSlinky.octokitTypes.anon.Autotriggerchecks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksSetSuitesPreferencesResponseData extends StObject {
  
  var preferences: Autotriggerchecks = js.native
  
  var repository: Allowmergecommit = js.native
}
object ChecksSetSuitesPreferencesResponseData {
  
  @scala.inline
  def apply(preferences: Autotriggerchecks, repository: Allowmergecommit): ChecksSetSuitesPreferencesResponseData = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponseData]
  }
  
  @scala.inline
  implicit class ChecksSetSuitesPreferencesResponseDataMutableBuilder[Self <: ChecksSetSuitesPreferencesResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferences(value: Autotriggerchecks): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Allowmergecommit): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
