package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.databaseMod.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstance extends js.Object {
  var instance: Database = js.native
  var namespace: AnonDataSnapshot = js.native
}

object AnonInstance {
  @scala.inline
  def apply(instance: Database, namespace: AnonDataSnapshot): AnonInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstance]
  }
  @scala.inline
  implicit class AnonInstanceOps[Self <: AnonInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: AnonDataSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

