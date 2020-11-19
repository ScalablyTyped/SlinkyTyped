package typingsSlinky.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object g {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.mod.g.Line
    - js.Array[typingsSlinky.jointjs.mod.g.Curve | typingsSlinky.jointjs.mod.g.Line]
    - typingsSlinky.jointjs.mod.g.Curve
  */
  type PathObjectUnit = typingsSlinky.jointjs.mod.g._PathObjectUnit | (js.Array[typingsSlinky.jointjs.mod.g.Curve | typingsSlinky.jointjs.mod.g.Line])
  
  type PathSegmentUnit = typingsSlinky.jointjs.mod.g.Segment | js.Array[typingsSlinky.jointjs.mod.g.Segment]
  
  type SegmentTypes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jointjs.mod.g.Segment]
}
