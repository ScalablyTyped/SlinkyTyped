package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The page background fill.
  */
@js.native
trait SchemaPageBackgroundFill extends js.Object {
  /**
    * The background fill property state.  Updating the fill on a page will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a page, set this field
    * to `NOT_RENDERED`. In this case, any other fill fields set in the same
    * request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
  /**
    * Stretched picture fill.
    */
  var stretchedPictureFill: js.UndefOr[SchemaStretchedPictureFill] = js.native
}

object SchemaPageBackgroundFill {
  @scala.inline
  def apply(): SchemaPageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageBackgroundFill]
  }
  @scala.inline
  implicit class SchemaPageBackgroundFillOps[Self <: SchemaPageBackgroundFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyState")(js.undefined)
        ret
    }
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
    @scala.inline
    def withStretchedPictureFill(value: SchemaStretchedPictureFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchedPictureFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchedPictureFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchedPictureFill")(js.undefined)
        ret
    }
  }
  
}

