package typingsSlinky.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellularMod {
  type ConnectionCallback = js.Function2[
    /* from */ typingsSlinky.rotJs.cellularMod.Point, 
    /* to */ typingsSlinky.rotJs.cellularMod.Point, 
    scala.Unit
  ]
  type Point = js.Tuple2[scala.Double, scala.Double]
  type PointMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rotJs.cellularMod.Point]
}
