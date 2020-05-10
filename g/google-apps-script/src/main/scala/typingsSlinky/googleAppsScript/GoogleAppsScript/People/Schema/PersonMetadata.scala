package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonMetadata extends js.Object {
  var deleted: js.UndefOr[Boolean] = js.native
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String]] = js.native
  var objectType: js.UndefOr[String] = js.native
  var previousResourceNames: js.UndefOr[js.Array[String]] = js.native
  var sources: js.UndefOr[js.Array[Source]] = js.native
}

object PersonMetadata {
  @scala.inline
  def apply(): PersonMetadata = {
    val __obj = js.Dynamic.literal()
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
    def withSources(value: js.Array[Source]): Self = {
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

