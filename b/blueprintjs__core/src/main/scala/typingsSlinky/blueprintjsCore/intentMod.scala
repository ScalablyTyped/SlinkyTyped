package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.danger
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.primary
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.success
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intentMod {
  
  /* Inlined {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}[keyof {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.primary
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.danger
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.warning
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.success
  */
  trait Intent extends StObject
  object Intent {
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.DANGER")
    @js.native
    def DANGER: danger = js.native
    @scala.inline
    def DANGER_=(x: danger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DANGER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.NONE")
    @js.native
    def NONE: none = js.native
    @scala.inline
    def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.PRIMARY")
    @js.native
    def PRIMARY: primary = js.native
    @scala.inline
    def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.SUCCESS")
    @js.native
    def SUCCESS: success = js.native
    @scala.inline
    def SUCCESS_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.WARNING")
    @js.native
    def WARNING: warning = js.native
    @scala.inline
    def WARNING_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
}
