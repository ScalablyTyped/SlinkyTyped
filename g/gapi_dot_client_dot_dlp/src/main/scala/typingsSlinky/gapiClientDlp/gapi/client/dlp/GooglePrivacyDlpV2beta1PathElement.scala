package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PathElement extends js.Object {
  /**
    * The auto-allocated ID of the entity.
    * Never equal to zero. Values less than zero are discouraged and may not
    * be supported in the future.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of the entity.
    * A kind matching regex `__.&#42;__` is reserved/read-only.
    * A kind must not contain more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the entity.
    * A name matching regex `__.&#42;__` is reserved/read-only.
    * A name must not be more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var name: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1PathElement {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PathElement]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PathElementOps[Self <: GooglePrivacyDlpV2beta1PathElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

