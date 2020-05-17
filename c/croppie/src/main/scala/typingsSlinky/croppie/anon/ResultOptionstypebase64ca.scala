package typingsSlinky.croppie.anon

import typingsSlinky.croppie.croppieStrings.base64
import typingsSlinky.croppie.croppieStrings.canvas
import typingsSlinky.croppie.croppieStrings.original
import typingsSlinky.croppie.croppieStrings.viewport
import typingsSlinky.croppie.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined croppie.croppie.ResultOptions & {  type  :'base64' | 'canvas'} */
@js.native
trait ResultOptionstypebase64ca extends js.Object {
  var circle: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Format] = js.native
  var quality: js.UndefOr[Double] = js.native
  var size: js.UndefOr[viewport | original | Height] = js.native
  var `type`: js.UndefOr[typingsSlinky.croppie.mod.Type with (base64 | canvas)] = js.native
}

object ResultOptionstypebase64ca {
  @scala.inline
  def apply(): ResultOptionstypebase64ca = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultOptionstypebase64ca]
  }
  @scala.inline
  implicit class ResultOptionstypebase64caOps[Self <: ResultOptionstypebase64ca] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: viewport | original | Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.croppie.mod.Type with (base64 | canvas)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

