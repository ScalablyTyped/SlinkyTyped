package typingsSlinky.googleapis.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var includePrivate: js.UndefOr[Boolean] = js.native
}

object GeneratorOptions {
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  @scala.inline
  implicit class GeneratorOptionsOps[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrivate")(js.undefined)
        ret
    }
  }
  
}

