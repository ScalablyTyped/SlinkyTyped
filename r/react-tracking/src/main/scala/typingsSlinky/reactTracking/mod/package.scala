package typingsSlinky.reactTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  type Decorator = typingsSlinky.reactTracking.mod.ClassDecorator with typingsSlinky.reactTracking.mod.MethodDecorator
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.std.TypedPropertyDescriptor[js.Any], 
    typingsSlinky.std.TypedPropertyDescriptor[js.Any]
  ]
  type Track_[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[
      typingsSlinky.reactTracking.mod.TrackingInfo[typingsSlinky.std.Pick[T, /* keyof T */ java.lang.String], P, S]
    ], 
    /* options */ js.UndefOr[typingsSlinky.reactTracking.mod.Options[typingsSlinky.std.Partial[T]]], 
    typingsSlinky.reactTracking.mod.Decorator
  ]
  type TrackingContext[T] = typingsSlinky.react.mod.Context[typingsSlinky.reactTracking.anon.Tracking[T]]
}
