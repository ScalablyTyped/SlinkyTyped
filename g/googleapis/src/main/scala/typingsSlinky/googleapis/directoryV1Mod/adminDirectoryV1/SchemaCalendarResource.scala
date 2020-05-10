package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Calendar Resource object in Directory API.
  */
@js.native
trait SchemaCalendarResource extends js.Object {
  /**
    * Unique ID for the building a resource is located in.
    */
  var buildingId: js.UndefOr[String] = js.native
  /**
    * Capacity of a resource, number of seats in a room.
    */
  var capacity: js.UndefOr[Double] = js.native
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  var featureInstances: js.UndefOr[js.Any] = js.native
  /**
    * Name of the floor a resource is located on.
    */
  var floorName: js.UndefOr[String] = js.native
  /**
    * Name of the section within a floor a resource is located in.
    */
  var floorSection: js.UndefOr[String] = js.native
  /**
    * The read-only auto-generated name of the calendar resource which includes
    * metadata about the resource such as building name, floor, capacity, etc.
    * For example, &quot;NYC-2-Training Room 1A (16)&quot;.
    */
  var generatedResourceName: js.UndefOr[String] = js.native
  /**
    * The type of the resource. For calendar resources, the value is
    * admin#directory#resources#calendars#CalendarResource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The category of the calendar resource. Either CONFERENCE_ROOM or OTHER.
    * Legacy data is set to CATEGORY_UNKNOWN.
    */
  var resourceCategory: js.UndefOr[String] = js.native
  /**
    * Description of the resource, visible only to admins.
    */
  var resourceDescription: js.UndefOr[String] = js.native
  /**
    * The read-only email for the calendar resource. Generated as part of
    * creating a new calendar resource.
    */
  var resourceEmail: js.UndefOr[String] = js.native
  /**
    * The unique ID for the calendar resource.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * The name of the calendar resource. For example, &quot;Training Room
    * 1A&quot;.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The type of the calendar resource, intended for non-room resources.
    */
  var resourceType: js.UndefOr[String] = js.native
  /**
    * Description of the resource, visible to users and admins.
    */
  var userVisibleDescription: js.UndefOr[String] = js.native
}

object SchemaCalendarResource {
  @scala.inline
  def apply(): SchemaCalendarResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarResource]
  }
  @scala.inline
  implicit class SchemaCalendarResourceOps[Self <: SchemaCalendarResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEtags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureInstances(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorSection")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratedResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleDescription")(js.undefined)
        ret
    }
  }
  
}

