package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsAdvancedOptions extends js.Object {
  var fibonacci: js.UndefOr[StockToolsGuiDefinitionsAdvancedFibonacciOptions] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var parallelChannel: js.UndefOr[StockToolsGuiDefinitionsAdvancedParallelChannelOptions] = js.native
  var pitchfork: js.UndefOr[StockToolsGuiDefinitionsAdvancedPitchforkOptions] = js.native
}

object StockToolsGuiDefinitionsAdvancedOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsAdvancedOptionsOps[Self <: StockToolsGuiDefinitionsAdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFibonacci(value: StockToolsGuiDefinitionsAdvancedFibonacciOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFibonacci: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelChannel(value: StockToolsGuiDefinitionsAdvancedParallelChannelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchfork(value: StockToolsGuiDefinitionsAdvancedPitchforkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(js.undefined)
        ret
    }
  }
  
}

