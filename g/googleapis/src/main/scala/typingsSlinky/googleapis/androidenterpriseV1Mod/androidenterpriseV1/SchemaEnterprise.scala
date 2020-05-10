package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Enterprises resource represents the binding between an EMM and a
  * specific organization. That binding can be instantiated in one of two
  * different ways using this API as follows:  - For Google managed domain
  * customers, the process involves using Enterprises.enroll and
  * Enterprises.setAccount (in conjunction with artifacts obtained from the
  * Admin console and the Google API Console) and submitted to the EMM through
  * a more-or-less manual process.  - For managed Google Play Accounts
  * customers, the process involves using Enterprises.generateSignupUrl and
  * Enterprises.completeSignup in conjunction with the managed Google Play
  * sign-up UI (Google-provided mechanism) to create the binding without manual
  * steps. As an EMM, you can support either or both approaches in your EMM
  * console. See Create an Enterprise for details.
  */
@js.native
trait SchemaEnterprise extends js.Object {
  /**
    * Admins of the enterprise. This is only supported for enterprises created
    * via the EMM-initiated flow.
    */
  var administrator: js.UndefOr[js.Array[SchemaAdministrator]] = js.native
  /**
    * The unique ID for the enterprise.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprise&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the enterprise, for example, &quot;Example, Inc&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The enterprise&#39;s primary domain, such as &quot;example.com&quot;.
    */
  var primaryDomain: js.UndefOr[String] = js.native
}

object SchemaEnterprise {
  @scala.inline
  def apply(): SchemaEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprise]
  }
  @scala.inline
  implicit class SchemaEnterpriseOps[Self <: SchemaEnterprise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrator(value: js.Array[SchemaAdministrator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrator")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDomain")(js.undefined)
        ret
    }
  }
  
}

