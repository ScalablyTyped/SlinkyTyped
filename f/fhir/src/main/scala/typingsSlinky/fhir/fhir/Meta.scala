package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a resource
  */
@js.native
trait Meta extends Element {
  /**
    * Contains extended information for property 'lastUpdated'.
    */
  var _lastUpdated: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'versionId'.
    */
  var _versionId: js.UndefOr[Element] = js.native
  /**
    * When the resource version last changed
    */
  var lastUpdated: js.UndefOr[instant] = js.native
  /**
    * Profiles this resource claims to conform to
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Security Labels applied to this resource
    */
  var security: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Tags applied to this resource
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Version specific identifier
    */
  var versionId: js.UndefOr[id] = js.native
}

object Meta {
  @scala.inline
  def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_lastUpdated(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def with_profile(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(js.undefined)
        ret
    }
    @scala.inline
    def with_versionId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_versionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

