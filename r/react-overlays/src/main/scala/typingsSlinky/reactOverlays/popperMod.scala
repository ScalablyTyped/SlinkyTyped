package typingsSlinky.reactOverlays

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.typesMod.Instance
import typingsSlinky.popperjsCore.typesMod.OptionsGeneric
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import typingsSlinky.reactOverlays.anon.PartialModifieranyany
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperMod {
  
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("react-overlays/cjs/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("react-overlays/cjs/popper", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
}
