package typingsSlinky.activedirectory2.mod

import typingsSlinky.activedirectory2.AnonCa
import typingsSlinky.activedirectory2.activedirectory2Numbers.`0`
import typingsSlinky.activedirectory2.activedirectory2Numbers.`10`
import typingsSlinky.activedirectory2.activedirectory2Strings.base
import typingsSlinky.activedirectory2.activedirectory2Strings.one
import typingsSlinky.activedirectory2.activedirectory2Strings.sub
import typingsSlinky.ldapjs.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReqProps extends LDAPjsReqProps {
  var attributes: AttributeSpec = js.native
  var baseDN: js.UndefOr[String] = js.native
  var bindCredentials: js.UndefOr[String] = js.native
  var bindDN: js.UndefOr[String] = js.native
  var filter: String | Filter = js.native
  var includeMembership: js.Array[MembershipType] = js.native
  var scope: js.UndefOr[base | one | sub] = js.native
  var sizeLimit: `0` = js.native
  var timeLimit: `10` = js.native
}

object ReqProps {
  @scala.inline
  def apply(
    attributes: AttributeSpec,
    filter: String | Filter,
    includeMembership: js.Array[MembershipType],
    sizeLimit: `0`,
    timeLimit: `10`,
    tlsOptions: AnonCa,
    url: String
  ): ReqProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], includeMembership = includeMembership.asInstanceOf[js.Any], sizeLimit = sizeLimit.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqProps]
  }
  @scala.inline
  implicit class ReqPropsOps[Self <: ReqProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributeSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String | Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMembership(value: js.Array[MembershipType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeLimit(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLimit(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDN")(js.undefined)
        ret
    }
    @scala.inline
    def withBindCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withBindDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindDN")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: base | one | sub): Self = {
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

