package typingsSlinky.babelPluginReactHtmlAttrs

import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent
import typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor
import typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object babelPluginReactHtmlAttrsAugmentingMod {
    
    @JSImport("babel-plugin-react-html-attrs", "SuspenseList")
    @js.native
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    @JSImport("babel-plugin-react-html-attrs", "unstable_withSuspenseConfig")
    @js.native
    def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: js.UndefOr[SuspenseConfig | Null]): Unit = js.native
    
    @JSImport("babel-plugin-react-html-attrs", "useDeferredValue")
    @js.native
    def useDeferredValue[T](value: T, config: js.UndefOr[TimeoutConfig | Null]): T = js.native
    
    @JSImport("babel-plugin-react-html-attrs", "useTransition")
    @js.native
    def useTransition(config: js.UndefOr[SuspenseConfig | Null]): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    
    @js.native
    trait DirectionalSuspenseListProps
      extends SuspenseListCommonProps
         with typingsSlinky.babelPluginReactHtmlAttrs.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards = js.native
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.native
    }
    object DirectionalSuspenseListProps {
      
      @scala.inline
      def apply(
        children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
        revealOrder: forwards | backwards
      ): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class DirectionalSuspenseListPropsMutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    @js.native
    trait NonDirectionalSuspenseListProps
      extends SuspenseListCommonProps
         with typingsSlinky.babelPluginReactHtmlAttrs.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.native
    }
    object NonDirectionalSuspenseListProps {
      
      @scala.inline
      def apply(
        children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
      ): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class NonDirectionalSuspenseListPropsMutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    @js.native
    trait SuspenseConfig extends TimeoutConfig {
      
      var busyDelayMs: js.UndefOr[Double] = js.native
      
      var busyMinDurationMs: js.UndefOr[Double] = js.native
    }
    object SuspenseConfig {
      
      @scala.inline
      def apply(timeoutMs: Double): SuspenseConfig = {
        val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseConfig]
      }
      
      @scala.inline
      implicit class SuspenseConfigMutableBuilder[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
        
        @scala.inline
        def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
      }
    }
    
    @js.native
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]) = js.native
    }
    object SuspenseListCommonProps {
      
      @scala.inline
      def apply(
        children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
      ): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      @scala.inline
      implicit class SuspenseListCommonPropsMutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(
          value: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
        ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenIterable(value: js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps
      - typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      @scala.inline
      def DirectionalSuspenseListProps(
        children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
        revealOrder: forwards | backwards
      ): typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps]
      }
      
      @scala.inline
      def NonDirectionalSuspenseListProps(
        children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
      ): typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
      - typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
      - typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      @scala.inline
      def backwards: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards = "backwards".asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards]
      
      @scala.inline
      def forwards: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards = "forwards".asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards]
      
      @scala.inline
      def together: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together = "together".asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed
      - typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      @scala.inline
      def collapsed: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed = "collapsed".asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed]
      
      @scala.inline
      def hidden: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden = "hidden".asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden]
    }
    
    @js.native
    trait TimeoutConfig extends StObject {
      
      /**
        * This timeout (in milliseconds) tells React how long to wait before showing the next state.
        *
        * React will always try to use a shorter lag when network and device allows it.
        *
        * **NOTE: We recommend that you share Suspense Config between different modules.**
        */
      var timeoutMs: Double = js.native
    }
    object TimeoutConfig {
      
      @scala.inline
      def apply(timeoutMs: Double): TimeoutConfig = {
        val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
        __obj.asInstanceOf[TimeoutConfig]
      }
      
      @scala.inline
      implicit class TimeoutConfigMutableBuilder[Self <: TimeoutConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      }
    }
    
    type TransitionFunction = js.Function0[js.UndefOr[Unit]]
    
    type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]
  }
}
