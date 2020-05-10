package typingsSlinky.nodeRal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeRal.nodeRalStrings.GBK
import typingsSlinky.nodeRal.nodeRalStrings.GET
import typingsSlinky.nodeRal.nodeRalStrings.POST
import typingsSlinky.nodeRal.nodeRalStrings.`utf-8`
import typingsSlinky.nodeRal.nodeRalStrings.hashring
import typingsSlinky.nodeRal.nodeRalStrings.http
import typingsSlinky.nodeRal.nodeRalStrings.https
import typingsSlinky.nodeRal.nodeRalStrings.random
import typingsSlinky.nodeRal.nodeRalStrings.redis
import typingsSlinky.nodeRal.nodeRalStrings.roundrobin
import typingsSlinky.nodeRal.nodeRalStrings.soap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var balance: random | roundrobin | hashring = js.native
  var data: js.UndefOr[js.Any] = js.native
  var encoding: js.UndefOr[`utf-8` | GBK] = js.native
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  var hybird: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[GET | POST] = js.native
  var pack: buildInConverter = js.native
  var path: js.UndefOr[String] = js.native
  var protocol: http | https | soap | redis = js.native
  var query: js.UndefOr[js.Any] = js.native
  var retry: js.UndefOr[Double] = js.native
  var server: js.Array[Server] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var unpack: buildInConverter = js.native
}

object Service {
  @scala.inline
  def apply(
    balance: random | roundrobin | hashring,
    pack: buildInConverter,
    protocol: http | https | soap | redis,
    server: js.Array[Server],
    unpack: buildInConverter
  ): Service = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalance(value: random | roundrobin | hashring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPack(value: buildInConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: http | https | soap | redis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: js.Array[Server]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpack(value: buildInConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: `utf-8` | GBK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHybird(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybird")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHybird: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybird")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: GET | POST): Self = {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

