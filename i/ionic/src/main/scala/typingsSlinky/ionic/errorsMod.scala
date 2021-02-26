package typingsSlinky.ionic

import typingsSlinky.ionicCliFramework.mod.BaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("ionic/lib/errors", "BaseException")
  @js.native
  class BaseException protected () extends BaseError {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "BuildCLIProgramNotFoundException")
  @js.native
  class BuildCLIProgramNotFoundException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "FatalException")
  @js.native
  class FatalException () extends BaseException {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], exitCode: Double) = this()
    def this(message: String, exitCode: Double) = this()
    
    @JSName("exitCode")
    var exitCode_FatalException: Double = js.native
    
    var fatal: Boolean = js.native
  }
  
  @JSImport("ionic/lib/errors", "HookException")
  @js.native
  class HookException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "IntegrationException")
  @js.native
  class IntegrationException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "IntegrationNotFoundException")
  @js.native
  class IntegrationNotFoundException protected () extends IntegrationException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "RunnerException")
  @js.native
  class RunnerException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "RunnerNotFoundException")
  @js.native
  class RunnerNotFoundException protected () extends RunnerException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "ServeCLIProgramNotFoundException")
  @js.native
  class ServeCLIProgramNotFoundException protected () extends BaseException {
    def this(message: String) = this()
  }
  
  @JSImport("ionic/lib/errors", "SessionException")
  @js.native
  class SessionException protected () extends BaseException {
    def this(message: String) = this()
  }
}
