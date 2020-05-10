package typingsSlinky.datastoreCore.mod

import typingsSlinky.interfaceDatastore.mod.Datastore
import typingsSlinky.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mount[Value] extends js.Object {
  /**
    * The child datastore.
    */
  var datastore: Datastore[Value] = js.native
  /**
    * The mount prefix.
    */
  var prefix: Key = js.native
}

object Mount {
  @scala.inline
  def apply[Value](datastore: Datastore[Value], prefix: Key): Mount[Value] = {
    val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount[Value]]
  }
  @scala.inline
  implicit class MountOps[Self[value] <: Mount[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withDatastore(value: Datastore[Value]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: Key): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

