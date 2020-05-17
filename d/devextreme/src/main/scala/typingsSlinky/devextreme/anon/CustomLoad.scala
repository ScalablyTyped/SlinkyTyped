package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.localStorage
import typingsSlinky.devextreme.devextremeStrings.sessionStorage
import typingsSlinky.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLoad extends js.Object {
  var customLoad: js.UndefOr[js.Function0[typingsSlinky.devextreme.mod.global.Promise[_] | JQueryPromise[_]]] = js.native
  var customSave: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var savingTimeout: js.UndefOr[Double] = js.native
  var storageKey: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[custom | localStorage | sessionStorage] = js.native
}

object CustomLoad {
  @scala.inline
  def apply(): CustomLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoad]
  }
  @scala.inline
  implicit class CustomLoadOps[Self <: CustomLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLoad(value: () => typingsSlinky.devextreme.mod.global.Promise[_] | JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCustomLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSave(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSave")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: custom | localStorage | sessionStorage): Self = {
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

