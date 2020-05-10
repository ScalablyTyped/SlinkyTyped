package typingsSlinky.materialUiCore.createGenerateClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateClassNameOptions extends js.Object {
  var dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.native
  var productionPrefix: js.UndefOr[String] = js.native
  var seed: js.UndefOr[String] = js.native
}

object GenerateClassNameOptions {
  @scala.inline
  def apply(): GenerateClassNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateClassNameOptions]
  }
  @scala.inline
  implicit class GenerateClassNameOptionsOps[Self <: GenerateClassNameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDangerouslyUseGlobalCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyUseGlobalCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslyUseGlobalCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslyUseGlobalCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
  }
  
}

