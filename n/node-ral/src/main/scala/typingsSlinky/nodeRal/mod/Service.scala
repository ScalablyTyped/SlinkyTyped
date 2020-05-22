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

trait Service extends js.Object {
  var balance: random | roundrobin | hashring
  var data: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[`utf-8` | GBK] = js.undefined
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  var hybird: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  var pack: buildInConverter
  var path: js.UndefOr[String] = js.undefined
  var protocol: http | https | soap | redis
  var query: js.UndefOr[js.Any] = js.undefined
  var retry: js.UndefOr[Double] = js.undefined
  var server: js.Array[Server]
  var timeout: js.UndefOr[Double] = js.undefined
  var unpack: buildInConverter
}

object Service {
  @scala.inline
  def apply(
    balance: random | roundrobin | hashring,
    pack: buildInConverter,
    protocol: http | https | soap | redis,
    server: js.Array[Server],
    unpack: buildInConverter,
    data: js.Any = null,
    encoding: `utf-8` | GBK = null,
    headers: StringDictionary[String | Double] = null,
    hybird: js.UndefOr[Boolean] = js.undefined,
    method: GET | POST = null,
    path: String = null,
    query: js.Any = null,
    retry: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Service = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(hybird)) __obj.updateDynamic("hybird")(hybird.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

