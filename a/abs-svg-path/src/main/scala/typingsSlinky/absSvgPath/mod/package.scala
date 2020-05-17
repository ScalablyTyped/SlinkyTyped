package typingsSlinky.absSvgPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AbsArcCommand = js.Tuple8[
    typingsSlinky.absSvgPath.absSvgPathStrings.A, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type AbsBezierCurveCommand = js.Tuple7[
    typingsSlinky.absSvgPath.absSvgPathStrings.C, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type AbsClosePathCommand = js.Array[typingsSlinky.absSvgPath.absSvgPathStrings.Z]
  type AbsFollowingBezierCurveCommand = js.Tuple5[
    typingsSlinky.absSvgPath.absSvgPathStrings.S, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type AbsFollowingQuadraticCurveCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.T, scala.Double, scala.Double]
  type AbsHorizontalCommand = js.Tuple2[typingsSlinky.absSvgPath.absSvgPathStrings.H, scala.Double]
  type AbsLineCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.L, scala.Double, scala.Double]
  type AbsMoveCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.M, scala.Double, scala.Double]
  type AbsQuadraticCurveCommand = js.Tuple5[
    typingsSlinky.absSvgPath.absSvgPathStrings.Q, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type AbsVerticalCommand = js.Tuple2[typingsSlinky.absSvgPath.absSvgPathStrings.V, scala.Double]
  type RelArcCommand = js.Tuple8[
    typingsSlinky.absSvgPath.absSvgPathStrings.a_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type RelBezierCurveCommand = js.Tuple7[
    typingsSlinky.absSvgPath.absSvgPathStrings.c_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type RelClosePathCommand = js.Array[typingsSlinky.absSvgPath.absSvgPathStrings.z_]
  type RelFollowingBezierCurveCommand = js.Tuple5[
    typingsSlinky.absSvgPath.absSvgPathStrings.s_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type RelFollowingQuadraticCurveCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.t_, scala.Double, scala.Double]
  type RelHorizontalCommand = js.Tuple2[typingsSlinky.absSvgPath.absSvgPathStrings.h_, scala.Double]
  type RelLineCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.l_, scala.Double, scala.Double]
  type RelMoveCommand = js.Tuple3[typingsSlinky.absSvgPath.absSvgPathStrings.m_, scala.Double, scala.Double]
  type RelQuadraticCurveCommand = js.Tuple5[
    typingsSlinky.absSvgPath.absSvgPathStrings.q_, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
  type RelVerticalCommand = js.Tuple2[typingsSlinky.absSvgPath.absSvgPathStrings.v_, scala.Double]
}
