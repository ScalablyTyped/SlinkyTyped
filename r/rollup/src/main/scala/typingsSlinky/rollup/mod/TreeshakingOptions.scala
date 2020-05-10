package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeshakingOptions extends js.Object {
  var annotations: js.UndefOr[Boolean] = js.native
  var moduleSideEffects: js.UndefOr[ModuleSideEffectsOption] = js.native
  var propertyReadSideEffects: js.UndefOr[Boolean] = js.native
  /** @deprecated Use `moduleSideEffects` instead */
  var pureExternalModules: js.UndefOr[PureModulesOption] = js.native
  var tryCatchDeoptimization: js.UndefOr[Boolean] = js.native
  var unknownGlobalSideEffects: js.UndefOr[Boolean] = js.native
}

object TreeshakingOptions {
  @scala.inline
  def apply(): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeshakingOptions]
  }
  @scala.inline
  implicit class TreeshakingOptionsOps[Self <: TreeshakingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleSideEffectsFunction2(value: (/* id */ String, /* external */ Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withModuleSideEffects(value: ModuleSideEffectsOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyReadSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyReadSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyReadSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyReadSideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withPureExternalModulesFunction1(value: /* id */ String => js.UndefOr[Boolean | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureExternalModules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPureExternalModules(value: PureModulesOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureExternalModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPureExternalModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pureExternalModules")(js.undefined)
        ret
    }
    @scala.inline
    def withTryCatchDeoptimization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryCatchDeoptimization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTryCatchDeoptimization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryCatchDeoptimization")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownGlobalSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownGlobalSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownGlobalSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownGlobalSideEffects")(js.undefined)
        ret
    }
  }
  
}

