package typingsSlinky.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NdefTag extends Tag {
  var canMakeReadOnly: Boolean = js.native
  var isWritable: Boolean = js.native
  var maxSize: Double = js.native
  var ndefMessage: js.Array[NdefRecord] = js.native
}

object NdefTag {
  @scala.inline
  def apply(
    canMakeReadOnly: Boolean,
    date: String,
    id: js.Array[Double],
    isWritable: Boolean,
    maxSize: Double,
    ndefMessage: js.Array[NdefRecord],
    techTypes: js.Array[String],
    `type`: String
  ): NdefTag = {
    val __obj = js.Dynamic.literal(canMakeReadOnly = canMakeReadOnly.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isWritable = isWritable.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], ndefMessage = ndefMessage.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NdefTag]
  }
  @scala.inline
  implicit class NdefTagOps[Self <: NdefTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanMakeReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMakeReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWritable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWritable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNdefMessage(value: js.Array[NdefRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndefMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

