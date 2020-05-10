package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All fields defined in a principal are ANDed.
  */
@js.native
trait SchemaPrincipal extends js.Object {
  /**
    * An expression to specify custom condition.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The groups the principal belongs to. Exact match, prefix match, and
    * suffix match are supported.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * IPv4 or IPv6 address or range (In CIDR format)
    */
  var ips: js.UndefOr[js.Array[String]] = js.native
  /**
    * The namespaces. Exact match, prefix match, and suffix match are
    * supported.
    */
  var namespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of groups. Specifies exclusions.
    */
  var notGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of IPs. Specifies exclusions.
    */
  var notIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of namespaces. Specifies exclusions.
    */
  var notNamespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of users. Specifies exclusions.
    */
  var notUsers: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of Istio attribute to expected values. Exact match, prefix match,
    * and suffix match are supported for values. For example,
    * `request.headers[version]: ?v1?`. The properties are ANDed together.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The user names/IDs or service accounts. Exact match, prefix match, and
    * suffix match are supported.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPrincipal {
  @scala.inline
  def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  @scala.inline
  implicit class SchemaPrincipalOps[Self <: SchemaPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ips")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNotGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNotIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIps")(js.undefined)
        ret
    }
    @scala.inline
    def withNotNamespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNamespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNotUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

