package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtension extends Entity {
  // Description for the schema extension.
  var description: js.UndefOr[String] = js.native
  /**
    * The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to
    * set the owner. If not supplied, then the calling application's appId will be set as the owner. In either case, the
    * signed-in user must be the owner of the application. Once set, this property is read-only and cannot be changed.
    */
  var owner: js.UndefOr[String] = js.native
  // The collection of property names and types that make up the schema extension definition.
  var properties: js.UndefOr[js.Array[ExtensionSchemaProperty]] = js.native
  /**
    * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated.
    * Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state
    * transitions and behaviors.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from
    * contact, device, event, group, message, organization, post, or user.
    */
  var targetTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaExtension {
  @scala.inline
  def apply(): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtension]
  }
  @scala.inline
  implicit class SchemaExtensionOps[Self <: SchemaExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[ExtensionSchemaProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTypes")(js.undefined)
        ret
    }
  }
  
}

