package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsQuery extends js.Object {
   // Starting position of a specific list. A part is listed only when the part number is greater than the value of this parameter.
  var `encoding-type`: String = js.native
  var `max-parts`: Double = js.native
   // The maximum part number in the response of the OSS. default value: 1000.
  var `part-number-marker`: Double = js.native
}

object ListPartsQuery {
  @scala.inline
  def apply(`encoding-type`: String, `max-parts`: Double, `part-number-marker`: Double): ListPartsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding-type")(`encoding-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-parts")(`max-parts`.asInstanceOf[js.Any])
    __obj.updateDynamic("part-number-marker")(`part-number-marker`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsQuery]
  }
  @scala.inline
  implicit class ListPartsQueryOps[Self <: ListPartsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withEncoding-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMax-parts`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPart-number-marker`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part-number-marker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

