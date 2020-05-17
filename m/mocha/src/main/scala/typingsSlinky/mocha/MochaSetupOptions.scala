package typingsSlinky.mocha

import typingsSlinky.mocha.Mocha.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to `mocha.setup` in the browser.
  */
@js.native
trait MochaSetupOptions extends MochaOptions {
  var fullTrace: js.UndefOr[Boolean] = js.native
  /** @deprecated This is not used by Mocha. Use `files` instead. */
  var require: js.UndefOr[js.Array[String]] = js.native
}

object MochaSetupOptions {
  @scala.inline
  def apply(): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaSetupOptions]
  }
  @scala.inline
  implicit class MochaSetupOptionsOps[Self <: MochaSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
  }
  
}

