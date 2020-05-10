package typingsSlinky.hapiAddress.mod.domain

import typingsSlinky.hapiAddress.mod.domain.Tlds.Allow
import typingsSlinky.hapiAddress.mod.domain.Tlds.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Determines whether Unicode characters are allowed.
    * 
    * @default true
    */
  val allowUnicode: js.UndefOr[Boolean] = js.native
  /**
    * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
    * 
    * @default 2
    */
  val minDomainSegments: js.UndefOr[Double] = js.native
  /**
    * Top-level-domain options
    * 
    * @default true
    */
  val tlds: js.UndefOr[Allow | Deny | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withTlds(value: Allow | Deny | Boolean): Self = {
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

