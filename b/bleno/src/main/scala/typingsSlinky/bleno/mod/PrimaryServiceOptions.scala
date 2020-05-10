package typingsSlinky.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryServiceOptions extends js.Object {
  var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.native
  var uuid: String = js.native
}

object PrimaryServiceOptions {
  @scala.inline
  def apply(uuid: String): PrimaryServiceOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryServiceOptions]
  }
  @scala.inline
  implicit class PrimaryServiceOptionsOps[Self <: PrimaryServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacteristics(value: js.Array[Characteristic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacteristics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacteristicsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(null)
        ret
    }
  }
  
}

