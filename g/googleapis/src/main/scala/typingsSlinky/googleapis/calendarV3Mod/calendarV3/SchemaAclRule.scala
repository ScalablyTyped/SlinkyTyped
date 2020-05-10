package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleapis.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAclRule extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifier of the ACL rule.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#aclRule&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The role assigned to the scope. Possible values are:   - &quot;none&quot;
    * - Provides no access.  - &quot;freeBusyReader&quot; - Provides read
    * access to free/busy information.  - &quot;reader&quot; - Provides read
    * access to the calendar. Private events will appear to users with reader
    * access, but event details will be hidden.  - &quot;writer&quot; -
    * Provides read and write access to the calendar. Private events will
    * appear to users with writer access, and event details will be visible.  -
    * &quot;owner&quot; - Provides ownership of the calendar. This role has all
    * of the permissions of the writer role with the additional ability to see
    * and manipulate ACLs.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The scope of the rule.
    */
  var scope: js.UndefOr[AnonValue] = js.native
}

object SchemaAclRule {
  @scala.inline
  def apply(): SchemaAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclRule]
  }
  @scala.inline
  implicit class SchemaAclRuleOps[Self <: SchemaAclRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

