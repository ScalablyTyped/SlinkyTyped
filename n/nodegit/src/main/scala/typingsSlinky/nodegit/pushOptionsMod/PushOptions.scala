package typingsSlinky.nodegit.pushOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.proxyOptionsMod.ProxyOptions
import typingsSlinky.nodegit.remoteCallbacksMod.RemoteCallbacks
import typingsSlinky.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushOptions
  extends /* key */ StringDictionary[js.Any] {
  var callbacks: js.UndefOr[RemoteCallbacks] = js.native
  var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  var pbParallelism: js.UndefOr[Double] = js.native
  var proxyOpts: js.UndefOr[ProxyOptions] = js.native
  var version: js.UndefOr[Double] = js.native
}

object PushOptions {
  @scala.inline
  def apply(): PushOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushOptions]
  }
  @scala.inline
  implicit class PushOptionsOps[Self <: PushOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbacks(value: RemoteCallbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeaders(value: Strarray | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPbParallelism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pbParallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPbParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pbParallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyOpts(value: ProxyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

