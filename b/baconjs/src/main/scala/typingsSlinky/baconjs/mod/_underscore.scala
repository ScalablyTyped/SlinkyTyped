package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.anon.Fn0
import typingsSlinky.baconjs.anon.Fn1
import typingsSlinky.baconjs.anon.Fn10
import typingsSlinky.baconjs.anon.Fn2
import typingsSlinky.baconjs.anon.Fn3
import typingsSlinky.baconjs.anon.Fn4
import typingsSlinky.baconjs.anon.Fn5
import typingsSlinky.baconjs.anon.Fn6
import typingsSlinky.baconjs.anon.Fn7
import typingsSlinky.baconjs.anon.Fn8
import typingsSlinky.baconjs.anon.Fn9
import typingsSlinky.baconjs.anon.FnCall
import typingsSlinky.baconjs.anon.FnCallF
import typingsSlinky.baconjs.anon.FnCallFXs
import typingsSlinky.baconjs.anon.FnCallFnMe
import typingsSlinky.baconjs.anon.FnCallX
import typingsSlinky.baconjs.anon.FnCallXXs
import typingsSlinky.baconjs.anon.FnCallXs
import typingsSlinky.baconjs.anon.FnCallXsF
import typingsSlinky.baconjs.anon.FnCallXsSeedF
import typingsSlinky.baconjs.anon.FnCallXsX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "_")
@js.native
object _underscore extends js.Object {
  
  def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
  @JSName("all")
  var all_Original: Fn7 = js.native
  
  def always[A](x: A): js.Function0[A] = js.native
  @JSName("always")
  var always_Original: FnCallX = js.native
  
  var any: js.Any = js.native
  
  def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
  @JSName("bind")
  var bind_Original: FnCallFnMe = js.native
  
  def contains[A](xs: js.Array[A], x: A): Boolean = js.native
  @JSName("contains")
  var contains_Original: FnCallXsX = js.native
  
  def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
  @JSName("each")
  var each_Original: Fn3 = js.native
  
  def empty[A](xs: js.Array[A]): Boolean = js.native
  @JSName("empty")
  var empty_Original: Fn0 = js.native
  
  def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSName("filter")
  var filter_Original: FnCallFXs = js.native
  
  def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  @JSName("flatMap")
  var flatMap_Original: Fn9 = js.native
  
  def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
  @JSName("fold")
  var fold_Original: FnCallXsSeedF = js.native
  
  def head[V](xs: js.Array[V]): V = js.native
  @JSName("head")
  var head_Original: FnCallXs = js.native
  
  def id[A](x: A): A = js.native
  @JSName("id")
  var id_Original: Fn5 = js.native
  
  def indexOf[A](xs: js.Array[A], x: A): Double = js.native
  @JSName("indexOf")
  var indexOf_Original: FnCall = js.native
  
  def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
  @JSName("indexWhere")
  var indexWhere_Original: FnCallXsF = js.native
  
  def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
  @JSName("isFunction")
  var isFunction_Original: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
  
  def last[A](xs: js.Array[A]): A = js.native
  @JSName("last")
  var last_Original: Fn6 = js.native
  
  def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  @JSName("map")
  var map_Original: Fn2 = js.native
  
  def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
  @JSName("negate")
  var negate_Original: FnCallF = js.native
  
  def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
  @JSName("remove")
  var remove_Original: Fn8 = js.native
  
  def tail[V](xs: js.Array[V]): js.Array[V] = js.native
  @JSName("tail")
  var tail_Original: Fn1 = js.native
  
  def toArray[A](xs: A): js.Array[A] = js.native
  def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
  @JSName("toArray")
  var toArray_Original: Fn4 = js.native
  
  def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
  def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
  @JSName("toFunction")
  var toFunction_Original: Fn10 = js.native
  
  def toString(obj: js.Any): String = js.native
  @JSName("toString")
  var toString_Original: js.Function1[/* obj */ js.Any, String] = js.native
  
  def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
  @JSName("without")
  var without_Original: FnCallXXs = js.native
}
