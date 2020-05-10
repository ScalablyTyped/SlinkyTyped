package typingsSlinky.gapiClientPlus.gapi.client.plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlusAclentryResource extends js.Object {
  /** A descriptive name for this entry. Suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /** The ID of the entry. For entries of type "person" or "circle", this is the ID of the resource. For other types, this property is not set. */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of entry describing to whom access is granted. Possible values are:
    * - "person" - Access to an individual.
    * - "circle" - Access to members of a circle.
    * - "myCircles" - Access to members of all the person's circles.
    * - "extendedCircles" - Access to members of all the person's circles, plus all of the people in their circles.
    * - "domain" - Access to members of the person's Google Apps domain.
    * - "public" - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object PlusAclentryResource {
  @scala.inline
  def apply(): PlusAclentryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAclentryResource]
  }
  @scala.inline
  implicit class PlusAclentryResourceOps[Self <: PlusAclentryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

