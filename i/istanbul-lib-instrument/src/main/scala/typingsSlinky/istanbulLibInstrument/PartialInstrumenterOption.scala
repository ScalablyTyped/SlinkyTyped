package typingsSlinky.istanbulLibInstrument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-instrument.istanbul-lib-instrument.InstrumenterOptions> */
@js.native
trait PartialInstrumenterOption extends js.Object {
  var autoWrap: js.UndefOr[Boolean] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var coverageVariable: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var esModules: js.UndefOr[Boolean] = js.native
  var preserveComments: js.UndefOr[Boolean] = js.native
  var produceSourceMap: js.UndefOr[Boolean] = js.native
  var sourceMapUrlCallback: js.UndefOr[js.Function2[/* filename */ String, /* url */ String, Unit]] = js.native
}

object PartialInstrumenterOption {
  @scala.inline
  def apply(): PartialInstrumenterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInstrumenterOption]
  }
  @scala.inline
  implicit class PartialInstrumenterOptionOps[Self <: PartialInstrumenterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
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
    def withEsModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModules")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveComments")(js.undefined)
        ret
    }
    @scala.inline
    def withProduceSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduceSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceSourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapUrlCallback(value: (/* filename */ String, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapUrlCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSourceMapUrlCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapUrlCallback")(js.undefined)
        ret
    }
  }
  
}

