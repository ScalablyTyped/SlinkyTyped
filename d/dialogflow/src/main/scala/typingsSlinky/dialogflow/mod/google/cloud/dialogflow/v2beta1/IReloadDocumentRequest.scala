package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ReloadDocumentRequest. */
@js.native
trait IReloadDocumentRequest extends js.Object {
  /** ReloadDocumentRequest gcsSource */
  var gcsSource: js.UndefOr[IGcsSource | Null] = js.native
  /** ReloadDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.native
}

object IReloadDocumentRequest {
  @scala.inline
  def apply(): IReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReloadDocumentRequest]
  }
  @scala.inline
  implicit class IReloadDocumentRequestOps[Self <: IReloadDocumentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcsSource(value: IGcsSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSource")(null)
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
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

