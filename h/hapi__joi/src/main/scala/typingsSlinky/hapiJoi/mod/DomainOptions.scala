package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.native
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.native
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.native
}

object DomainOptions {
  @scala.inline
  def apply(): DomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptions]
  }
  @scala.inline
  implicit class DomainOptionsOps[Self <: DomainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnicode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDomainSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDomainSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDomainSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withTlds(value: TopLevelDomainOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlds")(js.undefined)
        ret
    }
  }
  
}

