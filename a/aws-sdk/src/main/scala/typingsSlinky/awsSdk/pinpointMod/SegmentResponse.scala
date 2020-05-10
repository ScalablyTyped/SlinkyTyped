package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentResponse extends js.Object {
  /**
    * The unique identifier for the application that the segment is associated with.
    */
  var ApplicationId: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the segment.
    */
  var Arn: string = js.native
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: string = js.native
  /**
    * The dimension settings for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The unique identifier for the segment.
    */
  var Id: string = js.native
  /**
    * The settings for the import job that's associated with the segment.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base segments and the dimensions that are applied to those base segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  /**
    * The segment type. Valid values are: DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on endpoint data that's reported by your app. Dynamic segments can change over time. IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
    */
  var SegmentType: typingsSlinky.awsSdk.pinpointMod.SegmentType = js.native
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[integer] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object SegmentResponse {
  @scala.inline
  def apply(ApplicationId: string, Arn: string, CreationDate: string, Id: string, SegmentType: SegmentType): SegmentResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentResponse]
  }
  @scala.inline
  implicit class SegmentResponseOps[Self <: SegmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegmentType(value: SegmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: SegmentDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImportDefinition(value: SegmentImportResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentGroups(value: SegmentGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

