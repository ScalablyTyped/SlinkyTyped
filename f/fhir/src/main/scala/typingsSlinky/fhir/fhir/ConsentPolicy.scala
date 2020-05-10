package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policies covered by this consent
  */
@js.native
trait ConsentPolicy extends BackboneElement {
  /**
    * Contains extended information for property 'authority'.
    */
  var _authority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  /**
    * Enforcement source for policy
    */
  var authority: js.UndefOr[uri] = js.native
  /**
    * Specific policy covered by this consent
    */
  var uri: js.UndefOr[typingsSlinky.fhir.fhir.uri] = js.native
}

object ConsentPolicy {
  @scala.inline
  def apply(): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicy]
  }
  @scala.inline
  implicit class ConsentPolicyOps[Self <: ConsentPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_authority(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_authority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_authority")(js.undefined)
        ret
    }
    @scala.inline
    def with_uri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthority(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

