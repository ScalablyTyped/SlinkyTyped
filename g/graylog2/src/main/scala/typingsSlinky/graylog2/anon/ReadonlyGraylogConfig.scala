package typingsSlinky.graylog2.anon

import typingsSlinky.graylog2.mod.GraylogDeflate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graylog2.graylog2.GraylogConfig> */
@js.native
trait ReadonlyGraylogConfig extends js.Object {
  val bufferSize: js.UndefOr[Double] = js.native
  val deflate: js.UndefOr[GraylogDeflate] = js.native
  val facility: js.UndefOr[String] = js.native
  val hostname: js.UndefOr[String] = js.native
  val servers: js.Array[Readonlyhoststringportnum] = js.native
}

object ReadonlyGraylogConfig {
  @scala.inline
  def apply(servers: js.Array[Readonlyhoststringportnum]): ReadonlyGraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraylogConfig]
  }
  @scala.inline
  implicit class ReadonlyGraylogConfigOps[Self <: ReadonlyGraylogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServers(value: js.Array[Readonlyhoststringportnum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflate(value: GraylogDeflate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(js.undefined)
        ret
    }
    @scala.inline
    def withFacility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
  }
  
}

