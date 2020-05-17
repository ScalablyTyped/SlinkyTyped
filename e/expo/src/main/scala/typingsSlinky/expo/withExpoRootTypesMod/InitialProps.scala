package typingsSlinky.expo.withExpoRootTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expo.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialProps
  extends /* key */ StringDictionary[js.Any] {
  var exp: Dictkey = js.native
  var shell: js.UndefOr[Boolean] = js.native
  var shellManifestUrl: js.UndefOr[String] = js.native
}

object InitialProps {
  @scala.inline
  def apply(exp: Dictkey): InitialProps = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
  @scala.inline
  implicit class InitialPropsOps[Self <: InitialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
    @scala.inline
    def withShellManifestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellManifestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShellManifestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shellManifestUrl")(js.undefined)
        ret
    }
  }
  
}

