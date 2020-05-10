package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only relationship status.
  */
@js.native
trait SchemaRelationshipStatus extends js.Object {
  /**
    * The read-only value of the relationship status translated and formatted
    * in the viewer&#39;s account locale or the `Accept-Language` HTTP header
    * locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Metadata about the relationship status.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The relationship status. The value can be custom or one of these
    * predefined values:  * `single` * `inARelationship` * `engaged` *
    * `married` * `itsComplicated` * `openRelationship` * `widowed` *
    * `inDomesticPartnership` * `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaRelationshipStatus {
  @scala.inline
  def apply(): SchemaRelationshipStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipStatus]
  }
  @scala.inline
  implicit class SchemaRelationshipStatusOps[Self <: SchemaRelationshipStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

