package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The segment definition, if the report needs to be segmented. A Segment is a
  * subset of the Analytics data. For example, of the entire set of users, one
  * Segment might be users from a particular country or city.
  */
@js.native
trait SchemaSegment extends js.Object {
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[SchemaDynamicSegment] = js.native
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String] = js.native
}

object SchemaSegment {
  @scala.inline
  def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  @scala.inline
  implicit class SchemaSegmentOps[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicSegment(value: SchemaDynamicSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(js.undefined)
        ret
    }
  }
  
}

