package typingsSlinky.reactSpringShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Animatable[T] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @react-spring/shared.@react-spring/shared/esm/types.Animatable<T[P]> * / object}
    */ typingsSlinky.reactSpringShared.reactSpringSharedStrings.Animatable with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double
  
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  
  type FrameRequestCallback = js.Function1[/* time */ js.UndefOr[scala.Double], scala.Unit]
  
  type InterpolatorArgs[In, Out] = (js.Array[
    typingsSlinky.reactSpringShared.typesMod.InterpolatorConfig[Out] | (typingsSlinky.reactSpringShared.typesMod.InterpolatorFn[typingsSlinky.reactSpringShared.typesUtilMod.Arrify[In], Out])
  ]) | (js.Tuple3[
    js.Array[scala.Double], 
    js.Array[
      typingsSlinky.reactSpringShared.typesUtilMod.Constrain[Out, typingsSlinky.reactSpringShared.typesMod.Animatable[js.Any]]
    ], 
    js.UndefOr[typingsSlinky.reactSpringShared.typesMod.ExtrapolateType]
  ])
  
  type InterpolatorFn[In, Out] = js.Function1[/* inputs */ typingsSlinky.reactSpringShared.typesUtilMod.Arrify[In], Out]
}
