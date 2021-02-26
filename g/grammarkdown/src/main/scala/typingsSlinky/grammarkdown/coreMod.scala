package typingsSlinky.grammarkdown

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken
import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.grammarkdown.grammarkdownNumbers.`-1`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`0`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`1`
import typingsSlinky.prex.mod.CancellationToken
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Map
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("grammarkdown/dist/core", "binarySearch")
  @js.native
  def binarySearch(array: js.Array[Double], value: Double): Double = js.native
  
  @JSImport("grammarkdown/dist/core", "binarySearchBy")
  @js.native
  def binarySearchBy[T, K](array: js.Array[T], key: K, selector: js.Function1[/* value */ T, K]): Double = js.native
  @JSImport("grammarkdown/dist/core", "binarySearchBy")
  @js.native
  def binarySearchBy[T, K](
    array: js.Array[T],
    key: K,
    selector: js.Function1[/* value */ T, K],
    comparison: js.Function2[/* x */ K, /* y */ K, Double]
  ): Double = js.native
  
  @JSImport("grammarkdown/dist/core", "compare")
  @js.native
  def compare(x: js.Any, y: js.Any): `1` | `0` | `-1` = js.native
  
  @JSImport("grammarkdown/dist/core", "compareNumbers")
  @js.native
  def compareNumbers(a: Double, b: Double): Double = js.native
  
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: String): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: String, y: js.UndefOr[scala.Nothing], ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: String, y: String): `1` | `0` | `-1` = js.native
  @JSImport("grammarkdown/dist/core", "compareStrings")
  @js.native
  def compareStrings(x: String, y: String, ignoreCase: Boolean): `1` | `0` | `-1` = js.native
  
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat[T](): js.UndefOr[js.Array[T]] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat_T_Array[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.Array[T] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat_T_Array[T](a: js.Array[T]): js.Array[T] = js.native
  @JSImport("grammarkdown/dist/core", "concat")
  @js.native
  def concat_T_Array[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "deduplicateSorted")
  @js.native
  def deduplicateSorted[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double | Boolean]): js.Array[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "emptyIterable")
  @js.native
  val emptyIterable: IterableIterator[scala.Nothing] = js.native
  
  @JSImport("grammarkdown/dist/core", "first")
  @js.native
  def first[T](): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "first")
  @js.native
  def first[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "first")
  @js.native
  def first[T](iterable: js.Iterable[T]): js.UndefOr[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "forEach")
  @js.native
  def forEach[T, U](array: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  @JSImport("grammarkdown/dist/core", "forEach")
  @js.native
  def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  
  @JSImport("grammarkdown/dist/core", "forEachPossiblyAsync")
  @js.native
  def forEachPossiblyAsync[T, U](iterable: js.Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = js.native
  
  @JSImport("grammarkdown/dist/core", "getLocalPath")
  @js.native
  def getLocalPath(file: String): String = js.native
  
  @JSImport("grammarkdown/dist/core", "identity")
  @js.native
  def identity[T](value: T): T = js.native
  
  @JSImport("grammarkdown/dist/core", "isFileUri")
  @js.native
  def isFileUri(file: String): Boolean = js.native
  
  @JSImport("grammarkdown/dist/core", "isPromise")
  @js.native
  def isPromise[T](): /* is std.Promise<T> */ Boolean = js.native
  @JSImport("grammarkdown/dist/core", "isPromise")
  @js.native
  def isPromise[T](value: T): /* is std.Promise<T> */ Boolean = js.native
  @JSImport("grammarkdown/dist/core", "isPromise")
  @js.native
  def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = js.native
  
  @JSImport("grammarkdown/dist/core", "isUri")
  @js.native
  def isUri(file: String): Boolean = js.native
  
  @JSImport("grammarkdown/dist/core", "last")
  @js.native
  def last[T](): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "last")
  @js.native
  def last[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "last")
  @js.native
  def last[T](iterable: js.Iterable[T]): js.UndefOr[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "mapFromObject")
  @js.native
  def mapFromObject[T](`object`: DictionaryLike[T]): Map[String, T] = js.native
  
  @JSImport("grammarkdown/dist/core", "mapSet")
  @js.native
  def mapSet[K, V](map: Map[K, V], key: K, value: V): V = js.native
  @JSImport("grammarkdown/dist/core", "mapSet")
  @js.native
  def mapSet[K /* <: js.Object */, V](map: WeakMap[K, V], key: K, value: V): V = js.native
  
  @JSImport("grammarkdown/dist/core", "only")
  @js.native
  def only[T](): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "only")
  @js.native
  def only[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  @JSImport("grammarkdown/dist/core", "only")
  @js.native
  def only[T](iterable: js.Iterable[T]): js.UndefOr[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "pipe")
  @js.native
  def pipe[T, U](result: T, next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  @JSImport("grammarkdown/dist/core", "pipe")
  @js.native
  def pipe[T, U](
    result: js.UndefOr[scala.Nothing],
    next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  @JSImport("grammarkdown/dist/core", "pipe")
  @js.native
  def pipe[T, U](result: js.Promise[T], next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  
  @JSImport("grammarkdown/dist/core", "promiseFinally")
  @js.native
  def promiseFinally[T](promise: js.Thenable[T], onFinally: js.Function0[Unit]): js.Thenable[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "stableSort")
  @js.native
  def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  @JSImport("grammarkdown/dist/core", "toCancelToken")
  @js.native
  def toCancelToken(): js.UndefOr[CancelToken] = js.native
  @JSImport("grammarkdown/dist/core", "toCancelToken")
  @js.native
  def toCancelToken(cancelable: Cancelable): js.UndefOr[CancelToken] = js.native
  @JSImport("grammarkdown/dist/core", "toCancelToken")
  @js.native
  def toCancelToken_CancelToken(cancelable: Cancelable): CancelToken = js.native
  
  @JSImport("grammarkdown/dist/core", "wrapCancelToken")
  @js.native
  def wrapCancelToken(): js.UndefOr[CancelToken with CancellationToken] = js.native
  @JSImport("grammarkdown/dist/core", "wrapCancelToken")
  @js.native
  def wrapCancelToken(cancelToken: CancelToken): js.UndefOr[CancelToken with CancellationToken] = js.native
  @JSImport("grammarkdown/dist/core", "wrapCancelToken")
  @js.native
  def wrapCancelToken_Intersection(cancelToken: CancelToken): CancelToken with CancellationToken = js.native
  
  type DictionaryLike[T] = StringDictionary[T] with NumberDictionary[T]
}
