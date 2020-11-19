package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactMdUtils.movementTypesMod.FocusType
import typingsSlinky.reactMdUtils.movementTypesMod.KeyConfig
import typingsSlinky.reactMdUtils.movementTypesMod.MovementKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/wia-aria/movement/utils", JSImport.Namespace)
@js.native
object movementUtilsMod extends js.Object {
  
  def getItemId(id: String, i: Double): String = js.native
  
  def getKeyboardConfig(event: SyntheticKeyboardEvent[Element], keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  def getKeyboardConfig(event: KeyboardEvent, keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  
  def getStringifiedKeyConfig(config: KeyConfig): String = js.native
  
  def transformKeys(keys: js.Array[MovementKey], `type`: FocusType): js.Array[KeyConfig] = js.native
}
