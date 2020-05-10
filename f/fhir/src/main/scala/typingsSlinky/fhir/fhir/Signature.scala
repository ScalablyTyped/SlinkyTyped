package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
  */
@js.native
trait Signature extends Element {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.native
  /**
    * The actual signature content (XML DigSig. JWT, picture, etc.)
    */
  var blob: js.UndefOr[base64Binary] = js.native
  /**
    * The technical format of the signature
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * The party represented
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.native
  /**
    * The party represented
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.native
  /**
    * Indication of the reason the entity signed the object(s)
    */
  var `type`: js.Array[Coding] = js.native
  /**
    * When the signature was created
    */
  var when: instant = js.native
  /**
    * Who signed
    */
  var whoReference: js.UndefOr[Reference] = js.native
  /**
    * Who signed
    */
  var whoUri: js.UndefOr[uri] = js.native
}

object Signature {
  @scala.inline
  def apply(`type`: js.Array[Coding], when: instant): Signature = {
    val __obj = js.Dynamic.literal(when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  @scala.inline
  implicit class SignatureOps[Self <: Signature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhen(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_blob(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_blob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_blob")(js.undefined)
        ret
    }
    @scala.inline
    def with_contentType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_contentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(js.undefined)
        ret
    }
    @scala.inline
    def with_onBehalfOfUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBehalfOfUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onBehalfOfUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBehalfOfUri")(js.undefined)
        ret
    }
    @scala.inline
    def with_when(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_when: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_when")(js.undefined)
        ret
    }
    @scala.inline
    def with_whoUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whoUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_whoUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_whoUri")(js.undefined)
        ret
    }
    @scala.inline
    def withBlob(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfReference")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBehalfOfUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBehalfOfUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehalfOfUri")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoReference")(js.undefined)
        ret
    }
    @scala.inline
    def withWhoUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhoUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whoUri")(js.undefined)
        ret
    }
  }
  
}

