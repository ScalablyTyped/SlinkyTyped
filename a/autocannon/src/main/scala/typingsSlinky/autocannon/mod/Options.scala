package typingsSlinky.autocannon.mod

import typingsSlinky.autocannon.autocannonStrings.ACL
import typingsSlinky.autocannon.autocannonStrings.BIND
import typingsSlinky.autocannon.autocannonStrings.CHECKOUT
import typingsSlinky.autocannon.autocannonStrings.CONNECT
import typingsSlinky.autocannon.autocannonStrings.COPY
import typingsSlinky.autocannon.autocannonStrings.DELETE
import typingsSlinky.autocannon.autocannonStrings.GET
import typingsSlinky.autocannon.autocannonStrings.HEAD
import typingsSlinky.autocannon.autocannonStrings.LINK
import typingsSlinky.autocannon.autocannonStrings.LOCK
import typingsSlinky.autocannon.autocannonStrings.MERGE
import typingsSlinky.autocannon.autocannonStrings.MKACTIVITY
import typingsSlinky.autocannon.autocannonStrings.MKCALENDAR
import typingsSlinky.autocannon.autocannonStrings.MKCOL
import typingsSlinky.autocannon.autocannonStrings.MOVE
import typingsSlinky.autocannon.autocannonStrings.NOTIFY
import typingsSlinky.autocannon.autocannonStrings.OPTIONS
import typingsSlinky.autocannon.autocannonStrings.PATCH
import typingsSlinky.autocannon.autocannonStrings.POST
import typingsSlinky.autocannon.autocannonStrings.PROPFIND
import typingsSlinky.autocannon.autocannonStrings.PROPPATCH
import typingsSlinky.autocannon.autocannonStrings.PURGE
import typingsSlinky.autocannon.autocannonStrings.PUT
import typingsSlinky.autocannon.autocannonStrings.REBIND
import typingsSlinky.autocannon.autocannonStrings.REPORT
import typingsSlinky.autocannon.autocannonStrings.SEARCH
import typingsSlinky.autocannon.autocannonStrings.SOURCE
import typingsSlinky.autocannon.autocannonStrings.SUBSCRIBE
import typingsSlinky.autocannon.autocannonStrings.TRACE
import typingsSlinky.autocannon.autocannonStrings.UNBIND
import typingsSlinky.autocannon.autocannonStrings.UNLINK
import typingsSlinky.autocannon.autocannonStrings.UNLOCK
import typingsSlinky.autocannon.autocannonStrings.UNSUBSCRIBE
import typingsSlinky.autocannon.autocannonStrings.`M-SEARCH`
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A `Number` stating the amount of requests to make before ending the test.
    * This overrides duration and takes precedence, so the test won't end
    * until the amount of requests needed to be completed are completed.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The threshold of the number of errors when making the requests to the server before this instance bail's out.
    * This instance will take all existing results so far and aggregate them into the results.
    * If none passed here, the instance will ignore errors and never bail out.
    */
  var bailout: js.UndefOr[Double] = js.native
  /**
    * A `String` or a `Buffer` containing the body of the request.
    *
    * Insert one or more randomly generated IDs into the body by including `[<id>]`
    * where the randomly generated ID should be inserted (Must also set idReplacement to true).
    *
    * This can be useful in soak testing POST endpoints where one or more fields must be unique.
    *
    * Leave undefined for an empty body.
    */
  var body: js.UndefOr[String | Buffer] = js.native
  /**
    * A `Number` stating the rate of requests to make per second from each individual connection.
    * No rate limiting by default.
    */
  var connectionRate: js.UndefOr[Double] = js.native
  /**
    * The number of concurrent connections.
    * @default 10
    */
  var connections: js.UndefOr[Double] = js.native
  /**
    * The number of seconds to run the autocannon.
    * Can be a [timestring](https://www.npmjs.com/package/timestring).
    * @default 10
    */
  var duration: js.UndefOr[Double | String] = js.native
  /**
    * A `Boolean` which allows you to disable tracking non 2xx code responses in latency and bytes per second calculations.
    * @default false
    */
  var excludeErrorStats: js.UndefOr[Boolean] = js.native
  /**
    * A `Boolean` which allows you to setup an instance of autocannon that restarts indefinitely after emiting results with the `done` event.
    * Useful for efficiently restarting your instance. To stop running forever, you must cause a `SIGINT` or call the `.stop()` function on your instance.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.native
  /**
    * An `Object` containing the headers of the request.
    * @default {}
    */
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  /**
    * A `Boolean` which enables the replacement of `[<id>]` tags within the request body with a randomly generated ID,
    * allowing for unique fields to be sent with requests.
    * @default false
    */
  var idReplacement: js.UndefOr[Boolean] = js.native
  /**
    * A `Number` stating the max requests to make per connection.
    * `amount` takes precedence if both are set.
    */
  var maxConnectionRequests: js.UndefOr[Double] = js.native
  /**
    * A `Number` stating the max requests to make overall.
    * Can't be less than `connections`.
    */
  var maxOverallRequests: js.UndefOr[Double] = js.native
  /**
    * The http method to use.
    * @default 'GET'
    */
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.native
  /**
    * A `Number` stating the rate of requests to make per second from all connections.
    * `connectionRate` takes precedence if both are set.
    * No rate limiting by default.
    */
  var overallRate: js.UndefOr[Double] = js.native
  /**
    *  The number of [pipelined requests](https://en.wikipedia.org/wiki/HTTP_pipelining) for each connection.
    * Will cause the `Client` API to throw when greater than 1
    * @default 1
    */
  var pipelining: js.UndefOr[Double] = js.native
  /**
    * A `Number` which makes the individual connections disconnect and reconnect to the server
    * whenever it has sent that number of requests.
    */
  var reconnectRate: js.UndefOr[Double] = js.native
  /**
    * An `Array` of `Objects` which represents the sequence of requests to make while benchmarking.
    * Can be used in conjunction with the `body`, `headers` and `method` params above.
    *
    * The `Objects` in this array can have `body`, `headers`, `method`, or `path` attributes, which overwrite those that are passed in this `opts` object.
    * Therefore, the ones in this (`opts`) object take precedence and should be viewed as defaults.
    */
  var requests: js.UndefOr[js.Array[Request]] = js.native
  /**
    * A `String` identifying the server name for the SNI (Server Name Indication) TLS extension.
    */
  var servername: js.UndefOr[String] = js.native
  /**
    * A `Function` which will be passed the Client object for each connection to be made.
    * This can be used to customise each individual connection headers and body using the API shown below.
    *
    * The changes you make to the client in this function will take precedence over the default body and headers you pass in here.
    *
    * @default noop(){}
    */
  var setupClient: js.UndefOr[js.Function1[/* client */ Client, Unit]] = js.native
  /**
    * A path to a Unix Domain Socket or a Windows Named Pipe.
    * A `url` is still required in order to send the correct Host header and path.
    */
  var socketPath: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for a response before timeout.
    * @default 10
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * A `String` to be added to the results for identification.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The given target. Can be http or https.
    */
  var url: String = js.native
}

object Options {
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withBailout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bailout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBailout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bailout")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRate")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeErrorStats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeErrorStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeErrorStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeErrorStats")(js.undefined)
        ret
    }
    @scala.inline
    def withForever(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForever: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forever")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: IncomingHttpHeaders): Self = {
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
    def withIdReplacement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idReplacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idReplacement")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnectionRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnectionRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOverallRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOverallRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOverallRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOverallRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(
      value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
    ): Self = {
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
    def withOverallRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallRate")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelining")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: js.Array[Request]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
    @scala.inline
    def withServername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servername")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupClient(value: /* client */ Client => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetupClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupClient")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

