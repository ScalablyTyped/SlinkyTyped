package typingsSlinky.rcDialog

import slinky.core.facade.ReactElement
import typingsSlinky.rcDialog.idialogproptypesMod.IDialogPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("rc-dialog/es/Dialog", JSImport.Default)
  @js.native
  def default(props: IDialogChildProps): ReactElement = js.native
  
  @js.native
  trait IDialogChildProps extends IDialogPropTypes {
    
    def getOpenCount(): Double = js.native
    
    var switchScrollingEffect: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IDialogChildProps {
    
    @scala.inline
    def apply(getOpenCount: () => Double): IDialogChildProps = {
      val __obj = js.Dynamic.literal(getOpenCount = js.Any.fromFunction0(getOpenCount))
      __obj.asInstanceOf[IDialogChildProps]
    }
    
    @scala.inline
    implicit class IDialogChildPropsMutableBuilder[Self <: IDialogChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetOpenCount(value: () => Double): Self = StObject.set(x, "getOpenCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwitchScrollingEffect(value: () => Unit): Self = StObject.set(x, "switchScrollingEffect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwitchScrollingEffectUndefined: Self = StObject.set(x, "switchScrollingEffect", js.undefined)
    }
  }
}
