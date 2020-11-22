package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.anon.PartialModifieranyany
import typingsSlinky.popperjsCore.anon.PartialOptions
import typingsSlinky.popperjsCore.arrowMod.Options
import typingsSlinky.popperjsCore.createPopperMod.PopperGeneratorArgs
import typingsSlinky.popperjsCore.typesMod.Instance
import typingsSlinky.popperjsCore.typesMod.Modifier
import typingsSlinky.popperjsCore.typesMod.OptionsGeneric
import typingsSlinky.popperjsCore.typesMod.SideObject
import typingsSlinky.popperjsCore.typesMod.State
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/popper", JSImport.Namespace)
@js.native
object popperMod extends js.Object {
  
  val applyStyles: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  val arrow: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  val computeStyles: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.computeStyles, 
    typingsSlinky.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  val defaultModifiers: js.Array[
    Modifier[
      typingsSlinky.popperjsCore.popperjsCoreStrings.popperOffsets | typingsSlinky.popperjsCore.popperjsCoreStrings.flip | typingsSlinky.popperjsCore.popperjsCoreStrings.hide | typingsSlinky.popperjsCore.popperjsCoreStrings.offset | typingsSlinky.popperjsCore.popperjsCoreStrings.eventListeners | typingsSlinky.popperjsCore.popperjsCoreStrings.computeStyles | typingsSlinky.popperjsCore.popperjsCoreStrings.arrow | typingsSlinky.popperjsCore.popperjsCoreStrings.preventOverflow | typingsSlinky.popperjsCore.popperjsCoreStrings.applyStyles, 
      js.Object | typingsSlinky.popperjsCore.flipMod.Options | typingsSlinky.popperjsCore.offsetMod.Options | typingsSlinky.popperjsCore.eventListenersMod.Options | typingsSlinky.popperjsCore.computeStylesMod.Options | Options | typingsSlinky.popperjsCore.preventOverflowMod.Options
    ]
  ] = js.native
  
  def detectOverflow(state: State): SideObject = js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  val eventListeners: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.eventListeners, 
    typingsSlinky.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  val flip: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.flip, 
    typingsSlinky.popperjsCore.flipMod.Options
  ] = js.native
  
  val hide: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  val offset: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.offset, 
    typingsSlinky.popperjsCore.offsetMod.Options
  ] = js.native
  
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  val popperOffsets: Modifier[typingsSlinky.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  val preventOverflow: Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typingsSlinky.popperjsCore.preventOverflowMod.Options
  ] = js.native
}
