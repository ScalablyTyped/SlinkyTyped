package typingsSlinky.astDashTypes.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends BaseType[T]
     with Type[T] {
  val fields: js.Array[FieldType[_]] = js.native
  val kind: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectType = js.native
}

