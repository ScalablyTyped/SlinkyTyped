package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainCardTypesMod {
  
  @js.native
  trait IPlainCard extends StObject
  
  @js.native
  trait IPlainCardProps extends IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
    
    /**
      *  Render function to populate compact content area
      */
    var onRenderPlainCard: js.UndefOr[IRenderFunction[_]] = js.native
  }
  object IPlainCardProps {
    
    @scala.inline
    def apply(): IPlainCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlainCardProps]
    }
    
    @scala.inline
    implicit class IPlainCardPropsMutableBuilder[Self <: IPlainCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRenderPlainCard(
        value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderPlainCard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderPlainCardUndefined: Self = StObject.set(x, "onRenderPlainCard", js.undefined)
    }
  }
  
  type IPlainCardStyleProps = IBaseCardStyleProps
  
  type IPlainCardStyles = IBaseCardStyles
}
