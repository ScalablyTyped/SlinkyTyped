package typingsSlinky.googleapis.plusV1Mod.plusV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlusAclentryResource extends js.Object {
  /**
    * A descriptive name for this entry. Suitable for display.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the entry. For entries of type &quot;person&quot; or
    * &quot;circle&quot;, this is the ID of the resource. For other types, this
    * property is not set.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of entry describing to whom access is granted. Possible values
    * are:   - &quot;person&quot; - Access to an individual.  -
    * &quot;circle&quot; - Access to members of a circle.  -
    * &quot;myCircles&quot; - Access to members of all the person&#39;s
    * circles.  - &quot;extendedCircles&quot; - Access to members of all the
    * person&#39;s circles, plus all of the people in their circles.  -
    * &quot;domain&quot; - Access to members of the person&#39;s Google Apps
    * domain.  - &quot;public&quot; - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPlusAclentryResource {
  @scala.inline
  def apply(): SchemaPlusAclentryResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlusAclentryResource]
  }
  @scala.inline
  implicit class SchemaPlusAclentryResourceOps[Self <: SchemaPlusAclentryResource] (val x: Self) extends AnyVal {
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

