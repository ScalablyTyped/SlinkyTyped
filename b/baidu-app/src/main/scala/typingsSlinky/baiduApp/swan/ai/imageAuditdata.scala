package typingsSlinky.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait imageAuditdata extends js.Object {
  var msg: Double = js.native
  var probability: Double = js.native
  var stars: js.Array[imageAuditdata] = js.native
  var `type`: Double = js.native
  var words: Double = js.native
}

object imageAuditdata {
  @scala.inline
  def apply(msg: Double, probability: Double, stars: js.Array[imageAuditdata], `type`: Double, words: Double): imageAuditdata = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditdata]
  }
  @scala.inline
  implicit class imageAuditdataOps[Self <: imageAuditdata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProbability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStars(value: js.Array[imageAuditdata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

