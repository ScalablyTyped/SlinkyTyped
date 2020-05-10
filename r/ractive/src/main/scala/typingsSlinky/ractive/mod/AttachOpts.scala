package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachOpts extends js.Object {
  /** If the target anchor is already occupied, this instance will be moved to the end of the queue to occupy it, meaning that all of the other attached instances will need to be detached before this one can occupy the anchor. */
  var append: js.UndefOr[Boolean] = js.native
  /** The index of the position in the queue for the target anchor at which to insert this instance. 0 is equivalent to prepend: true. */
  var insertAt: js.UndefOr[Double] = js.native
  /** If the target anchor is already occupied, this instance will be moved to the beginning of the queue to occupy it, meaning it will replace the instance currently occupying the anchor. */
  var prepend: js.UndefOr[Boolean] = js.native
  /** The name of an anchor to attach a child to e.g. 'foo' for <#foo />. */
  var target: js.UndefOr[String] = js.native
}

object AttachOpts {
  @scala.inline
  def apply(): AttachOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachOpts]
  }
  @scala.inline
  implicit class AttachOptsOps[Self <: AttachOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

