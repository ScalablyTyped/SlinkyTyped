package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCheckedMod {
  
  @JSImport("@react-md/form/types/toggle/useChecked", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle/useChecked", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle/useChecked", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle/useChecked", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  
  type ChangeEventHandler = typingsSlinky.react.mod.ChangeEventHandler[HTMLInputElement]
  
  type SetChecked = Dispatch[SetStateAction[Boolean]]
}
