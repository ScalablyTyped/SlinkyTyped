package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fill of the outline.
  */
@js.native
trait SchemaOutlineFill extends js.Object {
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}

object SchemaOutlineFill {
  @scala.inline
  def apply(): SchemaOutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutlineFill]
  }
  @scala.inline
  implicit class SchemaOutlineFillOps[Self <: SchemaOutlineFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSolidFill(value: SchemaSolidFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolidFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solidFill")(js.undefined)
        ret
    }
  }
  
}

