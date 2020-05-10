package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user-specified ID mapping for a placeholder that will be created on a
  * slide from a specified layout.
  */
@js.native
trait SchemaLayoutPlaceholderIdMapping extends js.Object {
  /**
    * The placeholder on a layout that will be applied to a slide. Only type
    * and index are needed. For example, a predefined `TITLE_AND_BODY` layout
    * may usually have a TITLE placeholder with index 0 and a BODY placeholder
    * with index 0.
    */
  var layoutPlaceholder: js.UndefOr[SchemaPlaceholder] = js.native
  /**
    * The object ID of the placeholder on a layout that will be applied to a
    * slide.
    */
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID for the placeholder identified above that to be
    * created onto a slide.  If you specify an ID, it must be unique among all
    * pages and page elements in the presentation. The ID must start with an
    * alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`);
    * remaining characters may include those as well as a hyphen or colon
    * (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less
    * than 5 or greater than 50.  If you don&#39;t specify an ID, a unique one
    * is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaLayoutPlaceholderIdMapping {
  @scala.inline
  def apply(): SchemaLayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutPlaceholderIdMapping]
  }
  @scala.inline
  implicit class SchemaLayoutPlaceholderIdMappingOps[Self <: SchemaLayoutPlaceholderIdMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutPlaceholder(value: SchemaPlaceholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutPlaceholderObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholderObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPlaceholderObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholderObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

