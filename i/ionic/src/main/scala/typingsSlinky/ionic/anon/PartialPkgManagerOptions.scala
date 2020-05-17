package typingsSlinky.ionic.anon

import typingsSlinky.ionic.npmMod.PkgManagerCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/lib/utils/npm.PkgManagerOptions> */
@js.native
trait PartialPkgManagerOptions extends js.Object {
  var command: js.UndefOr[PkgManagerCommand] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var pkg: js.UndefOr[String] = js.native
  var save: js.UndefOr[Boolean] = js.native
  var saveDev: js.UndefOr[Boolean] = js.native
  var saveExact: js.UndefOr[Boolean] = js.native
  var script: js.UndefOr[String] = js.native
  var scriptArgs: js.UndefOr[js.Array[String]] = js.native
}

object PartialPkgManagerOptions {
  @scala.inline
  def apply(): PartialPkgManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPkgManagerOptions]
  }
  @scala.inline
  implicit class PartialPkgManagerOptionsOps[Self <: PartialPkgManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: PkgManagerCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withPkg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveDev")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveExact")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptArgs")(js.undefined)
        ret
    }
  }
  
}

