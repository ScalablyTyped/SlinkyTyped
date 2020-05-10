package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
@js.native
trait SchemaLine extends js.Object {
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.native
}

object SchemaLine {
  @scala.inline
  def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  @scala.inline
  implicit class SchemaLineOps[Self <: SchemaLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withLineProperties(value: SchemaLineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withLineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineType")(js.undefined)
        ret
    }
  }
  
}

