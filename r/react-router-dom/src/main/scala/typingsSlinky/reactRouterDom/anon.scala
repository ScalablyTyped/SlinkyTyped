package typingsSlinky.reactRouterDom

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.Action
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.StaticRouterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-router.react-router.MemoryRouterProps> */
  @js.native
  trait ReadonlyMemoryRouterProps extends StObject {
    
    val getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.native
    
    val initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.native
    
    val initialIndex: js.UndefOr[Double] = js.native
    
    val keyLength: js.UndefOr[Double] = js.native
  }
  object ReadonlyMemoryRouterProps {
    
    @scala.inline
    def apply(): ReadonlyMemoryRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyMemoryRouterProps]
    }
    
    @scala.inline
    implicit class ReadonlyMemoryRouterPropsMutableBuilder[Self <: ReadonlyMemoryRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setInitialEntries(value: js.Array[LocationDescriptor[LocationState]]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      @scala.inline
      def setInitialEntriesVarargs(value: LocationDescriptor[LocationState]*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
      
      @scala.inline
      def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.PromptProps> */
  @js.native
  trait ReadonlyPromptProps extends StObject {
    
    val message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean]) = js.native
    
    val when: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyPromptProps {
    
    @scala.inline
    def apply(
      message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
    ): ReadonlyPromptProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPromptProps]
    }
    
    @scala.inline
    implicit class ReadonlyPromptPropsMutableBuilder[Self <: ReadonlyPromptProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(
        value: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction2(value: (/* location */ Location[LocationState], /* action */ Action) => String | Boolean): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.RedirectProps> */
  @js.native
  trait ReadonlyRedirectProps extends StObject {
    
    val exact: js.UndefOr[Boolean] = js.native
    
    val from: js.UndefOr[String] = js.native
    
    val path: js.UndefOr[String] = js.native
    
    val push: js.UndefOr[Boolean] = js.native
    
    val strict: js.UndefOr[Boolean] = js.native
    
    val to: LocationDescriptor[LocationState] = js.native
  }
  object ReadonlyRedirectProps {
    
    @scala.inline
    def apply(to: LocationDescriptor[LocationState]): ReadonlyRedirectProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRedirectProps]
    }
    
    @scala.inline
    implicit class ReadonlyRedirectPropsMutableBuilder[Self <: ReadonlyRedirectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.RouterProps> */
  @js.native
  trait ReadonlyRouterProps extends StObject {
    
    val history: History[LocationState] = js.native
  }
  object ReadonlyRouterProps {
    
    @scala.inline
    def apply(history: History[LocationState]): ReadonlyRouterProps = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRouterProps]
    }
    
    @scala.inline
    implicit class ReadonlyRouterPropsMutableBuilder[Self <: ReadonlyRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.StaticRouterProps> */
  @js.native
  trait ReadonlyStaticRouterProps extends StObject {
    
    val basename: js.UndefOr[String] = js.native
    
    val context: js.UndefOr[StaticRouterContext] = js.native
    
    val location: js.UndefOr[String | js.Object] = js.native
  }
  object ReadonlyStaticRouterProps {
    
    @scala.inline
    def apply(): ReadonlyStaticRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStaticRouterProps]
    }
    
    @scala.inline
    implicit class ReadonlyStaticRouterPropsMutableBuilder[Self <: ReadonlyStaticRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setContext(value: StaticRouterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setLocation(value: String | js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router.react-router.SwitchProps> */
  @js.native
  trait ReadonlySwitchProps extends StObject {
    
    val children: js.UndefOr[ReactElement] = js.native
    
    val location: js.UndefOr[Location[LocationState]] = js.native
  }
  object ReadonlySwitchProps {
    
    @scala.inline
    def apply(): ReadonlySwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySwitchProps]
    }
    
    @scala.inline
    implicit class ReadonlySwitchPropsMutableBuilder[Self <: ReadonlySwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
