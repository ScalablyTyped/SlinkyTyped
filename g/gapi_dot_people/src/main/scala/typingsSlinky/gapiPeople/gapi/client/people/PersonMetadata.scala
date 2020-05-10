package typingsSlinky.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonMetadata extends js.Object {
  var deleted: Boolean = js.native
  var linkedPeopleResourceNames: js.Array[String] = js.native
  var objectType: ObjectType = js.native
  var previousResourceNames: js.Array[String] = js.native
  var sources: js.Array[Source] = js.native
}

object PersonMetadata {
  @scala.inline
  def apply(
    deleted: Boolean,
    linkedPeopleResourceNames: js.Array[String],
    objectType: ObjectType,
    previousResourceNames: js.Array[String],
    sources: js.Array[Source]
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], linkedPeopleResourceNames = linkedPeopleResourceNames.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], previousResourceNames = previousResourceNames.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonMetadata]
  }
  @scala.inline
  implicit class PersonMetadataOps[Self <: PersonMetadata] (val x: Self) extends AnyVal {
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
    def withLinkedPeopleResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPeopleResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: ObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Source]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

