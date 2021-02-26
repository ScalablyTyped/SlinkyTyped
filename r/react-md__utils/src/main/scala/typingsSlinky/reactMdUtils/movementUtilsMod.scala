package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactMdUtils.movementTypesMod.FocusType
import typingsSlinky.reactMdUtils.movementTypesMod.KeyConfig
import typingsSlinky.reactMdUtils.movementTypesMod.MovementKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movementUtilsMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", "getItemId")
  @js.native
  def getItemId(id: String, i: Double): String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", "getKeyboardConfig")
  @js.native
  def getKeyboardConfig(event: KeyboardEvent, keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", "getKeyboardConfig")
  @js.native
  def getKeyboardConfig(event: SyntheticKeyboardEvent[Element], keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", "getStringifiedKeyConfig")
  @js.native
  def getStringifiedKeyConfig(config: KeyConfig): String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", "transformKeys")
  @js.native
  def transformKeys(keys: js.Array[MovementKey], `type`: FocusType): js.Array[KeyConfig] = js.native
}
