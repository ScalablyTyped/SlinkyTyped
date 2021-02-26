package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.center
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignmentMod {
  
  /* Inlined {  CENTER :'center',   LEFT :'left',   RIGHT :'right'}[keyof {  CENTER :'center',   LEFT :'left',   RIGHT :'right'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.center
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.CENTER")
    @js.native
    def CENTER: center = js.native
    @scala.inline
    def CENTER_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.LEFT")
    @js.native
    def LEFT: left = js.native
    @scala.inline
    def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.RIGHT")
    @js.native
    def RIGHT: right = js.native
    @scala.inline
    def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
}
