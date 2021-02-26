package typingsSlinky.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTypesMod {
  
  @js.native
  sealed trait TooltipPositionPlacement extends StObject
  @JSImport("playable/dist/src/modules/ui/core/tooltip/types", "TooltipPositionPlacement")
  @js.native
  object TooltipPositionPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TooltipPositionPlacement with String] = js.native
    
    @js.native
    sealed trait BOTTOM extends TooltipPositionPlacement
    /* "bottom" */ val BOTTOM: typingsSlinky.playable.tooltipTypesMod.TooltipPositionPlacement.BOTTOM with String = js.native
    
    @js.native
    sealed trait TOP extends TooltipPositionPlacement
    /* "top" */ val TOP: typingsSlinky.playable.tooltipTypesMod.TooltipPositionPlacement.TOP with String = js.native
  }
  
  @js.native
  trait ITooltip extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    var isHidden: Boolean = js.native
    
    def setStyle(style: StringDictionary[String | Double]): Unit = js.native
    
    def setText(text: String): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ITooltip {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setStyle: StringDictionary[String | Double] => Unit,
      setText: String => Unit,
      show: () => Unit
    ): ITooltip = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setStyle = js.Any.fromFunction1(setStyle), setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltip]
    }
    
    @scala.inline
    implicit class ITooltipMutableBuilder[Self <: ITooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetStyle(value: StringDictionary[String | Double] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ITooltipPosition extends StObject {
    
    var placement: TooltipPositionPlacement = js.native
    
    var x: Double = js.native
  }
  object ITooltipPosition {
    
    @scala.inline
    def apply(placement: TooltipPositionPlacement, x: Double): ITooltipPosition = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipPosition]
    }
    
    @scala.inline
    implicit class ITooltipPositionMutableBuilder[Self <: ITooltipPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlacement(value: TooltipPositionPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  type ITooltipPositionFunction = js.Function1[/* tooltipContainerElement */ HTMLElement, ITooltipPosition]
  
  @js.native
  trait ITooltipReference extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def hide(): Unit = js.native
    
    var isDisabled: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    def setText(text: String): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ITooltipReference {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      disable: () => Unit,
      enable: () => Unit,
      hide: () => Unit,
      isDisabled: Boolean,
      isHidden: Boolean,
      setText: String => Unit,
      show: () => Unit
    ): ITooltipReference = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), isDisabled = isDisabled.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltipReference]
    }
    
    @scala.inline
    implicit class ITooltipReferenceMutableBuilder[Self <: ITooltipReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ITooltipReferenceOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ITooltipReferenceOptions {
    
    @scala.inline
    def apply(): ITooltipReferenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipReferenceOptions]
    }
    
    @scala.inline
    implicit class ITooltipReferenceOptionsMutableBuilder[Self <: ITooltipReferenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ITooltipService extends StObject {
    
    def createReference(reference: HTMLElement, options: ITooltipReferenceOptions): ITooltipReference = js.native
    
    def destroy(): Unit = js.native
    
    def hide(): Unit = js.native
    
    var isHidden: Boolean = js.native
    
    def setText(text: String): Unit = js.native
    
    def show(options: ITooltipShowOptions): Unit = js.native
    
    var tooltipContainerElement: HTMLElement = js.native
  }
  object ITooltipService {
    
    @scala.inline
    def apply(
      createReference: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference,
      destroy: () => Unit,
      hide: () => Unit,
      isHidden: Boolean,
      setText: String => Unit,
      show: ITooltipShowOptions => Unit,
      tooltipContainerElement: HTMLElement
    ): ITooltipService = {
      val __obj = js.Dynamic.literal(createReference = js.Any.fromFunction2(createReference), destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction1(show), tooltipContainerElement = tooltipContainerElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipService]
    }
    
    @scala.inline
    implicit class ITooltipServiceMutableBuilder[Self <: ITooltipService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateReference(value: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference): Self = StObject.set(x, "createReference", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: ITooltipShowOptions => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipContainerElement(value: HTMLElement): Self = StObject.set(x, "tooltipContainerElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipShowOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var position: ITooltipPosition | ITooltipPositionFunction = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ITooltipShowOptions {
    
    @scala.inline
    def apply(position: ITooltipPosition | ITooltipPositionFunction): ITooltipShowOptions = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipShowOptions]
    }
    
    @scala.inline
    implicit class ITooltipShowOptionsMutableBuilder[Self <: ITooltipShowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setPosition(value: ITooltipPosition | ITooltipPositionFunction): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFunction1(value: /* tooltipContainerElement */ HTMLElement => ITooltipPosition): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ITooltipStyles extends StObject {
    
    var showAsElement: String = js.native
    
    var showAsText: String = js.native
    
    var tooltip: String = js.native
    
    var tooltipInner: String = js.native
    
    var tooltipVisible: String = js.native
  }
  object ITooltipStyles {
    
    @scala.inline
    def apply(
      showAsElement: String,
      showAsText: String,
      tooltip: String,
      tooltipInner: String,
      tooltipVisible: String
    ): ITooltipStyles = {
      val __obj = js.Dynamic.literal(showAsElement = showAsElement.asInstanceOf[js.Any], showAsText = showAsText.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipInner = tooltipInner.asInstanceOf[js.Any], tooltipVisible = tooltipVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipStyles]
    }
    
    @scala.inline
    implicit class ITooltipStylesMutableBuilder[Self <: ITooltipStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowAsElement(value: String): Self = StObject.set(x, "showAsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAsText(value: String): Self = StObject.set(x, "showAsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipInner(value: String): Self = StObject.set(x, "tooltipInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipVisible(value: String): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
    }
  }
}
