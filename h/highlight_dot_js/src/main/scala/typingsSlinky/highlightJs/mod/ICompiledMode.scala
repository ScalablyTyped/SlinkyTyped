package typingsSlinky.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiledMode extends IModeBase {
  var compiled: Boolean = js.native
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.native
  var keywords: js.UndefOr[js.Object] = js.native
  var terminator_end: js.UndefOr[String] = js.native
  var terminators: js.RegExp = js.native
}

object ICompiledMode {
  @scala.inline
  def apply(compiled: Boolean, terminators: js.RegExp): ICompiledMode = {
    val __obj = js.Dynamic.literal(compiled = compiled.asInstanceOf[js.Any], terminators = terminators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompiledMode]
  }
  @scala.inline
  implicit class ICompiledModeOps[Self <: ICompiledMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminators(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: js.Array[ICompiledMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminator_end(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminator_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminator_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminator_end")(js.undefined)
        ret
    }
  }
  
}

