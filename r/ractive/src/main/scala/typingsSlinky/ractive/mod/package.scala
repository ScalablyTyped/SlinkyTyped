package typingsSlinky.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdaptorPrefixer = js.Function1[/* map */ typingsSlinky.ractive.mod.ValueMap, typingsSlinky.ractive.mod.ValueMap]
  type Component = typingsSlinky.ractive.mod.Static[typingsSlinky.ractive.mod.Ractive[typingsSlinky.ractive.mod.Ractive[js.Any]]] | (js.Promise[
    typingsSlinky.ractive.mod.Static[typingsSlinky.ractive.mod.Ractive[typingsSlinky.ractive.mod.Ractive[js.Any]]]
  ])
  type Computation[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = java.lang.String | typingsSlinky.ractive.mod.ComputationFn[T] | typingsSlinky.ractive.mod.ComputationDescriptor[T]
  type ComputationFn[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, js.Any]
  type CssFn = js.Function1[/* data */ typingsSlinky.ractive.mod.DataGetFn, java.lang.String]
  type Data = typingsSlinky.ractive.mod.ValueMap
  type DataFn[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, typingsSlinky.ractive.mod.ValueMap]
  type DataGetFn = js.Function1[/* keypath */ java.lang.String, js.Any]
  type Decorator[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* repeated */ js.Any, 
    typingsSlinky.ractive.mod.DecoratorHandle
  ]
  type Easing = js.Function1[/* time */ scala.Double, scala.Double]
  type EventPlugin[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* fire */ js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit], 
    typingsSlinky.ractive.anon.Teardown
  ]
  type Helper = js.ThisFunction1[
    /* this */ typingsSlinky.ractive.mod.Ractive[typingsSlinky.ractive.mod.Ractive[js.Any]], 
    /* repeated */ js.Any, 
    js.Any
  ]
  type Interpolator = js.Function2[/* from */ js.Any, /* to */ js.Any, js.Function1[/* t */ scala.Double, js.Any]]
  type ListenerCallback[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* ctx */ typingsSlinky.ractive.mod.ContextHelper, 
    /* repeated */ js.Any, 
    scala.Boolean | scala.Unit | js.Promise[js.Any]
  ]
  type MacroFn = js.Function1[/* MacroHelper */ js.Any, typingsSlinky.ractive.mod.MacroHandle]
  type ObserverArrayCallback[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction1[
    /* this */ T, 
    /* changes */ typingsSlinky.ractive.mod.ArrayChanges, 
    scala.Unit | js.Promise[js.Any]
  ]
  type ObserverCallback[T /* <: typingsSlinky.ractive.mod.Ractive[T] */] = js.ThisFunction4[
    /* this */ T, 
    /* value */ js.Any, 
    /* old */ js.Any, 
    /* keypath */ java.lang.String, 
    /* repeated */ java.lang.String, 
    scala.Unit | js.Promise[js.Any]
  ]
  type ParseDelimiters = js.Tuple2[java.lang.String, java.lang.String]
  type ParseFn = js.Function1[
    /* helper */ typingsSlinky.ractive.mod.ParseHelper, 
    java.lang.String | (js.Array[js.Object | java.lang.String]) | typingsSlinky.ractive.mod.ParsedTemplate
  ]
  type Partial = java.lang.String | js.Array[js.Any] | typingsSlinky.ractive.mod.ParseFn | typingsSlinky.ractive.mod.Macro
  type PartialMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ractive.mod.Partial]
  type Plugin = js.Function1[/* PluginArgsBase */ js.Any, scala.Unit]
  type PluginExtend = js.Function1[/* PluginArgsExtend */ js.Any, scala.Unit]
  type PluginInstance = js.Function1[/* PluginArgsInstance */ js.Any, scala.Unit]
  type Registry[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ShuffleFn = js.Function2[
    /* left */ js.Any, 
    /* right */ js.Any, 
    typingsSlinky.ractive.ractiveNumbers.`1` | typingsSlinky.ractive.ractiveNumbers.`0` | typingsSlinky.ractive.ractiveNumbers.`-1`
  ]
  type Shuffler = scala.Boolean | java.lang.String | typingsSlinky.ractive.mod.ShuffleFn
  type Target = java.lang.String | org.scalajs.dom.raw.HTMLElement | typingsSlinky.std.ArrayLike[js.Any]
  type Template = typingsSlinky.ractive.mod.ParsedTemplate | java.lang.String | js.Array[js.Any] | typingsSlinky.ractive.mod.ParseFn
  type Transition = js.Function2[
    /* helper */ typingsSlinky.ractive.mod.TransitionHelper, 
    /* repeated */ js.Any, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ValueMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
