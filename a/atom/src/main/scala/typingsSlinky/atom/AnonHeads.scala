package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeads extends js.Object {
  var heads: js.Array[String] = js.native
  var remotes: js.Array[String] = js.native
  var tags: js.Array[String] = js.native
}

object AnonHeads {
  @scala.inline
  def apply(heads: js.Array[String], remotes: js.Array[String], tags: js.Array[String]): AnonHeads = {
    val __obj = js.Dynamic.literal(heads = heads.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeads]
  }
  @scala.inline
  implicit class AnonHeadsOps[Self <: AnonHeads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeads(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

