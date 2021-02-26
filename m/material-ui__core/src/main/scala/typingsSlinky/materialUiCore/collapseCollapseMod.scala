package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.anon.PartialClassNameMapCollap
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.materialUiCoreStrings.auto
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseCollapseMod extends Shortcut {
  
  @JSImport("@material-ui/core/Collapse/Collapse", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CollapseProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.container
    - typingsSlinky.materialUiCore.materialUiCoreStrings.entered
    - typingsSlinky.materialUiCore.materialUiCoreStrings.wrapper
    - typingsSlinky.materialUiCore.materialUiCoreStrings.wrapperInner
  */
  trait CollapseClassKey extends StObject
  object CollapseClassKey {
    
    @scala.inline
    def container: typingsSlinky.materialUiCore.materialUiCoreStrings.container = "container".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.container]
    
    @scala.inline
    def entered: typingsSlinky.materialUiCore.materialUiCoreStrings.entered = "entered".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.entered]
    
    @scala.inline
    def wrapper: typingsSlinky.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.wrapper]
    
    @scala.inline
    def wrapperInner: typingsSlinky.materialUiCore.materialUiCoreStrings.wrapperInner = "wrapperInner".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.wrapperInner]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, @material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey, 'timeout'> */
  @js.native
  trait CollapseProps extends StObject {
    
    var addEndListener: js.UndefOr[js.Any] = js.native
    
    var appear: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapCollap] = js.native
    
    var collapsedHeight: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[ReactType[CollapseProps]] = js.native
    
    var enter: js.UndefOr[Boolean] = js.native
    
    var exit: js.UndefOr[Boolean] = js.native
    
    var in: js.UndefOr[js.Any] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var mountOnEnter: js.UndefOr[js.Any] = js.native
    
    var onEnter: js.UndefOr[js.Any] = js.native
    
    var onEntered: js.UndefOr[js.Any] = js.native
    
    var onEntering: js.UndefOr[js.Any] = js.native
    
    var onExit: js.UndefOr[js.Any] = js.native
    
    var onExited: js.UndefOr[js.Any] = js.native
    
    var onExiting: js.UndefOr[js.Any] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var theme: js.UndefOr[Theme] = js.native
    
    var timeout: js.UndefOr[js.Any | auto] = js.native
    
    var unmountOnExit: js.UndefOr[js.Any] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEndListener(value: js.Any): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapCollap): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setCollapsedHeight(value: String): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactType[CollapseProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[CollapseProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[CollapseProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setIn(value: js.Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTimeout(value: js.Any | auto): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CollapseProps]
  
  /* This means you don't have to write `default`, but can instead just say `collapseCollapseMod.foo` */
  override def _to: ReactComponentClass[CollapseProps] = default
}
