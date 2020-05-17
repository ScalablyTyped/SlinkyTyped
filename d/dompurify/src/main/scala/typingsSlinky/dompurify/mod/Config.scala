package typingsSlinky.dompurify.mod

import typingsSlinky.dompurify.anon.Html
import typingsSlinky.dompurify.dompurifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var ADD_ATTR: js.UndefOr[js.Array[String]] = js.native
  var ADD_TAGS: js.UndefOr[js.Array[String]] = js.native
  var ALLOWED_ATTR: js.UndefOr[js.Array[String]] = js.native
  var ALLOWED_TAGS: js.UndefOr[js.Array[String]] = js.native
  var ALLOWED_URI_REGEXP: js.UndefOr[js.RegExp] = js.native
  var ALLOW_DATA_ATTR: js.UndefOr[Boolean] = js.native
  var ALLOW_UNKNOWN_PROTOCOLS: js.UndefOr[Boolean] = js.native
  var FORBID_ATTR: js.UndefOr[js.Array[String]] = js.native
  var FORBID_TAGS: js.UndefOr[js.Array[String]] = js.native
  var FORCE_BODY: js.UndefOr[Boolean] = js.native
  var IN_PLACE: js.UndefOr[Boolean] = js.native
  var KEEP_CONTENT: js.UndefOr[Boolean] = js.native
  var RETURN_DOM: js.UndefOr[Boolean] = js.native
  var RETURN_DOM_FRAGMENT: js.UndefOr[Boolean] = js.native
  var RETURN_DOM_IMPORT: js.UndefOr[Boolean] = js.native
  var RETURN_TRUSTED_TYPE: js.UndefOr[Boolean] = js.native
  var SAFE_FOR_JQUERY: js.UndefOr[Boolean] = js.native
  var SAFE_FOR_TEMPLATES: js.UndefOr[Boolean] = js.native
  var SANITIZE_DOM: js.UndefOr[Boolean] = js.native
  var USE_PROFILES: js.UndefOr[`false` | Html] = js.native
  var WHOLE_DOCUMENT: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADD_ATTR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADD_ATTR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD_ATTR")(js.undefined)
        ret
    }
    @scala.inline
    def withADD_TAGS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD_TAGS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADD_TAGS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD_TAGS")(js.undefined)
        ret
    }
    @scala.inline
    def withALLOWED_ATTR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALLOWED_ATTR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_ATTR")(js.undefined)
        ret
    }
    @scala.inline
    def withALLOWED_TAGS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_TAGS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALLOWED_TAGS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_TAGS")(js.undefined)
        ret
    }
    @scala.inline
    def withALLOWED_URI_REGEXP(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_URI_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALLOWED_URI_REGEXP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_URI_REGEXP")(js.undefined)
        ret
    }
    @scala.inline
    def withALLOW_DATA_ATTR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOW_DATA_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALLOW_DATA_ATTR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOW_DATA_ATTR")(js.undefined)
        ret
    }
    @scala.inline
    def withALLOW_UNKNOWN_PROTOCOLS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOW_UNKNOWN_PROTOCOLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutALLOW_UNKNOWN_PROTOCOLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOW_UNKNOWN_PROTOCOLS")(js.undefined)
        ret
    }
    @scala.inline
    def withFORBID_ATTR(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORBID_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFORBID_ATTR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORBID_ATTR")(js.undefined)
        ret
    }
    @scala.inline
    def withFORBID_TAGS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORBID_TAGS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFORBID_TAGS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORBID_TAGS")(js.undefined)
        ret
    }
    @scala.inline
    def withFORCE_BODY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORCE_BODY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFORCE_BODY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FORCE_BODY")(js.undefined)
        ret
    }
    @scala.inline
    def withIN_PLACE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_PLACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIN_PLACE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_PLACE")(js.undefined)
        ret
    }
    @scala.inline
    def withKEEP_CONTENT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEEP_CONTENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKEEP_CONTENT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEEP_CONTENT")(js.undefined)
        ret
    }
    @scala.inline
    def withRETURN_DOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRETURN_DOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM")(js.undefined)
        ret
    }
    @scala.inline
    def withRETURN_DOM_FRAGMENT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM_FRAGMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRETURN_DOM_FRAGMENT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM_FRAGMENT")(js.undefined)
        ret
    }
    @scala.inline
    def withRETURN_DOM_IMPORT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM_IMPORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRETURN_DOM_IMPORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_DOM_IMPORT")(js.undefined)
        ret
    }
    @scala.inline
    def withRETURN_TRUSTED_TYPE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_TRUSTED_TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRETURN_TRUSTED_TYPE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RETURN_TRUSTED_TYPE")(js.undefined)
        ret
    }
    @scala.inline
    def withSAFE_FOR_JQUERY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAFE_FOR_JQUERY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSAFE_FOR_JQUERY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAFE_FOR_JQUERY")(js.undefined)
        ret
    }
    @scala.inline
    def withSAFE_FOR_TEMPLATES(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAFE_FOR_TEMPLATES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSAFE_FOR_TEMPLATES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAFE_FOR_TEMPLATES")(js.undefined)
        ret
    }
    @scala.inline
    def withSANITIZE_DOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SANITIZE_DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSANITIZE_DOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SANITIZE_DOM")(js.undefined)
        ret
    }
    @scala.inline
    def withUSE_PROFILES(value: `false` | Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USE_PROFILES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUSE_PROFILES: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USE_PROFILES")(js.undefined)
        ret
    }
    @scala.inline
    def withWHOLE_DOCUMENT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WHOLE_DOCUMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWHOLE_DOCUMENT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WHOLE_DOCUMENT")(js.undefined)
        ret
    }
  }
  
}

