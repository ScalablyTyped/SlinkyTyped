package typingsSlinky.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoConstants.AnonScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformManifest
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[AndroidManifest] = js.native
  var detach: js.UndefOr[AnonScheme] = js.native
  var developer: js.UndefOr[String] = js.native
  var hostUri: js.UndefOr[String] = js.native
  var ios: js.UndefOr[IOSManifest] = js.native
  var logUrl: js.UndefOr[String] = js.native
  var scheme: js.UndefOr[String] = js.native
  var web: js.UndefOr[WebManifest] = js.native
}

object PlatformManifest {
  @scala.inline
  def apply(): PlatformManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformManifest]
  }
  @scala.inline
  implicit class PlatformManifestOps[Self <: PlatformManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: AndroidManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withDetach(value: AnonScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(js.undefined)
        ret
    }
    @scala.inline
    def withHostUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: IOSManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: WebManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
  }
  
}

