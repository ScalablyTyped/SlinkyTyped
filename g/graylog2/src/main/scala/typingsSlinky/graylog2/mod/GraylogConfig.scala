package typingsSlinky.graylog2.mod

import typingsSlinky.graylog2.anon.Readonlyhoststringportnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraylogConfig extends js.Object {
  /**
    * The max UDP packet size. Should never exceed the MTU of your system.
    * The default value is 1400
    */
  var bufferSize: js.UndefOr[Double] = js.native
  /**
    * The strategy for a message compression:
    *  "always"  -  every message will be compressed with zlib.deflate
    *  "never"   -  no compression
    *  "optimal" -  messages bigger than GraylogConfig.bufferSize will be compressed
    *
    *  The default value is "optimal"
    */
  var deflate: js.UndefOr[GraylogDeflate] = js.native
  /**
    * The facility - log's field type in Graylog.
    * The default value is "Node.js"
    */
  var facility: js.UndefOr[String] = js.native
  /**
    * The name of a host.
    * The default value is "os.hostname()"
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * The list of graylog servers
    */
  var servers: js.Array[Readonlyhoststringportnum] = js.native
}

object GraylogConfig {
  @scala.inline
  def apply(servers: js.Array[Readonlyhoststringportnum]): GraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraylogConfig]
  }
  @scala.inline
  implicit class GraylogConfigOps[Self <: GraylogConfig] (val x: Self) extends AnyVal {
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

