package typingsSlinky.geometryDashDom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends typingsSlinky.geometryDashDom.GeometryDom.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  /**
    * w coordinate / readonly
    */
  /* CompleteClass */
  override var w: Double = js.native
  /**
    * x coordinate / readonly
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * y coordinate / readonly
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * z coordinate / readonly
    */
  /* CompleteClass */
  override var z: Double = js.native
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  /* CompleteClass */
  override def matrixTransform(matrix: typingsSlinky.geometryDashDom.GeometryDom.DOMMatrixReadOnly): typingsSlinky.geometryDashDom.GeometryDom.DOMPoint = js.native
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends Instantiable0[typingsSlinky.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable1[/* x */ Double, typingsSlinky.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, typingsSlinky.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable3[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
    ]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typingsSlinky.geometryDashDom.GeometryDom.DOMPoint
    ]

