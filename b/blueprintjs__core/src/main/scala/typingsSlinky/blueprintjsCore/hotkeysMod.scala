package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.blueprintjsCore.anon.AllowInInput
import typingsSlinky.blueprintjsCore.anon.DisplayName
import typingsSlinky.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typingsSlinky.blueprintjsCore.anon.TabIndex
import typingsSlinky.blueprintjsCore.constructorMod.IConstructor
import typingsSlinky.blueprintjsCore.hotkeyParserMod.IKeyCombo
import typingsSlinky.blueprintjsCore.hotkeysTargetMod.IHotkeysTargetComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys", JSImport.Namespace)
@js.native
object hotkeysMod extends js.Object {
  @js.native
  class Hotkey ()
    extends typingsSlinky.blueprintjsCore.hotkeyMod.Hotkey
  
  @js.native
  class Hotkeys ()
    extends typingsSlinky.blueprintjsCore.hotkeysHotkeysMod.Hotkeys
  
  @js.native
  class KeyCombo ()
    extends typingsSlinky.blueprintjsCore.keyComboMod.KeyCombo
  
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName with T = js.native
  def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = js.native
  def getKeyCombo(e: KeyboardEvent): IKeyCombo = js.native
  def getKeyComboString(e: KeyboardEvent): String = js.native
  def hideHotkeysDialog(): Unit = js.native
  def parseKeyCombo(combo: String): IKeyCombo = js.native
  def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = js.native
  /* static members */
  @js.native
  object Hotkey extends js.Object {
    var defaultProps: AllowInInput = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object Hotkeys extends js.Object {
    var defaultProps: TabIndex = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object KeyCombo extends js.Object {
    var displayName: String = js.native
  }
  
}

