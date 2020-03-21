package typingsSlinky.geometryDom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends typingsSlinky.geometryDom.GeometryDom.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(rect: DOMRectInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  /* CompleteClass */
  override var bounds: typingsSlinky.geometryDom.GeometryDom.DOMRectReadOnly = js.native
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  /* CompleteClass */
  override var p1: typingsSlinky.geometryDom.GeometryDom.DOMPoint = js.native
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  /* CompleteClass */
  override var p2: typingsSlinky.geometryDom.GeometryDom.DOMPoint = js.native
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  /* CompleteClass */
  override var p3: typingsSlinky.geometryDom.GeometryDom.DOMPoint = js.native
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  /* CompleteClass */
  override var p4: typingsSlinky.geometryDom.GeometryDom.DOMPoint = js.native
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends Instantiable0[typingsSlinky.geometryDom.GeometryDom.DOMQuad]
     with Instantiable1[
      (/* p1 */ DOMPointInit) | (/* rect */ DOMRectInit), 
      typingsSlinky.geometryDom.GeometryDom.DOMQuad
    ]
     with Instantiable2[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      typingsSlinky.geometryDom.GeometryDom.DOMQuad
    ]
     with Instantiable3[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      typingsSlinky.geometryDom.GeometryDom.DOMQuad
    ]
     with Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      typingsSlinky.geometryDom.GeometryDom.DOMQuad
    ]

