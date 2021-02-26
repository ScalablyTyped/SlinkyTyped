package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.anon.IHotkeysPropschildrenReac
import typingsSlinky.blueprintjsCore.anon.TabIndex
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.hotkeysTypesMod.IHotkeysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysHotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys")
  @js.native
  class Hotkeys protected ()
    extends AbstractPureComponent2[IHotkeysProps, js.Object, js.Object] {
    def this(props: IHotkeysProps) = this()
    def this(props: IHotkeysProps, context: js.Any) = this()
    
    /* protected */ def validateProps(props: IHotkeysPropschildrenReac): Unit = js.native
  }
  /* static members */
  object Hotkeys {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    @scala.inline
    def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
