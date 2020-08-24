package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilPublicRuntimeMod {
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentOptions], 
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
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.EventOptions], 
    typingsSlinky.std.PropertyDecorator
  ]
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode], 
    /* utils */ typingsSlinky.ionicCore.stencilPublicRuntimeMod.FunctionalUtilities, 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode | js.Array[typingsSlinky.ionicCore.stencilPublicRuntimeMod.VNode]
  ]
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.ListenOptions], 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.MethodOptions], 
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typingsSlinky.ionicCore.stencilPublicRuntimeMod.PropOptions], 
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
    typingsSlinky.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
}
