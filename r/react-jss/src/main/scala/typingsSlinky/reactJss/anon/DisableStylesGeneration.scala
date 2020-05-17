package typingsSlinky.reactJss.anon

import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.SheetsRegistry
import typingsSlinky.jss.mod.StyleSheetFactoryOptions
import typingsSlinky.reactJss.mod.Managers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableStylesGeneration extends js.Object {
  var disableStylesGeneration: Boolean = js.native
  var jss: js.UndefOr[Jss] = js.native
  var managers: js.UndefOr[Managers] = js.native
  var registry: js.UndefOr[SheetsRegistry] = js.native
  var sheetOptions: StyleSheetFactoryOptions = js.native
}

object DisableStylesGeneration {
  @scala.inline
  def apply(disableStylesGeneration: Boolean, sheetOptions: StyleSheetFactoryOptions): DisableStylesGeneration = {
    val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableStylesGeneration]
  }
  @scala.inline
  implicit class DisableStylesGenerationOps[Self <: DisableStylesGeneration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableStylesGeneration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStylesGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheetOptions(value: StyleSheetFactoryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJss(value: Jss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(js.undefined)
        ret
    }
    @scala.inline
    def withManagers(value: Managers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managers")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistry(value: SheetsRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
  }
  
}

