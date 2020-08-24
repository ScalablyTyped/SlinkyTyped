package typingsSlinky.ionicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilPublicRuntimeMod {
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.ComponentOptions], 
    typingsSlinky.std.ClassDecorator
  ]
  type CustomMethodDecorator[T] = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.std.TypedPropertyDescriptor[T], 
    typingsSlinky.std.TypedPropertyDescriptor[T] | scala.Unit
  ]
  type ElementDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  type EventDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.EventOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode], 
    /* utils */ typingsSlinky.ionicons.stencilPublicRuntimeMod.FunctionalUtilities, 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode | js.Array[typingsSlinky.ionicons.stencilPublicRuntimeMod.VNode]
  ]
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.ListenOptions], 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.MethodOptions], 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicons.stencilPublicRuntimeMod.PropOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
  type ResolutionHandler = js.Function1[
    /* elm */ org.scalajs.dom.raw.HTMLElement, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type StateDecorator = js.Function0[typingsSlinky.std.PropertyDecorator]
  type WatchDecorator = js.Function1[
    /* propName */ java.lang.String, 
    typingsSlinky.ionicons.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
}
