package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.anon.PartialModifieranyany
import typingsSlinky.popperjsCore.anon.PartialOptions
import typingsSlinky.popperjsCore.createPopperMod.PopperGeneratorArgs
import typingsSlinky.popperjsCore.eventListenersMod.Options
import typingsSlinky.popperjsCore.popperjsCoreStrings.applyStyles
import typingsSlinky.popperjsCore.popperjsCoreStrings.computeStyles
import typingsSlinky.popperjsCore.popperjsCoreStrings.eventListeners
import typingsSlinky.popperjsCore.popperjsCoreStrings.popperOffsets
import typingsSlinky.popperjsCore.typesMod.Instance
import typingsSlinky.popperjsCore.typesMod.Modifier
import typingsSlinky.popperjsCore.typesMod.OptionsGeneric
import typingsSlinky.popperjsCore.typesMod.SideObject
import typingsSlinky.popperjsCore.typesMod.State
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperLiteMod {
  
  @JSImport("@popperjs/core/lib/popper-lite", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper-lite", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib/popper-lite", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper-lite", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib/popper-lite", "defaultModifiers")
  @js.native
  val defaultModifiers: js.Array[
    Modifier[
      popperOffsets | eventListeners | computeStyles | applyStyles, 
      js.Object | Options | typingsSlinky.popperjsCore.computeStylesMod.Options
    ]
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper-lite", "detectOverflow")
  @js.native
  def detectOverflow(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib/popper-lite", "detectOverflow")
  @js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  @JSImport("@popperjs/core/lib/popper-lite", "popperGenerator")
  @js.native
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  @JSImport("@popperjs/core/lib/popper-lite", "popperGenerator")
  @js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
}
