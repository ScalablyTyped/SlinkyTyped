package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var instance: typingsSlinky.firebaseDatabase.databaseMod.Database
  var namespace: DataSnapshot
}

object Instance {
  @scala.inline
  def apply(instance: typingsSlinky.firebaseDatabase.databaseMod.Database, namespace: DataSnapshot): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

