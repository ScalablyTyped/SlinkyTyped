package typingsSlinky.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportResponseData extends js.Object {
  val CreationTS: js.UndefOr[Double] = js.native
  val ExpirationTS: js.UndefOr[Double] = js.native
  val FromTs: js.UndefOr[Double] = js.native
  val ID: Double = js.native
  val Status: ResponseStatus = js.native
  val ToTs: js.UndefOr[Double] = js.native
  val URL: js.UndefOr[String] = js.native
}

object ExportResponseData {
  @scala.inline
  def apply(ID: Double, Status: ResponseStatus): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponseData]
  }
  @scala.inline
  implicit class ExportResponseDataOps[Self <: ExportResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTS")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTS")(js.undefined)
        ret
    }
    @scala.inline
    def withFromTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromTs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromTs")(js.undefined)
        ret
    }
    @scala.inline
    def withToTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToTs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToTs")(js.undefined)
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(js.undefined)
        ret
    }
  }
  
}

