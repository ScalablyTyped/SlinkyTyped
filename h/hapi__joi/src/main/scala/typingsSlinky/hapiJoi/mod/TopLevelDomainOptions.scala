package typingsSlinky.hapiJoi.mod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopLevelDomainOptions extends js.Object {
  /**
    * - `true` to use the IANA list of registered TLDs. This is the default value.
    * - `false` to allow any TLD not listed in the `deny` list, if present.
    * - A `Set` or array of the allowed TLDs. Cannot be used together with `deny`.
    */
  var allow: js.UndefOr[Set[String] | js.Array[String] | Boolean] = js.native
  /**
    * - A `Set` or array of the forbidden TLDs. Cannot be used together with a custom `allow` list.
    */
  var deny: js.UndefOr[Set[String] | js.Array[String]] = js.native
}

object TopLevelDomainOptions {
  @scala.inline
  def apply(): TopLevelDomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopLevelDomainOptions]
  }
  @scala.inline
  implicit class TopLevelDomainOptionsOps[Self <: TopLevelDomainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Set[String] | js.Array[String] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
    @scala.inline
    def withDeny(value: Set[String] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(js.undefined)
        ret
    }
  }
  
}

