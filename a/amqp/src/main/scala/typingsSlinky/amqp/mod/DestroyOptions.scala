package typingsSlinky.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyOptions extends js.Object {
  /**
    * Default: false
    *
    * Will ony be deleted if the queue has no messages
    */
  var ifEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * Will only destroy the queue if it has no consumers
    */
  var ifUnused: js.UndefOr[Boolean] = js.native
}

object DestroyOptions {
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  @scala.inline
  implicit class DestroyOptionsOps[Self <: DestroyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withIfUnused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifUnused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfUnused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifUnused")(js.undefined)
        ret
    }
  }
  
}

