package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPopulateOptions extends QueryPopulateOptions {
  /** optional, if true Mongoose will always set path to an array. Inferred from schema by default */
  var justOne: js.UndefOr[Boolean] = js.native
}

object ModelPopulateOptions {
  @scala.inline
  def apply(path: String): ModelPopulateOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPopulateOptions]
  }
  @scala.inline
  implicit class ModelPopulateOptionsOps[Self <: ModelPopulateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justOne")(js.undefined)
        ret
    }
  }
  
}

