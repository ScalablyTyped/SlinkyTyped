package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Properties")
@js.native
class Properties ()
  extends typingsSlinky.openjscad.CSG.Properties {
  /* CompleteClass */
  override var center: js.Any = js.native
  /* CompleteClass */
  override var cube: typingsSlinky.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var cylinder: typingsSlinky.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var end: js.Any = js.native
  /* CompleteClass */
  override var facecenters: js.Array[_] = js.native
  /* CompleteClass */
  override var facepoint: js.Any = js.native
  /* CompleteClass */
  override var facepointH: js.Any = js.native
  /* CompleteClass */
  override var facepointH90: js.Any = js.native
  /* CompleteClass */
  override var roundedCube: typingsSlinky.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var roundedCylinder: js.Any = js.native
  /* CompleteClass */
  override var sphere: typingsSlinky.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var start: js.Any = js.native
  /* CompleteClass */
  override def _merge(otherproperties: typingsSlinky.openjscad.CSG.Properties): typingsSlinky.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override def _transform(matrix4x4: typingsSlinky.openjscad.CSG.Matrix4x4): typingsSlinky.openjscad.CSG.Properties = js.native
}

/* static members */
@JSGlobal("CSG.Properties")
@js.native
object Properties extends js.Object {
  def addFrom(result: js.Any, otherproperties: typingsSlinky.openjscad.CSG.Properties): Unit = js.native
  def cloneObj(source: js.Any, result: js.Any): Unit = js.native
  def transformObj(source: js.Any, result: js.Any, matrix4x4: typingsSlinky.openjscad.CSG.Matrix4x4): Unit = js.native
}

