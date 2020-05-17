package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing available options when initializing a client
  */
@js.native
trait ClientOptions extends js.Object {
  /**
    * enable the experimental feature: caching requests instead of responses
    */
  var _useRequestCache: js.UndefOr[Boolean] = js.native
  /**
    * read: array of read hosts to use to call  servers, computed automatically
    * write: array of read hosts to use to call  servers, computed automatically
    */
  var hosts: js.UndefOr[Read] = js.native
  /**
    * (node only) httpAgent instance to use when communicating with  servers.
    */
  var httpAgent: js.UndefOr[js.Any] = js.native
  /**
    * Protocol to use when communicating with algolia
    * default: current protocol(browser), https(node)
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * Timeout for requests to our servers, in milliseconds
    * default: 15s (node), 2s (browser)
    */
  var timeout: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_useRequestCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useRequestCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_useRequestCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useRequestCache")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: Read): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpAgent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
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

