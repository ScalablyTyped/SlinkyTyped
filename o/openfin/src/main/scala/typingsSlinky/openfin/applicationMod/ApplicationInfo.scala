package typingsSlinky.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  var initialOptions: js.Object = js.native
  var launchMode: String = js.native
  var manifest: js.Object = js.native
  var manifestUrl: String = js.native
  var parentUuid: js.UndefOr[String] = js.native
  var runtime: js.Object = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(
    initialOptions: js.Object,
    launchMode: String,
    manifest: js.Object,
    manifestUrl: String,
    runtime: js.Object
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal(initialOptions = initialOptions.asInstanceOf[js.Any], launchMode = launchMode.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentUuid")(js.undefined)
        ret
    }
  }
  
}

