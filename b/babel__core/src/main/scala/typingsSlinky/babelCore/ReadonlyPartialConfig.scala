package typingsSlinky.babelCore

import typingsSlinky.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@babel/core.@babel/core.PartialConfig> */
@js.native
trait ReadonlyPartialConfig extends js.Object {
  val babelignore: js.UndefOr[String] = js.native
  val babelrc: js.UndefOr[String] = js.native
  val config: js.UndefOr[String] = js.native
  val options: TransformOptions = js.native
}

object ReadonlyPartialConfig {
  @scala.inline
  def apply(options: TransformOptions): ReadonlyPartialConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialConfig]
  }
  @scala.inline
  implicit class ReadonlyPartialConfigOps[Self <: ReadonlyPartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: TransformOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBabelignore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelignore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelignore")(js.undefined)
        ret
    }
    @scala.inline
    def withBabelrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBabelrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babelrc")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

