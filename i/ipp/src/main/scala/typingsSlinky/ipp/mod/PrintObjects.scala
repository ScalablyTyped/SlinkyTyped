package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintObjects extends js.Object {
  var `document-number`: js.UndefOr[Double] = js.native
  var `object-offset`: js.UndefOr[ObjectOffset] = js.native
  var `object-size`: js.UndefOr[ObjectSize] = js.native
  var `object-uuid`: js.UndefOr[String] = js.native
}

object PrintObjects {
  @scala.inline
  def apply(): PrintObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintObjects]
  }
  @scala.inline
  implicit class PrintObjectsOps[Self <: PrintObjects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDocument-number`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-number`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-number")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-offset`(value: ObjectOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-size`(value: ObjectSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withObject-uuid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutObject-uuid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object-uuid")(js.undefined)
        ret
    }
  }
  
}

