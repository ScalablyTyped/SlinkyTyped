package typingsSlinky.esm.anon

import typingsSlinky.esm.esmStrings.all
import typingsSlinky.esm.esmStrings.auto
import typingsSlinky.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<esm.esm.Options.Options> */
@js.native
trait PartialOptions extends js.Object {
  var await: js.UndefOr[Boolean] = js.native
  var cjs: js.UndefOr[Boolean | PartialEsm] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  var mode: js.UndefOr[auto | all | strict] = js.native
  var wasm: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("await")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("await")(js.undefined)
        ret
    }
    @scala.inline
    def withCjs(value: Boolean | PartialEsm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCjs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cjs")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: auto | all | strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withWasm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasm")(js.undefined)
        ret
    }
  }
  
}

