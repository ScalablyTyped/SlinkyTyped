package typingsSlinky.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Declarative event action that redirects a network request to a transparent image. */
@js.native
trait RedirectToTransparentImage extends OnRequestActions {
  val instanceType: String = js.native
  val typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage = js.native
}

object RedirectToTransparentImage {
  @scala.inline
  def apply(
    instanceType: String,
    typeGuard: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage
  ): RedirectToTransparentImage = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = typeGuard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectToTransparentImage]
  }
  @scala.inline
  implicit class RedirectToTransparentImageOps[Self <: RedirectToTransparentImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeGuard(value: typingsSlinky.chromeApps.chromeAppsStrings.RedirectToTransparentImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeGuard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

