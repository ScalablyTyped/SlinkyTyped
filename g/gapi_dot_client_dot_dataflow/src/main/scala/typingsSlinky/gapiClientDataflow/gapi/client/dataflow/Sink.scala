package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink extends js.Object {
  /** The codec to use to encode data written to the sink. */
  var codec: js.UndefOr[Record[String, _]] = js.native
  /** The sink to write to, plus its parameters. */
  var spec: js.UndefOr[Record[String, _]] = js.native
}

object Sink {
  @scala.inline
  def apply(): Sink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sink]
  }
  @scala.inline
  implicit class SinkOps[Self <: Sink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
  }
  
}

