package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunction
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marqueeSelectionTypesMod {
  
  @js.native
  trait IMarqueeSelection extends StObject
  
  @js.native
  trait IMarqueeSelectionProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IMarqueeSelection]] = js.native
    
    /**
      * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
      * rect to start outside of the root element boundaries.
      * @defaultvalue false
      */
    var isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional flag to control the enabled state of marquee selection. This allows you to render
      * it and have events all ready to go, but conditionally disable it. That way transitioning
      * between enabled/disabled generate no difference in the DOM.
      * @defaultvalue true
      */
    var isEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional callback that is called, when the mouse down event occurs, in order to determine
      * if we should start a marquee selection. If true is returned, we will cancel the mousedown
      * event to prevent upstream mousedown handlers from executing.
      */
    var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean]] = js.native
    
    /**
      * Optional props to mix into the root DIV element.
      */
    var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /**
      * The selection object to interact with when updating selection changes.
      */
    var selection: ISelection[IObjectWithKey] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]] = js.native
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IMarqueeSelectionProps {
    
    @scala.inline
    def apply(selection: ISelection[IObjectWithKey]): IMarqueeSelectionProps = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarqueeSelectionProps]
    }
    
    @scala.inline
    implicit class IMarqueeSelectionPropsMutableBuilder[Self <: IMarqueeSelectionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IMarqueeSelection]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IMarqueeSelection | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IMarqueeSelection]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setIsDraggingConstrainedToRoot(value: Boolean): Self = StObject.set(x, "isDraggingConstrainedToRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDraggingConstrainedToRootUndefined: Self = StObject.set(x, "isDraggingConstrainedToRoot", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setOnShouldStartSelection(value: /* ev */ MouseEvent => Boolean): Self = StObject.set(x, "onShouldStartSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShouldStartSelectionUndefined: Self = StObject.set(x, "onShouldStartSelection", js.undefined)
      
      @scala.inline
      def setRootProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPropsUndefined: Self = StObject.set(x, "rootProps", js.undefined)
      
      @scala.inline
      def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: IMarqueeSelectionStyleProps => DeepPartial[IMarqueeSelectionStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IMarqueeSelectionStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object IMarqueeSelectionStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IMarqueeSelectionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarqueeSelectionStyleProps]
    }
    
    @scala.inline
    implicit class IMarqueeSelectionStylePropsMutableBuilder[Self <: IMarqueeSelectionStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMarqueeSelectionStyles extends StObject {
    
    var box: js.UndefOr[IStyle] = js.native
    
    var boxFill: js.UndefOr[IStyle] = js.native
    
    var dragMask: js.UndefOr[IStyle] = js.native
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object IMarqueeSelectionStyles {
    
    @scala.inline
    def apply(): IMarqueeSelectionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMarqueeSelectionStyles]
    }
    
    @scala.inline
    implicit class IMarqueeSelectionStylesMutableBuilder[Self <: IMarqueeSelectionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBox(value: IStyle): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFill(value: IStyle): Self = StObject.set(x, "boxFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFillNull: Self = StObject.set(x, "boxFill", null)
      
      @scala.inline
      def setBoxFillUndefined: Self = StObject.set(x, "boxFill", js.undefined)
      
      @scala.inline
      def setBoxNull: Self = StObject.set(x, "box", null)
      
      @scala.inline
      def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      @scala.inline
      def setDragMask(value: IStyle): Self = StObject.set(x, "dragMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragMaskNull: Self = StObject.set(x, "dragMask", null)
      
      @scala.inline
      def setDragMaskUndefined: Self = StObject.set(x, "dragMask", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
