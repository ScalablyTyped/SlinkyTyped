package typingsSlinky.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RaphaelBasicEventHandler[ThisContext, TEvent /* <: typingsSlinky.std.Event_ */] = /**
    * @param event The original DOM event that triggered the event this handler was registered for.
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[/* this */ ThisContext, /* event */ TEvent, js.Any]
  type RaphaelConstructionOptionsArray4 = Array[
    java.lang.String | scala.Double | typingsSlinky.raphael.mod.RaphaelShapeDescriptor
  ]
  type RaphaelConstructionOptionsArray5 = Array[scala.Double | typingsSlinky.raphael.mod.RaphaelShapeDescriptor]
  type RaphaelCustomAttribute[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[scala.Double] */] = /**
    * @param values Numerical values for this custom attribute.
    * @return The SVG attributes for the given values.
    */
  js.ThisFunction1[
    /* this */ typingsSlinky.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    /* values */ TArgs, 
    typingsSlinky.raphael.PartialRaphaelAttributes
  ]
  type RaphaelCustomEasingFormula = java.lang.String with js.Object
  type RaphaelDragOnEndHandler[ThisContext] = /**
    * @param event DOM event object
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[/* this */ ThisContext, /* event */ org.scalajs.dom.raw.DragEvent, js.Any]
  type RaphaelDragOnMoveHandler[ThisContext] = /**
    * @param deltaX How much the pointer has moved in the horizontal direction compared to when this handler was most
    * recently invoked.
    * @param deltaY How much the pointer has moved in the vertical direction compared to when this handler was most
    * recently invoked.
    * @param mouseX The current horizontal position of the mouse.
    * @param mouseY The current vertical position of the mouse.
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction5[
    /* this */ ThisContext, 
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* mouseX */ scala.Double, 
    /* mouseY */ scala.Double, 
    /* event */ org.scalajs.dom.raw.DragEvent, 
    js.Any
  ]
  type RaphaelDragOnOverHandler[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, ThisContext] = /**
    * @param targetElement The element you are dragging over.
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction1[
    /* this */ ThisContext, 
    /* targetElement */ typingsSlinky.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    js.Any
  ]
  type RaphaelDragOnStartHandler[ThisContext] = /**
    * @param x position of the mouse
    * @param y position of the mouse
    * @param event DOM event object
    * @return A value that is returned as the return value of the `document.addEventListener` callback.
    */
  js.ThisFunction3[
    /* this */ ThisContext, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* event */ org.scalajs.dom.raw.DragEvent, 
    js.Any
  ]
  type RaphaelEasingFormula = /**
    * @param normalizedAnimationTime A percentage between `0` and `1`, with `0` representing the beginning and `1`
    * representing the end of the animation time.
    * @return The relative animation position, a percentage between `0` and `1` for where the animation should be at
    * the given animation time.
    */
  js.Function1[/* normalizedAnimationTime */ scala.Double, scala.Double]
  type RaphaelElementPluginMethod[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this element plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelElement}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelElement}.
    */
  js.ThisFunction1[
    /* this */ typingsSlinky.raphael.mod.RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ], 
    /* args */ TArgs, 
    TRetVal
  ]
  type RaphaelOnAnimationCompleteHandler[ThisContext] = js.ThisFunction0[/* this */ ThisContext, scala.Unit]
  type RaphaelPaperPluginMethod[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this paper plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelPaper}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelPaper}.
    */
  js.ThisFunction1[
    /* this */ typingsSlinky.raphael.mod.RaphaelPaper[TTechnology], 
    /* args */ TArgs, 
    TRetVal
  ]
  type RaphaelPaperPluginRegistry[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends (args : any): any? raphael.raphael.RaphaelPaperPluginMethod<TTechnology, std.Parameters<T[P]>, std.ReturnType<T[P]>> : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias raphael.raphael.RaphaelPaperPluginRegistry<TTechnology, T[P]> * / object}
    */ typingsSlinky.raphael.raphaelStrings.RaphaelPaperPluginRegistry with org.scalablytyped.runtime.TopLevel[js.Any]
  type RaphaelPathSegment = (js.Tuple3[
    typingsSlinky.raphael.raphaelStrings.M | typingsSlinky.raphael.raphaelStrings.m_ | typingsSlinky.raphael.raphaelStrings.L | typingsSlinky.raphael.raphaelStrings.l_ | typingsSlinky.raphael.raphaelStrings.T | typingsSlinky.raphael.raphaelStrings.t_ | typingsSlinky.raphael.raphaelStrings.R | typingsSlinky.raphael.raphaelStrings.r_, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple2[
    typingsSlinky.raphael.raphaelStrings.H | typingsSlinky.raphael.raphaelStrings.h_ | typingsSlinky.raphael.raphaelStrings.V | typingsSlinky.raphael.raphaelStrings.v_, 
    scala.Double
  ]) | (js.Tuple5[
    typingsSlinky.raphael.raphaelStrings.Q | typingsSlinky.raphael.raphaelStrings.q_ | typingsSlinky.raphael.raphaelStrings.S | typingsSlinky.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple7[
    typingsSlinky.raphael.raphaelStrings.C | typingsSlinky.raphael.raphaelStrings.c_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple8[
    typingsSlinky.raphael.raphaelStrings.A | typingsSlinky.raphael.raphaelStrings.a_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Array[typingsSlinky.raphael.raphaelStrings.Z | typingsSlinky.raphael.raphaelStrings.z_])
  type RaphaelPotentialFailure[T /* <: js.Object */] = T with typingsSlinky.raphael.AnonError
  type RaphaelSetPluginMethod[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, TArgs /* <: js.Array[_] */, TRetVal] = /**
    * @param args The arguments, as required by this set plugin. They need to be passed when the plugin method
    * is called on a {@link RaphaelSet}.
    * @return The value that should be returned by this plugin method. This is also the value that is returned when
    * this plugin method is called on a {@link RaphaelSet}.
    */
  js.ThisFunction1[
    /* this */ typingsSlinky.raphael.mod.RaphaelSet[TTechnology], 
    /* args */ TArgs, 
    TRetVal
  ]
  type RaphaelTransformSegment = (js.Tuple3[
    typingsSlinky.raphael.raphaelStrings.t_ | typingsSlinky.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple5[
    typingsSlinky.raphael.raphaelStrings.s_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]) | (js.Tuple4[typingsSlinky.raphael.raphaelStrings.r_, scala.Double, scala.Double, scala.Double]) | (js.Tuple2[typingsSlinky.raphael.raphaelStrings.r_, scala.Double]) | (js.Tuple7[
    typingsSlinky.raphael.raphaelStrings.m_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ])
  type RaphaelUnwrapElement[TTechnology /* <: typingsSlinky.raphael.mod.RaphaelTechnology */, TBase /* <: typingsSlinky.raphael.mod.RaphaelBaseElement[TTechnology] */] = TBase | (typingsSlinky.raphael.mod.RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ])
  type VMLCircleElement = org.scalajs.dom.raw.Element
  type VMLElement = org.scalajs.dom.raw.Element
  type VMLEllipseElement = org.scalajs.dom.raw.Element
  type VMLImageElement = org.scalajs.dom.raw.Element
  type VMLPathElement = org.scalajs.dom.raw.Element
  type VMLRectElement = org.scalajs.dom.raw.Element
  type VMLTextElement = org.scalajs.dom.raw.Element
}
