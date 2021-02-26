package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.Center
import typingsSlinky.materialUiCore.mod.StandardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchRippleMod extends Shortcut {
  
  @JSImport("@material-ui/core/ButtonBase/TouchRipple", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TouchRippleProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.root
    - typingsSlinky.materialUiCore.materialUiCoreStrings.ripple
    - typingsSlinky.materialUiCore.materialUiCoreStrings.rippleVisible
    - typingsSlinky.materialUiCore.materialUiCoreStrings.ripplePulsate
    - typingsSlinky.materialUiCore.materialUiCoreStrings.child
    - typingsSlinky.materialUiCore.materialUiCoreStrings.childLeaving
    - typingsSlinky.materialUiCore.materialUiCoreStrings.childPulsate
  */
  trait TouchRippleClassKey extends StObject
  object TouchRippleClassKey {
    
    @scala.inline
    def child: typingsSlinky.materialUiCore.materialUiCoreStrings.child = "child".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.child]
    
    @scala.inline
    def childLeaving: typingsSlinky.materialUiCore.materialUiCoreStrings.childLeaving = "childLeaving".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.childLeaving]
    
    @scala.inline
    def childPulsate: typingsSlinky.materialUiCore.materialUiCoreStrings.childPulsate = "childPulsate".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.childPulsate]
    
    @scala.inline
    def ripple: typingsSlinky.materialUiCore.materialUiCoreStrings.ripple = "ripple".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.ripple]
    
    @scala.inline
    def ripplePulsate: typingsSlinky.materialUiCore.materialUiCoreStrings.ripplePulsate = "ripplePulsate".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.ripplePulsate]
    
    @scala.inline
    def rippleVisible: typingsSlinky.materialUiCore.materialUiCoreStrings.rippleVisible = "rippleVisible".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.rippleVisible]
    
    @scala.inline
    def root: typingsSlinky.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.root]
  }
  
  type TouchRippleProps = (StandardProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionGroup.TransitionGroupProps */ _, 
    TouchRippleClassKey, 
    scala.Nothing
  ]) with Center
  
  type _To = ReactComponentClass[TouchRippleProps]
  
  /* This means you don't have to write `default`, but can instead just say `touchRippleMod.foo` */
  override def _to: ReactComponentClass[TouchRippleProps] = default
}
