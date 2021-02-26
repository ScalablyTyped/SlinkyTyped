package typingsSlinky.baconjs

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
import typingsSlinky.baconjs.busMod.default
import typingsSlinky.baconjs.combinetemplateMod.CombinedTemplate
import typingsSlinky.baconjs.compositeunsubscribeMod.Subscription
import typingsSlinky.baconjs.frombinderMod.Binder
import typingsSlinky.baconjs.frombinderMod.EventTransformer
import typingsSlinky.baconjs.fromeventMod.EventSourceFn
import typingsSlinky.baconjs.frompollMod.PollFunction
import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.retryMod.RetryOptions
import typingsSlinky.baconjs.schedulerMod.Scheduler
import typingsSlinky.baconjs.spyMod.Spy_
import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Function0
import typingsSlinky.baconjs.typesMod.Function1
import typingsSlinky.baconjs.typesMod.Function2
import typingsSlinky.baconjs.typesMod.Function3
import typingsSlinky.baconjs.typesMod.Function4
import typingsSlinky.baconjs.typesMod.Function5
import typingsSlinky.baconjs.typesMod.Function6
import typingsSlinky.baconjs.typesMod.Sink
import typingsSlinky.baconjs.typesMod.Subscribe
import typingsSlinky.baconjs.typesMod.Unsub
import typingsSlinky.baconjs.typesMod.VoidSink
import typingsSlinky.baconjs.updateMod.UpdatePattern
import typingsSlinky.baconjs.whenMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("baconjs", "Bus")
  @js.native
  class Bus[V] () extends default[V]
  
  @JSImport("baconjs", "CompositeUnsubscribe")
  @js.native
  class CompositeUnsubscribe ()
    extends typingsSlinky.baconjs.compositeunsubscribeMod.default {
    def this(ss: js.Array[Subscription]) = this()
  }
  
  @JSImport("baconjs", "Desc")
  @js.native
  class Desc protected ()
    extends typingsSlinky.baconjs.describeMod.Desc {
    def this(context: js.Any, method: String) = this()
    def this(context: js.Any, method: String, args: js.Array[_]) = this()
  }
  
  @JSImport("baconjs", "End")
  @js.native
  class End ()
    extends typingsSlinky.baconjs.eventMod.End
  
  @JSImport("baconjs", "Error")
  @js.native
  class Error protected ()
    extends typingsSlinky.baconjs.eventMod.Error {
    def this(error: js.Any) = this()
  }
  
  @JSImport("baconjs", "Event")
  @js.native
  abstract class Event[V] ()
    extends typingsSlinky.baconjs.eventMod.Event[V]
  
  @JSImport("baconjs", "EventStream")
  @js.native
  class EventStream[V] protected ()
    extends typingsSlinky.baconjs.observableMod.EventStream[V] {
    def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
    def this(
      desc: typingsSlinky.baconjs.describeMod.Desc,
      subscribe: Subscribe[V],
      handler: js.UndefOr[scala.Nothing],
      options: EventStreamOptions
    ) = this()
    def this(
      desc: typingsSlinky.baconjs.describeMod.Desc,
      subscribe: Subscribe[V],
      handler: EventSink[V],
      options: EventStreamOptions
    ) = this()
  }
  
  @JSImport("baconjs", "Initial")
  @js.native
  class Initial[V] protected ()
    extends typingsSlinky.baconjs.eventMod.Initial[V] {
    def this(value: V) = this()
  }
  
  @JSImport("baconjs", "Next")
  @js.native
  class Next[V] protected ()
    extends typingsSlinky.baconjs.eventMod.Next[V] {
    def this(value: V) = this()
  }
  
  @JSImport("baconjs", "Observable")
  @js.native
  abstract class Observable[V] protected ()
    extends typingsSlinky.baconjs.observableMod.Observable[V] {
    def this(desc: typingsSlinky.baconjs.describeMod.Desc) = this()
  }
  
  @JSImport("baconjs", "Property")
  @js.native
  class Property[V] protected ()
    extends typingsSlinky.baconjs.observableMod.Property[V] {
    def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  }
  
  @JSImport("baconjs", "Value")
  @js.native
  abstract class Value[V] protected ()
    extends typingsSlinky.baconjs.eventMod.Value[V] {
    def this(value: V) = this()
  }
  
  object _empty {
    
    @JSImport("baconjs", "$.asEventStream")
    @js.native
    def asEventStream(eventName: String, selector: js.UndefOr[scala.Nothing], eventTransformer: js.Any): typingsSlinky.baconjs.observableMod.EventStream[_] = js.native
    /**
      Creates an EventStream from events on a
      jQuery or Zepto.js object. You can pass optional arguments to add a
      jQuery live selector and/or a function that processes the jQuery
      event and its parameters, if given, like this:
      
      ```js
      $("#my-div").asEventStream("click", ".more-specific-selector")
      $("#my-div").asEventStream("click", ".more-specific-selector", function(event, args) { return args[0] })
      $("#my-div").asEventStream("click", function(event, args) { return args[0] })
      ```
      
      Note: you need to install the `asEventStream` method on JQuery by calling
      [init()](#_.aseventstream) as in `Bacon.$.init($)`.
      */
    @JSImport("baconjs", "$.asEventStream")
    @js.native
    def asEventStream(eventName: String, selector: String, eventTransformer: js.Any): typingsSlinky.baconjs.observableMod.EventStream[_] = js.native
    
    /**
      * Installs the [asEventStream](#_.aseventstream) to the given jQuery/Zepto object (the `$` object).
      */
    @JSImport("baconjs", "$.init")
    @js.native
    def init(jQuery: js.Any): Unit = js.native
  }
  
  object _underscore {
    
    @JSImport("baconjs", "_")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs", "_.all")
    @js.native
    def all: Fn7 = js.native
    @JSImport("baconjs", "_.all")
    @js.native
    def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
    @scala.inline
    def all_=(x: Fn7): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.always")
    @js.native
    def always: FnCallX = js.native
    @JSImport("baconjs", "_.always")
    @js.native
    def always[A](x: A): js.Function0[A] = js.native
    @scala.inline
    def always_=(x: FnCallX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.any")
    @js.native
    def any: js.Any = js.native
    @scala.inline
    def any_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.bind")
    @js.native
    def bind: FnCallFnMe = js.native
    @JSImport("baconjs", "_.bind")
    @js.native
    def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
    @scala.inline
    def bind_=(x: FnCallFnMe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bind")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.contains")
    @js.native
    def contains: FnCallXsX = js.native
    @JSImport("baconjs", "_.contains")
    @js.native
    def contains[A](xs: js.Array[A], x: A): Boolean = js.native
    @scala.inline
    def contains_=(x: FnCallXsX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.each")
    @js.native
    def each: Fn3 = js.native
    @JSImport("baconjs", "_.each")
    @js.native
    def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
    @scala.inline
    def each_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.empty")
    @js.native
    def empty: Fn0 = js.native
    @JSImport("baconjs", "_.empty")
    @js.native
    def empty[A](xs: js.Array[A]): Boolean = js.native
    @scala.inline
    def empty_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.filter")
    @js.native
    def filter: FnCallFXs = js.native
    @JSImport("baconjs", "_.filter")
    @js.native
    def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def filter_=(x: FnCallFXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.flatMap")
    @js.native
    def flatMap: Fn9 = js.native
    @JSImport("baconjs", "_.flatMap")
    @js.native
    def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
    @scala.inline
    def flatMap_=(x: Fn9): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.fold")
    @js.native
    def fold: FnCallXsSeedF = js.native
    @JSImport("baconjs", "_.fold")
    @js.native
    def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
    @scala.inline
    def fold_=(x: FnCallXsSeedF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fold")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.head")
    @js.native
    def head: FnCallXs = js.native
    @JSImport("baconjs", "_.head")
    @js.native
    def head[V](xs: js.Array[V]): V = js.native
    @scala.inline
    def head_=(x: FnCallXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.id")
    @js.native
    def id: Fn5 = js.native
    @JSImport("baconjs", "_.id")
    @js.native
    def id[A](x: A): A = js.native
    @scala.inline
    def id_=(x: Fn5): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.indexOf")
    @js.native
    def indexOf: FnCall = js.native
    @JSImport("baconjs", "_.indexOf")
    @js.native
    def indexOf[A](xs: js.Array[A], x: A): Double = js.native
    @scala.inline
    def indexOf_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.indexWhere")
    @js.native
    def indexWhere: FnCallXsF = js.native
    @JSImport("baconjs", "_.indexWhere")
    @js.native
    def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
    @scala.inline
    def indexWhere_=(x: FnCallXsF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexWhere")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.isFunction")
    @js.native
    def isFunction: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
    @JSImport("baconjs", "_.isFunction")
    @js.native
    def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
    @scala.inline
    def isFunction_=(x: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.last")
    @js.native
    def last: Fn6 = js.native
    @JSImport("baconjs", "_.last")
    @js.native
    def last[A](xs: js.Array[A]): A = js.native
    @scala.inline
    def last_=(x: Fn6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.map")
    @js.native
    def map: Fn2 = js.native
    @JSImport("baconjs", "_.map")
    @js.native
    def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
    @scala.inline
    def map_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.negate")
    @js.native
    def negate: FnCallF = js.native
    @JSImport("baconjs", "_.negate")
    @js.native
    def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
    @scala.inline
    def negate_=(x: FnCallF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negate")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.remove")
    @js.native
    def remove: Fn8 = js.native
    @JSImport("baconjs", "_.remove")
    @js.native
    def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
    @scala.inline
    def remove_=(x: Fn8): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.tail")
    @js.native
    def tail: Fn1 = js.native
    @JSImport("baconjs", "_.tail")
    @js.native
    def tail[V](xs: js.Array[V]): js.Array[V] = js.native
    @scala.inline
    def tail_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tail")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toArray")
    @js.native
    def toArray: Fn4 = js.native
    @JSImport("baconjs", "_.toArray")
    @js.native
    def toArray[A](xs: A): js.Array[A] = js.native
    @JSImport("baconjs", "_.toArray")
    @js.native
    def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def toArray_=(x: Fn4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArray")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toFunction")
    @js.native
    def toFunction: Fn10 = js.native
    @JSImport("baconjs", "_.toFunction")
    @js.native
    def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
    @JSImport("baconjs", "_.toFunction")
    @js.native
    def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
    @scala.inline
    def toFunction_=(x: Fn10): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toString")
    @js.native
    def toString_ : js.Function1[/* obj */ js.Any, String] = js.native
    @JSImport("baconjs", "_.toString")
    @js.native
    def toString_(obj: js.Any): String = js.native
    
    @scala.inline
    def toString__=(x: js.Function1[/* obj */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.without")
    @js.native
    def without: FnCallXXs = js.native
    @JSImport("baconjs", "_.without")
    @js.native
    def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def without_=(x: FnCallXXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("without")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baconjs", "combine")
  @js.native
  def combine[R](fn: js.Function, observables: js.Array[typingsSlinky.baconjs.observableMod.default[_]]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[R](fn: Function0[R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[R](observables: js.Array[typingsSlinky.baconjs.observableMod.default[_]], fn: js.Function): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, R](a: typingsSlinky.baconjs.observableMod.default[V], fn: Function1[V, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, R](fn: Function1[V, R], a: typingsSlinky.baconjs.observableMod.default[V]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    fn: Function2[V, V2, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, R](
    fn: Function2[V, V2, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    fn: Function3[V, V2, V3, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, R](
    fn: Function3[V, V2, V3, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    fn: Function4[V, V2, V3, V4, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, R](
    fn: Function4[V, V2, V3, V4, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, V6, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    f: typingsSlinky.baconjs.observableMod.default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    f: typingsSlinky.baconjs.observableMod.default[V6]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  
  @JSImport("baconjs", "combineAsArray")
  @js.native
  def combineAsArray[V](
    streams: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): typingsSlinky.baconjs.observableMod.Property[js.Array[V]] = js.native
  
  @JSImport("baconjs", "combineTemplate")
  @js.native
  def combineTemplate[T](template: T): typingsSlinky.baconjs.observableMod.Property[CombinedTemplate[T]] = js.native
  
  @JSImport("baconjs", "combineTwo")
  @js.native
  def combineTwo[V, V2, R](
    left: typingsSlinky.baconjs.observableMod.default[V],
    right: typingsSlinky.baconjs.observableMod.default[V2],
    f: Function2[V, V2, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[R](fn: js.Function, observables: js.Array[typingsSlinky.baconjs.observableMod.default[_]]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[R](fn: Function0[R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[R](observables: js.Array[typingsSlinky.baconjs.observableMod.default[_]], fn: js.Function): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, R](a: typingsSlinky.baconjs.observableMod.default[V], fn: Function1[V, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, R](fn: Function1[V, R], a: typingsSlinky.baconjs.observableMod.default[V]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    fn: Function2[V, V2, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, R](
    fn: Function2[V, V2, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    fn: Function3[V, V2, V3, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, R](
    fn: Function3[V, V2, V3, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    fn: Function4[V, V2, V3, V4, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, R](
    fn: Function4[V, V2, V3, V4, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, V6, R](
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    f: typingsSlinky.baconjs.observableMod.default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  @JSImport("baconjs", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: typingsSlinky.baconjs.observableMod.default[V],
    b: typingsSlinky.baconjs.observableMod.default[V2],
    c: typingsSlinky.baconjs.observableMod.default[V3],
    d: typingsSlinky.baconjs.observableMod.default[V4],
    e: typingsSlinky.baconjs.observableMod.default[V5],
    f: typingsSlinky.baconjs.observableMod.default[V6]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  
  @JSImport("baconjs", "concatAll")
  @js.native
  def concatAll[V](
    streams_ : (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "constant")
  @js.native
  def constant[V](x: V): typingsSlinky.baconjs.observableMod.Property[V] = js.native
  
  @JSImport("baconjs", "fromArray")
  @js.native
  def fromArray[T](values: js.Array[T | typingsSlinky.baconjs.eventMod.Event[T]]): typingsSlinky.baconjs.observableMod.EventStream[T] = js.native
  
  @JSImport("baconjs", "fromBinder")
  @js.native
  def fromBinder[V](binder: Binder[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromBinder")
  @js.native
  def fromBinder[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromCallback")
  @js.native
  def fromCallback[V](f: js.Function, args: js.Any*): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromESObservable")
  @js.native
  def fromESObservable[V](_observable: js.Any): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromEvent")
  @js.native
  def fromEvent[V](target: js.Any, eventSource: String): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEvent")
  @js.native
  def fromEvent[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEvent")
  @js.native
  def fromEvent[V](target: js.Any, eventSource: EventSourceFn): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEvent")
  @js.native
  def fromEvent[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromEventTarget")
  @js.native
  def fromEventTarget[V](target: js.Any, eventSource: String): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEventTarget")
  @js.native
  def fromEventTarget[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEventTarget")
  @js.native
  def fromEventTarget[V](target: js.Any, eventSource: EventSourceFn): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromEventTarget")
  @js.native
  def fromEventTarget[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromNodeCallback")
  @js.native
  def fromNodeCallback[V](f: js.Function, args: js.Any*): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromPoll")
  @js.native
  def fromPoll[V](delay: Double, poll: PollFunction[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "fromPromise")
  @js.native
  def fromPromise[V](promise: js.Promise[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromPromise")
  @js.native
  def fromPromise[V](promise: js.Promise[V], abort: js.UndefOr[scala.Nothing], eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromPromise")
  @js.native
  def fromPromise[V](promise: js.Promise[V], abort: Boolean): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "fromPromise")
  @js.native
  def fromPromise[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "getScheduler")
  @js.native
  def getScheduler(): Scheduler = js.native
  
  @JSImport("baconjs", "groupSimultaneous")
  @js.native
  def groupSimultaneous[V](
    streams: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): typingsSlinky.baconjs.observableMod.EventStream[js.Array[js.Array[V]]] = js.native
  
  @JSImport("baconjs", "hasValue")
  @js.native
  def hasValue[V](e: typingsSlinky.baconjs.eventMod.Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = js.native
  
  @JSImport("baconjs", "interval")
  @js.native
  def interval[V](delay: Double, value: V): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "isEnd")
  @js.native
  def isEnd[V](e: typingsSlinky.baconjs.eventMod.Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = js.native
  
  @JSImport("baconjs", "isError")
  @js.native
  def isError[V](e: typingsSlinky.baconjs.eventMod.Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = js.native
  
  @JSImport("baconjs", "isEvent")
  @js.native
  def isEvent[V](e: js.Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = js.native
  
  @JSImport("baconjs", "isInitial")
  @js.native
  def isInitial[V](e: typingsSlinky.baconjs.eventMod.Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = js.native
  
  @JSImport("baconjs", "isNext")
  @js.native
  def isNext[V](e: typingsSlinky.baconjs.eventMod.Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = js.native
  
  @JSImport("baconjs", "later")
  @js.native
  def later[V](delay: Double, value: V): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "mergeAll")
  @js.native
  def mergeAll[V](
    streams: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "more")
  @js.native
  val more: Reply = js.native
  
  @JSImport("baconjs", "never")
  @js.native
  def never[V](): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "noMore")
  @js.native
  val noMore: Reply = js.native
  
  @JSImport("baconjs", "nullSink")
  @js.native
  val nullSink: Sink[js.Any] = js.native
  
  @JSImport("baconjs", "nullVoidSink")
  @js.native
  val nullVoidSink: VoidSink = js.native
  
  @JSImport("baconjs", "onValues")
  @js.native
  def onValues(args: js.Any*): Unsub = js.native
  
  @JSImport("baconjs", "once")
  @js.native
  def once[V](value: V): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  @JSImport("baconjs", "once")
  @js.native
  def once[V](value: typingsSlinky.baconjs.eventMod.Event[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "repeat")
  @js.native
  def repeat[V](
    generator: js.Function1[/* iteration */ Double, js.UndefOr[typingsSlinky.baconjs.observableMod.default[V]]]
  ): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "repeatedly")
  @js.native
  def repeatedly[V](delay: Double, values: js.Array[V | typingsSlinky.baconjs.eventMod.Event[V]]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "retry")
  @js.native
  def retry[V](options: RetryOptions[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "sequentially")
  @js.native
  def sequentially[V](delay: Double, values: js.Array[V | typingsSlinky.baconjs.eventMod.Event[V]]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "setScheduler")
  @js.native
  def setScheduler(newScheduler: Scheduler): Unit = js.native
  
  @JSImport("baconjs", "silence")
  @js.native
  def silence[V](duration: Double): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  
  @JSImport("baconjs", "spy")
  @js.native
  def spy(spy: Spy_): Double = js.native
  
  @JSImport("baconjs", "update")
  @js.native
  def update[Out](initial: Out, patterns: UpdatePattern[Out]*): typingsSlinky.baconjs.observableMod.Property[Out] = js.native
  
  @JSImport("baconjs", "version")
  @js.native
  val version: /* "__version__" */ String = js.native
  
  @JSImport("baconjs", "when")
  @js.native
  def when[O](patterns: Pattern[O]*): typingsSlinky.baconjs.observableMod.EventStream[O] = js.native
  
  @JSImport("baconjs", "zipAsArray")
  @js.native
  def zipAsArray[V](
    args: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): typingsSlinky.baconjs.observableMod.default[js.Array[V]] = js.native
  
  @JSImport("baconjs", "zipWith")
  @js.native
  def zipWith[Out](
    f: js.Function1[/* repeated */ js.Any, Out],
    streams: typingsSlinky.baconjs.observableMod.default[_]*
  ): typingsSlinky.baconjs.observableMod.EventStream[Out] = js.native
  
  @JSImport("baconjs", "try")
  @js.native
  def `try`[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typingsSlinky.baconjs.observableMod.EventStream[Out]] = js.native
}
