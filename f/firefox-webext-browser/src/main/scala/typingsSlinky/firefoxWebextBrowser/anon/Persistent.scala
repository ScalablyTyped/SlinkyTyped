package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typingsSlinky.firefoxWebextBrowser.browser.manifest.PersistentBackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persistent extends js.Object {
  var persistent: js.UndefOr[PersistentBackgroundProperty] = js.native
  var scripts: js.Array[ExtensionURL] = js.native
}

object Persistent {
  @scala.inline
  def apply(scripts: js.Array[ExtensionURL]): Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistent]
  }
  @scala.inline
  implicit class PersistentOps[Self <: Persistent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScripts(value: js.Array[ExtensionURL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistent(value: PersistentBackgroundProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
  }
  
}

