package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.babelCoreStrings.plugin
import typingsSlinky.babelCore.babelCoreStrings.preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigItemOptions extends js.Object {
  var dirname: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[preset | plugin] = js.native
}

object CreateConfigItemOptions {
  @scala.inline
  def apply(): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
  @scala.inline
  implicit class CreateConfigItemOptionsOps[Self <: CreateConfigItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: preset | plugin): Self = {
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

