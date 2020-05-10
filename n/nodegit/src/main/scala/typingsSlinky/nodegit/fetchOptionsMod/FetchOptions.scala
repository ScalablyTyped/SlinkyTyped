package typingsSlinky.nodegit.fetchOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodegit.remoteCallbacksMod.RemoteCallbacks
import typingsSlinky.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions
  extends /* key */ StringDictionary[js.Any] {
  var callbacks: js.UndefOr[RemoteCallbacks] = js.native
  var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
  var downloadTags: js.UndefOr[Double] = js.native
  var proxyOpts: js.UndefOr[js.Any] = js.native
  var prune: js.UndefOr[Double] = js.native
  var updateFetchhead: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
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
    def withDownloadTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTags")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyOpts(value: js.Any): Self = {
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
    def withPrune(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFetchhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFetchhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFetchhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFetchhead")(js.undefined)
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

