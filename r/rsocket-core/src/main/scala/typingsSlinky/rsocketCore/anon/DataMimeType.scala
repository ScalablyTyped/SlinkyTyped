package typingsSlinky.rsocketCore.anon

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMimeType[D, M] extends js.Object {
  var dataMimeType: String = js.native
  var keepAlive: Double = js.native
  var lifetime: Double = js.native
  var metadataMimeType: String = js.native
  var payload: js.UndefOr[Payload[D, M]] = js.native
}

object DataMimeType {
  @scala.inline
  def apply[D, M](dataMimeType: String, keepAlive: Double, lifetime: Double, metadataMimeType: String): DataMimeType[D, M] = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMimeType[D, M]]
  }
  @scala.inline
  implicit class DataMimeTypeOps[Self[d, m] <: DataMimeType[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withDataMimeType(value: String): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAlive(value: Double): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifetime(value: Double): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataMimeType(value: String): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Payload[D, M]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

