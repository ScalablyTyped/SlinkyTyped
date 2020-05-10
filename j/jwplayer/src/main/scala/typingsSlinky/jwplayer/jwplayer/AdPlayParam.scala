package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdPlayParam extends js.Object {
  var creativetype: String = js.native
  var newstate: String = js.native
  var oldstate: String = js.native
  var tag: String = js.native
}

object AdPlayParam {
  @scala.inline
  def apply(creativetype: String, newstate: String, oldstate: String, tag: String): AdPlayParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdPlayParam]
  }
  @scala.inline
  implicit class AdPlayParamOps[Self <: AdPlayParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

