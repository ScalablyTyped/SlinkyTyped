package typingsSlinky.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FlattenInterpolation[P] = typingsSlinky.graphqlBinding.typesMod.InterpolationValue | typingsSlinky.graphqlBinding.typesMod.InterpolationFunction[P]
  
  type Interpolation[P] = typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P] | (js.Array[
    typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P] | js.Array[typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P]]
  ])
  
  type InterpolationValue = java.lang.String | scala.Double | scala.Boolean
  
  type Maybe[T] = js.UndefOr[scala.Null | T]
  
  type SimpleInterpolation = typingsSlinky.graphqlBinding.typesMod.InterpolationValue | (js.Array[
    typingsSlinky.graphqlBinding.typesMod.InterpolationValue | js.Array[typingsSlinky.graphqlBinding.typesMod.InterpolationValue]
  ])
}
