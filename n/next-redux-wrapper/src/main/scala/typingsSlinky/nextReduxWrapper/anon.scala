package typingsSlinky.nextReduxWrapper

import slinky.core.facade.ReactElement
import typingsSlinky.next.libUtilsMod.NextPageContext
import typingsSlinky.next.mod.GetStaticProps
import typingsSlinky.nextReduxWrapper.mod.GetServerSidePropsContext
import typingsSlinky.nextReduxWrapper.mod.GetStaticPropsContext
import typingsSlinky.nextReduxWrapper.mod.WrapperProps
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.Validator
import typingsSlinky.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react.react.FunctionComponent<next-redux-wrapper.next-redux-wrapper.WrapperProps> & {  getInitialProps :(context : next.next.NextPageContext): next-redux-wrapper.next-redux-wrapper.WrapperProps | std.Promise<next-redux-wrapper.next-redux-wrapper.WrapperProps> | undefined} */
  @js.native
  trait FunctionComponentWrapperP extends StObject {
    
    def apply(props: PropsWithChildren[WrapperProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[WrapperProps], context: js.Any): ReactElement | Null = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[PartialWrapperProps] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var getInitialProps: js.UndefOr[
        js.Function1[/* context */ NextPageContext, WrapperProps | js.Promise[WrapperProps]]
      ] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapWrapperP] = js.native
  }
  
  @js.native
  trait GetServerSideProps[S /* <: js.Object */, A /* <: Action[_] */] extends StObject {
    
    def getServerSideProps[P /* <: js.Object */](callback: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | P]): typingsSlinky.next.mod.GetServerSideProps[P, ParsedUrlQuery] = js.native
    
    def getStaticProps[P_1 /* <: js.Object */](callback: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | P_1]): GetStaticProps[P_1, ParsedUrlQuery] = js.native
    
    def withRedux(Component: js.Any): FunctionComponentWrapperP = js.native
  }
  object GetServerSideProps {
    
    @scala.inline
    def apply[S /* <: js.Object */, A /* <: Action[_] */](
      getServerSideProps: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | js.Any] => typingsSlinky.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery],
      getStaticProps: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery],
      withRedux: js.Any => FunctionComponentWrapperP
    ): GetServerSideProps[S, A] = {
      val __obj = js.Dynamic.literal(getServerSideProps = js.Any.fromFunction1(getServerSideProps), getStaticProps = js.Any.fromFunction1(getStaticProps), withRedux = js.Any.fromFunction1(withRedux))
      __obj.asInstanceOf[GetServerSideProps[S, A]]
    }
    
    @scala.inline
    implicit class GetServerSidePropsMutableBuilder[Self <: GetServerSideProps[_, _], S /* <: js.Object */, A /* <: Action[_] */] (val x: Self with (GetServerSideProps[S, A])) extends AnyVal {
      
      @scala.inline
      def setGetServerSideProps(
        value: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | js.Any] => typingsSlinky.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery]
      ): Self = StObject.set(x, "getServerSideProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStaticProps(
        value: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery]
      ): Self = StObject.set(x, "getStaticProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWithRedux(value: js.Any => FunctionComponentWrapperP): Self = StObject.set(x, "withRedux", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<next-redux-wrapper.next-redux-wrapper.WrapperProps> */
  @js.native
  trait PartialWrapperProps extends StObject {
    
    var initialProps: js.UndefOr[js.Any] = js.native
    
    var initialState: js.UndefOr[js.Any] = js.native
    
    var pageProps: js.UndefOr[js.Any] = js.native
  }
  object PartialWrapperProps {
    
    @scala.inline
    def apply(): PartialWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWrapperProps]
    }
    
    @scala.inline
    implicit class PartialWrapperPropsMutableBuilder[Self <: PartialWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      @scala.inline
      def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setPageProps(value: js.Any): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePropsUndefined: Self = StObject.set(x, "pageProps", js.undefined)
    }
  }
  
  @js.native
  trait Store[S /* <: js.Object */, A /* <: Action[_] */] extends StObject {
    
    var store: typingsSlinky.redux.mod.Store[S, A] = js.native
  }
  object Store {
    
    @scala.inline
    def apply[S /* <: js.Object */, A /* <: Action[_] */](store: typingsSlinky.redux.mod.Store[S, A]): Store[S, A] = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store[S, A]]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store[_, _], S /* <: js.Object */, A /* <: Action[_] */] (val x: Self with (Store[S, A])) extends AnyVal {
      
      @scala.inline
      def setStore(value: typingsSlinky.redux.mod.Store[S, A]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<next-redux-wrapper.next-redux-wrapper.WrapperProps> */
  @js.native
  trait WeakValidationMapWrapperP extends StObject {
    
    var initialProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
    
    var initialState: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
    
    var pageProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  }
  object WeakValidationMapWrapperP {
    
    @scala.inline
    def apply(): WeakValidationMapWrapperP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapWrapperP]
    }
    
    @scala.inline
    implicit class WeakValidationMapWrapperPMutableBuilder[Self <: WeakValidationMapWrapperP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialProps(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
      
      @scala.inline
      def setInitialState(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setPageProps(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "pageProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePropsUndefined: Self = StObject.set(x, "pageProps", js.undefined)
    }
  }
}
