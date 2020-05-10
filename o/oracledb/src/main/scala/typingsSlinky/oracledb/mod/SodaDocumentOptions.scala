package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used when creating a new SODA document.
  */
@js.native
trait SodaDocumentOptions extends js.Object {
  /**
    * Must be supplied if the document in intended to be inserted into a collection with client-assigned keys. It should be undefined, otherwise.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * If the document has non-JSON content, then mediaType should be set to the desired media type. Using a MIME type is recommended.
    *
    * @default application/json
    */
  var mediaType: js.UndefOr[String] = js.native
}

object SodaDocumentOptions {
  @scala.inline
  def apply(): SodaDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SodaDocumentOptions]
  }
  @scala.inline
  implicit class SodaDocumentOptionsOps[Self <: SodaDocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
  }
  
}

