package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.anon.PartialModifieranyany
import typingsSlinky.popperjsCore.anon.PartialOptions
import typingsSlinky.popperjsCore.arrowMod.Options
import typingsSlinky.popperjsCore.createPopperMod.PopperGeneratorArgs
import typingsSlinky.popperjsCore.enumsMod.BasePlacement
import typingsSlinky.popperjsCore.enumsMod.ModifierPhases_
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.enumsMod.VariationPlacement
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

object libMod {
  
  @JSImport("@popperjs/core/lib", "afterMain")
  @js.native
  val afterMain: typingsSlinky.popperjsCore.popperjsCoreStrings.afterMain = js.native
  
  @JSImport("@popperjs/core/lib", "afterRead")
  @js.native
  val afterRead: typingsSlinky.popperjsCore.popperjsCoreStrings.afterRead = js.native
  
  @JSImport("@popperjs/core/lib", "afterWrite")
  @js.native
  val afterWrite: typingsSlinky.popperjsCore.popperjsCoreStrings.afterWrite = js.native
  
  @JSImport("@popperjs/core/lib", "applyStyles")
  @js.native
  val applyStyles: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "arrow")
  @js.native
  val arrow: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  @JSImport("@popperjs/core/lib", "auto")
  @js.native
  val auto: typingsSlinky.popperjsCore.popperjsCoreStrings.auto = js.native
  
  @JSImport("@popperjs/core/lib", "basePlacements")
  @js.native
  val basePlacements: js.Array[BasePlacement] = js.native
  
  @JSImport("@popperjs/core/lib", "beforeMain")
  @js.native
  val beforeMain: typingsSlinky.popperjsCore.popperjsCoreStrings.beforeMain = js.native
  
  @JSImport("@popperjs/core/lib", "beforeRead")
  @js.native
  val beforeRead: typingsSlinky.popperjsCore.popperjsCoreStrings.beforeRead = js.native
  
  @JSImport("@popperjs/core/lib", "beforeWrite")
  @js.native
  val beforeWrite: typingsSlinky.popperjsCore.popperjsCoreStrings.beforeWrite = js.native
  
  @JSImport("@popperjs/core/lib", "bottom")
  @js.native
  val bottom: typingsSlinky.popperjsCore.popperjsCoreStrings.bottom = js.native
  
  @JSImport("@popperjs/core/lib", "clippingParents")
  @js.native
  val clippingParents: typingsSlinky.popperjsCore.popperjsCoreStrings.clippingParents = js.native
  
  @JSImport("@popperjs/core/lib", "computeStyles")
  @js.native
  val computeStyles: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.computeStyles, 
    typingsSlinky.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "detectOverflow")
  @js.native
  def detectOverflow(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib", "detectOverflow")
  @js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  @JSImport("@popperjs/core/lib", "end")
  @js.native
  val end: typingsSlinky.popperjsCore.popperjsCoreStrings.end = js.native
  
  @JSImport("@popperjs/core/lib", "eventListeners")
  @js.native
  val eventListeners: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.eventListeners, 
    typingsSlinky.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "flip")
  @js.native
  val flip: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.flip, 
    typingsSlinky.popperjsCore.flipMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "hide")
  @js.native
  val hide: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "left")
  @js.native
  val left: typingsSlinky.popperjsCore.popperjsCoreStrings.left = js.native
  
  @JSImport("@popperjs/core/lib", "main")
  @js.native
  val main: typingsSlinky.popperjsCore.popperjsCoreStrings.main = js.native
  
  @JSImport("@popperjs/core/lib", "modifierPhases")
  @js.native
  val modifierPhases: js.Array[ModifierPhases_] = js.native
  
  @JSImport("@popperjs/core/lib", "offset")
  @js.native
  val offset: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.offset, 
    typingsSlinky.popperjsCore.offsetMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
  
  @JSImport("@popperjs/core/lib", "popper")
  @js.native
  val popper: typingsSlinky.popperjsCore.popperjsCoreStrings.popper = js.native
  
  @JSImport("@popperjs/core/lib", "popperGenerator")
  @js.native
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  @JSImport("@popperjs/core/lib", "popperGenerator")
  @js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "popperOffsets")
  @js.native
  val popperOffsets: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "preventOverflow")
  @js.native
  val preventOverflow: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typingsSlinky.popperjsCore.preventOverflowMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "read")
  @js.native
  val read: typingsSlinky.popperjsCore.popperjsCoreStrings.read = js.native
  
  @JSImport("@popperjs/core/lib", "reference")
  @js.native
  val reference: typingsSlinky.popperjsCore.popperjsCoreStrings.reference = js.native
  
  @JSImport("@popperjs/core/lib", "right")
  @js.native
  val right: typingsSlinky.popperjsCore.popperjsCoreStrings.right = js.native
  
  @JSImport("@popperjs/core/lib", "start")
  @js.native
  val start: typingsSlinky.popperjsCore.popperjsCoreStrings.start = js.native
  
  @JSImport("@popperjs/core/lib", "top")
  @js.native
  val top: typingsSlinky.popperjsCore.popperjsCoreStrings.top = js.native
  
  @JSImport("@popperjs/core/lib", "variationPlacements")
  @js.native
  val variationPlacements: js.Array[VariationPlacement] = js.native
  
  @JSImport("@popperjs/core/lib", "viewport")
  @js.native
  val viewport: typingsSlinky.popperjsCore.popperjsCoreStrings.viewport = js.native
  
  @JSImport("@popperjs/core/lib", "write")
  @js.native
  val write: typingsSlinky.popperjsCore.popperjsCoreStrings.write = js.native
}
