package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audience Segment Group.
  */
@js.native
trait SchemaAudienceSegmentGroup extends js.Object {
  /**
    * Audience segments assigned to this group. The number of segments must be
    * between 2 and 100.
    */
  var audienceSegments: js.UndefOr[js.Array[SchemaAudienceSegment]] = js.native
  /**
    * ID of this audience segment group. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this audience segment group. This is a required field and must be
    * less than 65 characters long.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAudienceSegmentGroup {
  @scala.inline
  def apply(): SchemaAudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceSegmentGroup]
  }
  @scala.inline
  implicit class SchemaAudienceSegmentGroupOps[Self <: SchemaAudienceSegmentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudienceSegments(value: js.Array[SchemaAudienceSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
  }
  
}

