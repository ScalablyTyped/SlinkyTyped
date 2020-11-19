package typingsSlinky.reactMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[typingsSlinky.reactMotion.mod.TransitionPlainStyle]], 
    js.Array[typingsSlinky.reactMotion.mod.TransitionStyle]
  ]
  
  type PlainStyle = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | typingsSlinky.reactMotion.mod.OpaqueConfig]
  
  type Velocity = org.scalablytyped.runtime.StringDictionary[scala.Double]
}
