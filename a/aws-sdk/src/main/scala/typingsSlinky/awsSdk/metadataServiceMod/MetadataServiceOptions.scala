package typingsSlinky.awsSdk.metadataServiceMod

import typingsSlinky.awsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataServiceOptions extends js.Object {
  /**
    * the hostname of the instance metadata service.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * a map of options to pass to the underlying HTTP request.
    */
  var httpOptions: js.UndefOr[Timeout] = js.native
  /**
    * the maximum number of retries to perform for timeout errors.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  /**
    * A set of options to configure the retry delay on retryable errors. See AWS.Config for details.
    */
  var retryDelayOptions: js.UndefOr[js.Any] = js.native
}

object MetadataServiceOptions {
  @scala.inline
  def apply(): MetadataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataServiceOptions]
  }
  @scala.inline
  implicit class MetadataServiceOptionsOps[Self <: MetadataServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOptions(value: Timeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelayOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayOptions")(js.undefined)
        ret
    }
  }
  
}

