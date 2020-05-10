package typingsSlinky.eggCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggCoreOptions extends js.Object {
  /** the directory of application */
  var baseDir: js.UndefOr[String] = js.native
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.native
  /** server scope */
  var serverScope: js.UndefOr[String] = js.native
  /** egg type, application or agent */
  var `type`: js.UndefOr[EggType] = js.native
}

object EggCoreOptions {
  @scala.inline
  def apply(): EggCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EggCoreOptions]
  }
  @scala.inline
  implicit class EggCoreOptionsOps[Self <: EggCoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Plugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withServerScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: EggType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

