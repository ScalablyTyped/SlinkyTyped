package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipStatus extends js.Object {
  /**
    * Output only. The value of the relationship status translated and formatted in
    * the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /** Metadata about the relationship status. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /**
    * The relationship status. The value can be custom or one of these
    * predefined values:
    *
    * &#42; `single`
    * &#42; `inARelationship`
    * &#42; `engaged`
    * &#42; `married`
    * &#42; `itsComplicated`
    * &#42; `openRelationship`
    * &#42; `widowed`
    * &#42; `inDomesticPartnership`
    * &#42; `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.native
}

object RelationshipStatus {
  @scala.inline
  def apply(): RelationshipStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipStatus]
  }
  @scala.inline
  implicit class RelationshipStatusOps[Self <: RelationshipStatus] (val x: Self) extends AnyVal {
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
    def withMetadata(value: FieldMetadata): Self = {
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

