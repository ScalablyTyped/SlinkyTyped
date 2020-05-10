package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information about the HTTP Cookie on which the hash function is based
  * for load balancing policies that use a consistent hash.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettingsHttpCookie extends js.Object {
  /**
    * Name of the cookie.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Path to set for the cookie.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Lifetime of the cookie.
    */
  var ttl: js.UndefOr[SchemaDuration] = js.native
}

object SchemaConsistentHashLoadBalancerSettingsHttpCookie {
  @scala.inline
  def apply(): SchemaConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettingsHttpCookie]
  }
  @scala.inline
  implicit class SchemaConsistentHashLoadBalancerSettingsHttpCookieOps[Self <: SchemaConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: SchemaDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

