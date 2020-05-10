package typingsSlinky.firefox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var installOrigin: String = js.native
  var installTime: Double = js.native
  var manifest: js.Any = js.native
  var manifestURL: String = js.native
  var origin: String = js.native
  var receipts: js.Array[_] = js.native
  def checkForUpdate(): DOMRequest[_] = js.native
  def launch(): Unit = js.native
}

object App {
  @scala.inline
  def apply(
    checkForUpdate: () => DOMRequest[_],
    installOrigin: String,
    installTime: Double,
    launch: () => Unit,
    manifest: js.Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[_]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = js.Any.fromFunction0(launch), manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckForUpdate(value: () => DOMRequest[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstallOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withManifest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

