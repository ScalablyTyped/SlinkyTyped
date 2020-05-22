package typingsSlinky.breeze.global.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.EntityKey")
@js.native
class EntityKey protected ()
  extends typingsSlinky.breeze.breeze.EntityKey {
  def this(entityType: typingsSlinky.breeze.breeze.EntityType, keyValue: js.Any) = this()
  def this(entityType: typingsSlinky.breeze.breeze.EntityType, keyValues: js.Array[_]) = this()
  /* CompleteClass */
  override var entityType: typingsSlinky.breeze.breeze.EntityType = js.native
  /* CompleteClass */
  override var values: js.Array[_] = js.native
  /* CompleteClass */
  override def equals(entityKey: typingsSlinky.breeze.breeze.EntityKey): Boolean = js.native
}

/* static members */
@JSGlobal("breeze.EntityKey")
@js.native
object EntityKey extends js.Object {
  def equals(k1: typingsSlinky.breeze.breeze.EntityKey, k2: typingsSlinky.breeze.breeze.EntityKey): Boolean = js.native
}

