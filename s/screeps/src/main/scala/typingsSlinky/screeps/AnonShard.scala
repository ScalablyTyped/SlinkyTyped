package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShard extends js.Object {
  var room: String = js.native
  var shard: String = js.native
}

object AnonShard {
  @scala.inline
  def apply(room: String, shard: String): AnonShard = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShard]
  }
  @scala.inline
  implicit class AnonShardOps[Self <: AnonShard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

