package typingsSlinky.iterall

import typingsSlinky.iterall.anon.Length
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iterall", "$$asyncIterator")
  @js.native
  val asyncIterator: js.Symbol = js.native
  
  @JSImport("iterall", "createAsyncIterator")
  @js.native
  def createAsyncIterator(collection: js.Any): Unit | (AsyncIterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  @JSImport("iterall", "createAsyncIterator")
  @js.native
  def createAsyncIterator(collection: Length): AsyncIterator[_, _, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("iterall", "createAsyncIterator")
  @js.native
  def createAsyncIterator[TValue](collection: js.Iterable[js.Promise[TValue] | TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("iterall", "createAsyncIterator")
  @js.native
  def createAsyncIterator[TValue](collection: AsyncIterable[TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("iterall", "createIterator")
  @js.native
  def createIterator(collection: js.Any): Unit | js.Iterator[_] = js.native
  @JSImport("iterall", "createIterator")
  @js.native
  def createIterator(collection: Length): js.Iterator[_] = js.native
  @JSImport("iterall", "createIterator")
  @js.native
  def createIterator[TValue](collection: js.Iterable[TValue]): js.Iterator[TValue] = js.native
  
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach[TCollection /* <: js.Iterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      _
    ]
  ): js.Promise[Unit] = js.native
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach[TCollection /* <: js.Iterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      _
    ],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach_TCollection_AsyncIterableWildcard[TCollection /* <: AsyncIterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      _
    ]
  ): js.Promise[Unit] = js.native
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach_TCollection_AsyncIterableWildcard[TCollection /* <: AsyncIterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[
      /* value */ ResolvedOf[TCollection], 
      /* index */ Double, 
      /* collection */ TCollection, 
      _
    ],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach_TCollection_Length[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _]
  ): js.Promise[Unit] = js.native
  @JSImport("iterall", "forAwaitEach")
  @js.native
  def forAwaitEach_TCollection_Length[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): js.Promise[Unit] = js.native
  
  @JSImport("iterall", "forEach")
  @js.native
  def forEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _]
  ): Unit = js.native
  @JSImport("iterall", "forEach")
  @js.native
  def forEach[TCollection /* <: Length */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ js.Any, /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): Unit = js.native
  @JSImport("iterall", "forEach")
  @js.native
  def forEach_TCollection_IterableWildcard[TCollection /* <: js.Iterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ ValueOf[TCollection], /* index */ Double, /* collection */ TCollection, _]
  ): Unit = js.native
  @JSImport("iterall", "forEach")
  @js.native
  def forEach_TCollection_IterableWildcard[TCollection /* <: js.Iterable[_] */](
    collection: TCollection,
    callbackFn: js.Function3[/* value */ ValueOf[TCollection], /* index */ Double, /* collection */ TCollection, _],
    thisArg: js.Any
  ): Unit = js.native
  
  @JSImport("iterall", "getAsyncIterator")
  @js.native
  def getAsyncIterator(asyncIterable: js.Any): Unit | (AsyncIterator[_, _, js.UndefOr[scala.Nothing]]) = js.native
  @JSImport("iterall", "getAsyncIterator")
  @js.native
  def getAsyncIterator[TValue](asyncIterable: AsyncIterable[TValue]): AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("iterall", "getAsyncIteratorMethod")
  @js.native
  def getAsyncIteratorMethod(asyncIterable: js.Any): Unit | (js.Function0[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]]) = js.native
  @JSImport("iterall", "getAsyncIteratorMethod")
  @js.native
  def getAsyncIteratorMethod[TValue](asyncIterable: AsyncIterable[TValue]): js.Function0[AsyncIterator[TValue, _, js.UndefOr[scala.Nothing]]] = js.native
  
  @JSImport("iterall", "getIterator")
  @js.native
  def getIterator(iterable: js.Any): Unit | js.Iterator[_] = js.native
  @JSImport("iterall", "getIterator")
  @js.native
  def getIterator[TValue](iterable: js.Iterable[TValue]): js.Iterator[TValue] = js.native
  
  @JSImport("iterall", "getIteratorMethod")
  @js.native
  def getIteratorMethod(iterable: js.Any): Unit | js.Function0[js.Iterator[_]] = js.native
  @JSImport("iterall", "getIteratorMethod")
  @js.native
  def getIteratorMethod[TValue](iterable: js.Iterable[TValue]): js.Function0[js.Iterator[TValue]] = js.native
  
  @JSImport("iterall", "isArrayLike")
  @js.native
  def isArrayLike(obj: js.Any): /* is iterall.anon.Length */ Boolean = js.native
  
  @JSImport("iterall", "isAsyncIterable")
  @js.native
  def isAsyncIterable(obj: js.Any): /* is std.AsyncIterable<any> */ Boolean = js.native
  
  @JSImport("iterall", "isCollection")
  @js.native
  def isCollection(obj: js.Any): Boolean = js.native
  
  @JSImport("iterall", "isIterable")
  @js.native
  def isIterable(obj: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  
  @JSImport("iterall", "$$iterator")
  @js.native
  val iterator: js.Symbol = js.native
  
  type ResolvedOf[TCollection] = js.Any
  
  type ValueOf[TCollection] = js.Any
}
