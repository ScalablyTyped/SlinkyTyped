package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.SegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentResponse extends js.Object {
  /**
    * The ID of the application that the segment applies to.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The unique segment ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The import job settings.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  /**
    * The segment type:
    * DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
    * IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
    */
  var SegmentType: js.UndefOr[DIMENSIONAL | IMPORT | String] = js.native
  /**
    * The segment version number.
    */
  var Version: js.UndefOr[Double] = js.native
}

object SegmentResponse {
  @scala.inline
  def apply(): SegmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentResponse]
  }
  @scala.inline
  implicit class SegmentResponseOps[Self <: SegmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withLastModifiedDate(value: String): Self = {
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
    def withName(value: String): Self = {
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
    def withSegmentType(value: DIMENSIONAL | IMPORT | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
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
  }
  
}

