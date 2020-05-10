package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPurge extends js.Object {
  var assert: Boolean = js.native
  var options: AnonDurable = js.native
  var purge: Boolean = js.native
}

object AnonPurge {
  @scala.inline
  def apply(assert: Boolean, options: AnonDurable, purge: Boolean): AnonPurge = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPurge]
  }
  @scala.inline
  implicit class AnonPurgeOps[Self <: AnonPurge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnonDurable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

