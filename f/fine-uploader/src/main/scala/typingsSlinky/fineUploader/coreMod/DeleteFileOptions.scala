package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileOptions extends js.Object {
  /**
    * Any additional headers to attach to all delete file requests
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Enable or disable deletion of uploaded files
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The endpoint to which delete file requests are sent.
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * Set the method to use for delete requests.
    *
    * Accepts `'POST'` or `'DELETE'`
    *
    * @default `'DELETE'`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Any additional parameters to attach to delete file requests
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.native
}

object DeleteFileOptions {
  @scala.inline
  def apply(): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileOptions]
  }
  @scala.inline
  implicit class DeleteFileOptionsOps[Self <: DeleteFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

