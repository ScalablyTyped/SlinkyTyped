package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("antd/lib/transfer/operation", JSImport.Default)
  @js.native
  def default(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay: TransferOperationProps
  ): ReactElement = js.native
  
  @js.native
  trait TransferOperationProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var leftActive: js.UndefOr[Boolean] = js.native
    
    var leftArrowText: js.UndefOr[String] = js.native
    
    var moveToLeft: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var moveToRight: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var oneWay: js.UndefOr[Boolean] = js.native
    
    var rightActive: js.UndefOr[Boolean] = js.native
    
    var rightArrowText: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TransferOperationProps {
    
    @scala.inline
    def apply(): TransferOperationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferOperationProps]
    }
    
    @scala.inline
    implicit class TransferOperationPropsMutableBuilder[Self <: TransferOperationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLeftActive(value: Boolean): Self = StObject.set(x, "leftActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftActiveUndefined: Self = StObject.set(x, "leftActive", js.undefined)
      
      @scala.inline
      def setLeftArrowText(value: String): Self = StObject.set(x, "leftArrowText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftArrowTextUndefined: Self = StObject.set(x, "leftArrowText", js.undefined)
      
      @scala.inline
      def setMoveToLeft(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "moveToLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToLeftUndefined: Self = StObject.set(x, "moveToLeft", js.undefined)
      
      @scala.inline
      def setMoveToRight(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "moveToRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToRightUndefined: Self = StObject.set(x, "moveToRight", js.undefined)
      
      @scala.inline
      def setOneWay(value: Boolean): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      @scala.inline
      def setRightActive(value: Boolean): Self = StObject.set(x, "rightActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightActiveUndefined: Self = StObject.set(x, "rightActive", js.undefined)
      
      @scala.inline
      def setRightArrowText(value: String): Self = StObject.set(x, "rightArrowText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightArrowTextUndefined: Self = StObject.set(x, "rightArrowText", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
