package typingsSlinky.reactMdUtils

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/useToggle", JSImport.Namespace)
@js.native
object useToggleMod extends js.Object {
  
  def default(defaultToggled: js.Function0[Boolean]): ReturnValue = js.native
  def default(defaultToggled: Boolean): ReturnValue = js.native
  
  type Disable = js.Function0[Unit]
  
  type Enable = js.Function0[Unit]
  
  type ReturnValue = js.Tuple5[Boolean, Enable, Disable, Toggle, SetToggle]
  
  type SetToggle = Dispatch[SetStateAction[Boolean]]
  
  type Toggle = js.Function0[Unit]
}
