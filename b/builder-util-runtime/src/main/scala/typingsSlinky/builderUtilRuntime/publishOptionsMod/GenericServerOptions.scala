package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.generic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericServerOptions
  extends AllPublishOptions
     with PublishConfiguration {
  /**
    * The channel.
    * @default latest
    */
  val channel: js.UndefOr[String | Null] = js.native
  /**
    * The provider. Must be `generic`.
    */
  @JSName("provider")
  val provider_GenericServerOptions: generic = js.native
  /**
    * The base url. e.g. `https://bucket_name.s3.amazonaws.com`.
    */
  val url: String = js.native
  /**
    * Whether to use multiple range requests for differential update. Defaults to `true` if `url` doesn't contain `s3.amazonaws.com`.
    */
  val useMultipleRangeRequest: js.UndefOr[Boolean] = js.native
}

object GenericServerOptions {
  @scala.inline
  def apply(provider: generic, url: String): GenericServerOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericServerOptions]
  }
  @scala.inline
  implicit class GenericServerOptionsOps[Self <: GenericServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: generic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(null)
        ret
    }
    @scala.inline
    def withUseMultipleRangeRequest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMultipleRangeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMultipleRangeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMultipleRangeRequest")(js.undefined)
        ret
    }
  }
  
}

