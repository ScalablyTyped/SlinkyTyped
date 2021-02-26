package typingsSlinky.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.entriaRelayExperimental.anon.OnComplete
import typingsSlinky.entriaRelayExperimental.useLoadMoreFunctionMod.LoadMoreFn
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLegacyPaginationFragmentMod {
  
  @JSImport("@entria/relay-experimental/lib/useLegacyPaginationFragment", "useLegacyPaginationFragment")
  @js.native
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[TQuery, TKey, NonNullableFragmentReturn[TKey] with NullableFragmentReturn[TKey]] = js.native
  
  type NonNullableFragmentReturn[TReturn] = ReturnType[NonNullableReturn[TReturn]]
  
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  
  type NullableFragmentReturn[TReturn] = ReturnType[NullableReturn[TReturn]]
  
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | Null], TFragmentData | Null]
  
  @js.native
  trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends StObject {
    
    var data: TFragmentData = js.native
    
    var hasNext: Boolean = js.native
    
    var hasPrevious: Boolean = js.native
    
    var isLoadingNext: Boolean = js.native
    
    var isLoadingPrevious: Boolean = js.native
    
    var loadNext: LoadMoreFn = js.native
    
    var loadPrevious: LoadMoreFn = js.native
    
    var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
  }
  object ReturnTypePaginationFragment {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TKey, TFragmentData](
      data: TFragmentData,
      hasNext: Boolean,
      hasPrevious: Boolean,
      isLoadingNext: Boolean,
      isLoadingPrevious: Boolean,
      loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
      loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable,
      refetch: RefetchFnDynamic[TQuery, TKey, Options]
    ): ReturnTypePaginationFragment[TQuery, TKey, TFragmentData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypePaginationFragment[TQuery, TKey, TFragmentData]]
    }
    
    @scala.inline
    implicit class ReturnTypePaginationFragmentMutableBuilder[Self <: ReturnTypePaginationFragment[_, _, _], TQuery /* <: OperationType */, TKey, TFragmentData] (val x: Self with (ReturnTypePaginationFragment[TQuery, TKey, TFragmentData])) extends AnyVal {
      
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
      def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = StObject.set(x, "loadNext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete]) => Disposable): Self = StObject.set(x, "loadPrevious", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
