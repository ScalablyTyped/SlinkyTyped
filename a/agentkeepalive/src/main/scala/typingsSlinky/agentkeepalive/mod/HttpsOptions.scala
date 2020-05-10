package typingsSlinky.agentkeepalive.mod

import typingsSlinky.node.httpsMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpsOptions extends AgentOptions {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  var freeSocketTimeout: js.UndefOr[Double] = js.native
  var socketActiveTTL: js.UndefOr[Double] = js.native
}

object HttpsOptions {
  @scala.inline
  def apply(): HttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOptions]
  }
  @scala.inline
  implicit class HttpsOptionsOps[Self <: HttpsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeSocketKeepAliveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketKeepAliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeSocketKeepAliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketKeepAliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeSocketTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeSocketTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSocketTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketActiveTTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketActiveTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketActiveTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketActiveTTL")(js.undefined)
        ret
    }
  }
  
}

