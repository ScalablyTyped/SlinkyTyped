package typingsSlinky.pako.anon

import typingsSlinky.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pako.pako.InflateFunctionOptions & {  to  :'string'} */
@js.native
trait InflateFunctionOptionstos extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[string] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object InflateFunctionOptionstos {
  @scala.inline
  def apply(): InflateFunctionOptionstos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InflateFunctionOptionstos]
  }
  @scala.inline
  implicit class InflateFunctionOptionstosOps[Self <: InflateFunctionOptionstos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(js.undefined)
        ret
    }
  }
  
}

