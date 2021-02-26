package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.popperjsCore.anon.PartialModifieranyany
import typingsSlinky.popperjsCore.anon.PartialOptions
import typingsSlinky.popperjsCore.anon.PartialOptionsGenericany
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

object createPopperMod {
  
  @JSImport("@popperjs/core/lib/createPopper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/createPopper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib/createPopper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/createPopper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib/createPopper", "detectOverflow")
  @js.native
  def detectOverflow(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib/createPopper", "detectOverflow")
  @js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  @JSImport("@popperjs/core/lib/createPopper", "popperGenerator")
  @js.native
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  @JSImport("@popperjs/core/lib/createPopper", "popperGenerator")
  @js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  @js.native
  trait PopperGeneratorArgs extends StObject {
    
    var defaultModifiers: js.UndefOr[js.Array[Modifier[_, _]]] = js.native
    
    var defaultOptions: js.UndefOr[PartialOptionsGenericany] = js.native
  }
  object PopperGeneratorArgs {
    
    @scala.inline
    def apply(): PopperGeneratorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperGeneratorArgs]
    }
    
    @scala.inline
    implicit class PopperGeneratorArgsMutableBuilder[Self <: PopperGeneratorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultModifiers(value: js.Array[Modifier[_, _]]): Self = StObject.set(x, "defaultModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultModifiersUndefined: Self = StObject.set(x, "defaultModifiers", js.undefined)
      
      @scala.inline
      def setDefaultModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = StObject.set(x, "defaultModifiers", js.Array(value :_*))
      
      @scala.inline
      def setDefaultOptions(value: PartialOptionsGenericany): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    }
  }
}
