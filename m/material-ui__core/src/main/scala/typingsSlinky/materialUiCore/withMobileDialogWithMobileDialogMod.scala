package typingsSlinky.materialUiCore

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.PartialWithWidth
import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withMobileDialogWithMobileDialogMod {
  
  @JSImport("@material-ui/core/withMobileDialog/withMobileDialog", JSImport.Default)
  @js.native
  def default[P](): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
  @JSImport("@material-ui/core/withMobileDialog/withMobileDialog", JSImport.Default)
  @js.native
  def default[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
  
  @js.native
  trait InjectedProps extends StObject {
    
    var fullScreen: js.UndefOr[Boolean] = js.native
  }
  object InjectedProps {
    
    @scala.inline
    def apply(): InjectedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedProps]
    }
    
    @scala.inline
    implicit class InjectedPropsMutableBuilder[Self <: InjectedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    }
  }
  
  @js.native
  trait WithMobileDialogOptions extends StObject {
    
    var breakpoint: Breakpoint = js.native
  }
  object WithMobileDialogOptions {
    
    @scala.inline
    def apply(breakpoint: Breakpoint): WithMobileDialogOptions = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithMobileDialogOptions]
    }
    
    @scala.inline
    implicit class WithMobileDialogOptionsMutableBuilder[Self <: WithMobileDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    }
  }
}
