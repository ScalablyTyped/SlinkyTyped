package typingsSlinky.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoIndex extends js.Object {
  /**
    * set to false to disable automatic index creation for all
    * models associated with this connection.
    */
  var autoIndex: js.UndefOr[Boolean] = js.native
}

object AutoIndex {
  @scala.inline
  def apply(): AutoIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoIndex]
  }
  @scala.inline
  implicit class AutoIndexOps[Self <: AutoIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

