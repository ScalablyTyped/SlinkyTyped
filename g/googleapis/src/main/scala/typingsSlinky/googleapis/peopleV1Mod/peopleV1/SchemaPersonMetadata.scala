package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The read-only metadata about a person.
  */
@js.native
trait SchemaPersonMetadata extends js.Object {
  /**
    * True if the person resource has been deleted. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list)
    * requests that include a sync token.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Resource names of people linked to this resource.
    */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * **DEPRECATED** (Please use
    * `person.metadata.sources.profileMetadata.objectType` instead)  The type
    * of the person object.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Any former resource names this person has had. Populated only for
    * [`connections.list`](/people/api/rest/v1/people.connections/list)
    * requests that include a sync token.  The resource name may change when
    * adding or removing fields that link a contact and profile such as a
    * verified email, verified phone number, or profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The sources of data for the person.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaPersonMetadata {
  @scala.inline
  def apply(): SchemaPersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonMetadata]
  }
  @scala.inline
  implicit class SchemaPersonMetadataOps[Self <: SchemaPersonMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedPeopleResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPeopleResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedPeopleResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPeopleResourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SchemaSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}

