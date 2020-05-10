package typingsSlinky.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSequenceOptions extends js.Object {
  var temp: js.UndefOr[Boolean] = js.native
}

object CreateSequenceOptions {
  @scala.inline
  def apply(): CreateSequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSequenceOptions]
  }
  @scala.inline
  implicit class CreateSequenceOptionsOps[Self <: CreateSequenceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temp")(js.undefined)
        ret
    }
  }
  
}

