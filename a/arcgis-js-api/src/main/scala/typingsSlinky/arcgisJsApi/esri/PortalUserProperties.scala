package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`private`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.english
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.metric
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org_admin
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org_publisher
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org_user
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalUserProperties extends js.Object {
  /**
    * Indicates the level of access of the user. If private, the user descriptive information will not be available to others nor will the username be searchable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#access)
    */
  var access: js.UndefOr[`private` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org | public] = js.native
  /**
    * The date the user was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  /**
    * The culture information for the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#culture)
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * A description of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user's e-mail address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#email)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The user's full name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#fullName)
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The date the user was last modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#modified)
    */
  var modified: js.UndefOr[DateProperties] = js.native
  /**
    * The ID of the organization the user belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#orgId)
    */
  var orgId: js.UndefOr[String] = js.native
  /**
    * The portal associated with the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  /**
    * The user's preferred view for content, either web or GIS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#preferredView)
    */
  var preferredView: js.UndefOr[String] = js.native
  /**
    * The user preferred region, used to set the featured maps on the home page, content in the gallery, and the default extent of new maps in the Viewer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#region)
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Defines the user's role in the organization. See [roleId](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId) for more details about when user has a custom role.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role)
    */
  var role: js.UndefOr[org_admin | org_publisher | org_user] = js.native
  /**
    * The ID of the user's role.  Only set if the user is assigned a custom role.  When present, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will indicate the "base" role of the custom role based on the privileges the custom role contains. For example, if the custom role contains some publisher privileges, the [role](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#role) will be set to `org_publisher`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#roleId)
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * The JSON used to create the property values when the `PortalUser` is created. Although most commonly used properties are exposed on the `PortalUser` class directly, this provides access to all information returned for the portal user. This property is useful if working in an application built using an older version of the API which requires access to a portal's user properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The user's personal units of measure setting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#units)
    */
  var units: js.UndefOr[english | metric] = js.native
  /**
    * The username of the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html#username)
    */
  var username: js.UndefOr[String] = js.native
}

object PortalUserProperties {
  @scala.inline
  def apply(): PortalUserProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalUserProperties]
  }
  @scala.inline
  implicit class PortalUserPropertiesOps[Self <: PortalUserProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: `private` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.org | public): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: DateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgId")(js.undefined)
        ret
    }
    @scala.inline
    def withPortal(value: PortalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredView")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: org_admin | org_publisher | org_user): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceJSON(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: english | metric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

