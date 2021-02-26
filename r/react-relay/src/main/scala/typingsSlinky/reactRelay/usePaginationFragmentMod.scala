package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.anon.OnComplete
import typingsSlinky.reactRelay.helpersMod.KeyType
import typingsSlinky.reactRelay.helpersMod.KeyTypeData
import typingsSlinky.reactRelay.useLoadMoreFunctionMod.LoadMoreFn
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Options
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/usePaginationFragment", "usePaginationFragment")
  @js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/lib/relay-experimental/usePaginationFragment", "usePaginationFragment")
  @js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey, KeyTypeData[TKey, _]] = js.native
  
  @js.native
  trait ReturnType[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] extends StObject {
    
    var data: TFragmentData = js.native
    
    var hasNext: Boolean = js.native
    
    var hasPrevious: Boolean = js.native
    
    var isLoadingNext: Boolean = js.native
    
    var isLoadingPrevious: Boolean = js.native
    
    var loadNext: LoadMoreFn[TQuery] = js.native
    
    var loadPrevious: LoadMoreFn[TQuery] = js.native
    
    var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
  }
  object ReturnType {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData](
      data: TFragmentData,
      hasNext: Boolean,
      hasPrevious: Boolean,
      isLoadingNext: Boolean,
      isLoadingPrevious: Boolean,
      loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
      loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
      refetch: RefetchFnDynamic[TQuery, TKey, Options]
    ): ReturnType[TQuery, TKey, TFragmentData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnType[TQuery, TKey, TFragmentData]]
    }
    
    @scala.inline
    implicit class ReturnTypeMutableBuilder[Self <: ReturnType[_, _, _], TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] (val x: Self with (ReturnType[TQuery, TKey, TFragmentData])) extends AnyVal {
      
      @scala.inline
      def setData(value: TFragmentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingNext(value: Boolean): Self = StObject.set(x, "isLoadingNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingPrevious(value: Boolean): Self = StObject.set(x, "isLoadingPrevious", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadNext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadPrevious", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
