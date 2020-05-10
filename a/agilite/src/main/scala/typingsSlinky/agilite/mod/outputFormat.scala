package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait outputFormat extends js.Object {
  var ARRAY: String = js.native
  var JSON: String = js.native
  var STRING: String = js.native
}

object outputFormat {
  @scala.inline
  def apply(ARRAY: String, JSON: String, STRING: String): outputFormat = {
    val __obj = js.Dynamic.literal(ARRAY = ARRAY.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
    __obj.asInstanceOf[outputFormat]
  }
  @scala.inline
  implicit class outputFormatOps[Self <: outputFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARRAY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARRAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJSON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTRING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STRING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

