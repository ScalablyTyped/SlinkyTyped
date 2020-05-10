package typingsSlinky.postcssModulesExtractImports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var createImportedName: js.UndefOr[js.Function2[/* importName */ String, /* importPath */ String, String]] = js.native
  var failOnWrongOrder: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImportedName(value: (/* importName */ String, /* importPath */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportedName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateImportedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportedName")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnWrongOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWrongOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnWrongOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWrongOrder")(js.undefined)
        ret
    }
  }
  
}

