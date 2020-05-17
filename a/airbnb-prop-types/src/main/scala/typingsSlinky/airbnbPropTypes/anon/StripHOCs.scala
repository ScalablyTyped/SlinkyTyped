package typingsSlinky.airbnbPropTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripHOCs extends js.Object {
  var stripHOCs: js.Array[String] = js.native
}

object StripHOCs {
  @scala.inline
  def apply(stripHOCs: js.Array[String]): StripHOCs = {
    val __obj = js.Dynamic.literal(stripHOCs = stripHOCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripHOCs]
  }
  @scala.inline
  implicit class StripHOCsOps[Self <: StripHOCs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripHOCs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHOCs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

