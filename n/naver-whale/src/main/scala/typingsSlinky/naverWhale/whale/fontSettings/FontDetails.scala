package typingsSlinky.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontDetails extends js.Object {
  /** The generic font family for the font. */
  var genericFamily: String = js.native
  /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
  var script: js.UndefOr[String] = js.native
}

object FontDetails {
  @scala.inline
  def apply(genericFamily: String): FontDetails = {
    val __obj = js.Dynamic.literal(genericFamily = genericFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDetails]
  }
  @scala.inline
  implicit class FontDetailsOps[Self <: FontDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenericFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
  }
  
}

