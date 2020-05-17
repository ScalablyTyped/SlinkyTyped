package typingsSlinky.esm.mod.Options

import typingsSlinky.esm.anon.PartialEsm
import typingsSlinky.esm.esmStrings.all
import typingsSlinky.esm.esmStrings.auto
import typingsSlinky.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var await: Boolean = js.native
  var cjs: Boolean | PartialEsm = js.native
  var force: Boolean = js.native
  var mainFields: js.Array[String] = js.native
  var mode: auto | all | strict = js.native
  var wasm: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(
    await: Boolean,
    cjs: Boolean | PartialEsm,
    force: Boolean,
    mainFields: js.Array[String],
    mode: auto | all | strict,
    wasm: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], cjs = cjs.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: typingsSlinky.esm.mod.Options.Options] (val x: Self) extends AnyVal {
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
    def withCjs(value: Boolean | PartialEsm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: auto | all | strict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

