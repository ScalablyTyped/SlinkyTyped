package typingsSlinky.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<mongoose.mongoose.ConnectionOptions, 'autoIndex' | 'autoCreate' | 'useCreateIndex' | 'useFindAndModify' | 'bufferCommands'> */
@js.native
trait PickConnectionOptionsauto extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.native
  var autoIndex: js.UndefOr[Boolean] = js.native
  var bufferCommands: js.UndefOr[Boolean] = js.native
  var useCreateIndex: js.UndefOr[Boolean] = js.native
  var useFindAndModify: js.UndefOr[Boolean] = js.native
}

object PickConnectionOptionsauto {
  @scala.inline
  def apply(): PickConnectionOptionsauto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickConnectionOptionsauto]
  }
  @scala.inline
  implicit class PickConnectionOptionsautoOps[Self <: PickConnectionOptionsauto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferCommands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCreateIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCreateIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCreateIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCreateIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFindAndModify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFindAndModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFindAndModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFindAndModify")(js.undefined)
        ret
    }
  }
  
}

