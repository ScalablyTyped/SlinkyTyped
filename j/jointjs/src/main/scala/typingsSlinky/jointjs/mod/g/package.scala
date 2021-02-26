package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def normalizeAngle(angle: scala.Double): scala.Double = typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def random(): scala.Double = typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[scala.Double]
  @scala.inline
  def random(min: js.UndefOr[scala.Nothing], max: scala.Double): scala.Double = (typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def random(min: scala.Double): scala.Double = typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def random(min: scala.Double, max: scala.Double): scala.Double = (typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def snapToGrid(`val`: scala.Double, gridSize: scala.Double): scala.Double = (typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("snapToGrid")(`val`.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def toDeg(rad: scala.Double): scala.Double = typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def toRad(deg: scala.Double): scala.Double = typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def toRad(deg: scala.Double, over360: scala.Boolean): scala.Double = (typingsSlinky.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any], over360.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
