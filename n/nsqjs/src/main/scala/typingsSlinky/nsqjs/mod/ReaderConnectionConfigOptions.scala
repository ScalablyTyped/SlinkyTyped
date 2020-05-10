package typingsSlinky.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderConnectionConfigOptions extends ConnectionConfigOptions {
  var lookupdHTTPAddresses: js.UndefOr[String | js.Array[String]] = js.native
  var lookupdPollInterval: js.UndefOr[Double] = js.native
  var lookupdPollJitter: js.UndefOr[Double] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var maxBackoffDuration: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var nsqdTCPAddresses: js.UndefOr[String | js.Array[String]] = js.native
}

object ReaderConnectionConfigOptions {
  @scala.inline
  def apply(): ReaderConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaderConnectionConfigOptions]
  }
  @scala.inline
  implicit class ReaderConnectionConfigOptionsOps[Self <: ReaderConnectionConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookupdHTTPAddresses(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdHTTPAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupdHTTPAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdHTTPAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupdPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdPollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupdPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdPollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupdPollJitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdPollJitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupdPollJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupdPollJitter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBackoffDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBackoffDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBackoffDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBackoffDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNsqdTCPAddresses(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsqdTCPAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsqdTCPAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsqdTCPAddresses")(js.undefined)
        ret
    }
  }
  
}

