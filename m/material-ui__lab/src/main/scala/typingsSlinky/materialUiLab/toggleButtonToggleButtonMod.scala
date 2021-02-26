package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonToggleButtonMod {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://material-ui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://material-ui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://material-ui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.disabled
    - typingsSlinky.materialUiLab.materialUiLabStrings.selected
    - typingsSlinky.materialUiLab.materialUiLabStrings.label
    - typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall
    - typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge
  */
  trait ToggleButtonClassKey extends StObject
  object ToggleButtonClassKey {
    
    @scala.inline
    def disabled: typingsSlinky.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.disabled]
    
    @scala.inline
    def label: typingsSlinky.materialUiLab.materialUiLabStrings.label = "label".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.label]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def selected: typingsSlinky.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.selected]
    
    @scala.inline
    def sizeLarge: typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge]
    
    @scala.inline
    def sizeSmall: typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall]
  }
  
  type ToggleButtonProps[D /* <: ReactElement */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<ToggleButtonTypeMap<P, D>, D> */ js.Any
  
  type ToggleButtonTypeMap[P, D /* <: ReactElement */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBaseTypeMap<{  props :P & {  disableFocusRipple :boolean | undefined,   selected :boolean | undefined,   size :'small' | 'medium' | 'large' | undefined,   value :any | undefined},   defaultComponent :D,   classKey :ToggleButtonClassKey}> */ js.Any
}
