package typingsSlinky.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Datums = typingsSlinky.geodesy.mod.Plural[typingsSlinky.geodesy.mod.Datum]
  type Ellipsoids = typingsSlinky.geodesy.mod.Plural[typingsSlinky.geodesy.mod.Ellipsoid]
  type Plural[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Polygon[T] = js.Array[T]
  type Transform = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}
