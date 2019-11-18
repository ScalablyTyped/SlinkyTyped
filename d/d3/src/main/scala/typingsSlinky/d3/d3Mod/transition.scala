package typingsSlinky.d3.d3Mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
import typingsSlinky.d3DashTransition.d3DashTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "transition")
@js.native
object transition extends js.Object {
  def apply[OldDatum](): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](name: String): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](transition: Transition[BaseType, _, BaseType, _]): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
}

