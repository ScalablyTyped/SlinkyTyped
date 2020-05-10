package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic segment definition for defining the segment within the request. A
  * segment can select users, sessions or both.
  */
@js.native
trait SchemaDynamicSegment extends js.Object {
  /**
    * The name of the dynamic segment.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Session Segment to select sessions to include in the segment.
    */
  var sessionSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
  /**
    * User Segment to select users to include in the segment.
    */
  var userSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
}

object SchemaDynamicSegment {
  @scala.inline
  def apply(): SchemaDynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSegment]
  }
  @scala.inline
  implicit class SchemaDynamicSegmentOps[Self <: SchemaDynamicSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionSegment(value: SchemaSegmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSegment(value: SchemaSegmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSegment")(js.undefined)
        ret
    }
  }
  
}

