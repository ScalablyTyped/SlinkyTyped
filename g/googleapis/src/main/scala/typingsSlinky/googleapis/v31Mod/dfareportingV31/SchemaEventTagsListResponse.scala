package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Tag List Response
  */
@js.native
trait SchemaEventTagsListResponse extends js.Object {
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[SchemaEventTag]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTagsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventTagsListResponse {
  @scala.inline
  def apply(): SchemaEventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagsListResponse]
  }
  @scala.inline
  implicit class SchemaEventTagsListResponseOps[Self <: SchemaEventTagsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTags(value: js.Array[SchemaEventTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTags")(js.undefined)
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
  }
  
}

