package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosTestLoop extends StObject {
  
  /** Output only. The bundle id for the application under test. */
  var appBundleId: js.UndefOr[String] = js.native
  
  /** Required. The .ipa of the application to test. */
  var appIpa: js.UndefOr[FileReference] = js.native
  
  /** The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified. */
  var scenarios: js.UndefOr[js.Array[Double]] = js.native
}
object IosTestLoop {
  
  @scala.inline
  def apply(): IosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestLoop]
  }
  
  @scala.inline
  implicit class IosTestLoopMutableBuilder[Self <: IosTestLoop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
    
    @scala.inline
    def setAppIpa(value: FileReference): Self = StObject.set(x, "appIpa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIpaUndefined: Self = StObject.set(x, "appIpa", js.undefined)
    
    @scala.inline
    def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    @scala.inline
    def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
  }
}
