package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
@js.native
trait SchemaCreativeSpecification extends js.Object {
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[SchemaAdSize] = js.native
}

object SchemaCreativeSpecification {
  @scala.inline
  def apply(): SchemaCreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSpecification]
  }
  @scala.inline
  implicit class SchemaCreativeSpecificationOps[Self <: SchemaCreativeSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeCompanionSizes(value: js.Array[SchemaAdSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeCompanionSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeCompanionSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeCompanionSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeSize(value: SchemaAdSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSize")(js.undefined)
        ret
    }
  }
  
}

