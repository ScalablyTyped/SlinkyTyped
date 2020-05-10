package typingsSlinky.gatsby.mod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerArgs extends BrowserPluginArgs {
  var serviceWorker: ServiceWorkerRegistration = js.native
}

object ServiceWorkerArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    serviceWorker: ServiceWorkerRegistration
  ): ServiceWorkerArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], serviceWorker = serviceWorker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerArgs]
  }
  @scala.inline
  implicit class ServiceWorkerArgsOps[Self <: ServiceWorkerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceWorker(value: ServiceWorkerRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceWorker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

