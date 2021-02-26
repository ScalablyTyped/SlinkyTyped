package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosTest extends StObject {
  
  /** Information about the application under test. */
  var iosAppInfo: js.UndefOr[IosAppInfo] = js.native
  
  /** An iOS Robo test. */
  var iosRoboTest: js.UndefOr[js.Any] = js.native
  
  /** An iOS test loop. */
  var iosTestLoop: js.UndefOr[IosTestLoop] = js.native
  
  /** An iOS XCTest. */
  var iosXcTest: js.UndefOr[IosXcTest] = js.native
  
  /** Max time a test is allowed to run before it is automatically cancelled. */
  var testTimeout: js.UndefOr[Duration] = js.native
}
object IosTest {
  
  @scala.inline
  def apply(): IosTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTest]
  }
  
  @scala.inline
  implicit class IosTestMutableBuilder[Self <: IosTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosAppInfo(value: IosAppInfo): Self = StObject.set(x, "iosAppInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosAppInfoUndefined: Self = StObject.set(x, "iosAppInfo", js.undefined)
    
    @scala.inline
    def setIosRoboTest(value: js.Any): Self = StObject.set(x, "iosRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosRoboTestUndefined: Self = StObject.set(x, "iosRoboTest", js.undefined)
    
    @scala.inline
    def setIosTestLoop(value: IosTestLoop): Self = StObject.set(x, "iosTestLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosTestLoopUndefined: Self = StObject.set(x, "iosTestLoop", js.undefined)
    
    @scala.inline
    def setIosXcTest(value: IosXcTest): Self = StObject.set(x, "iosXcTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosXcTestUndefined: Self = StObject.set(x, "iosXcTest", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Duration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
