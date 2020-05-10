package typingsSlinky.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFactory[TChart /* <: Nvd3Element */] extends js.Object {
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.native
  def generate(): TChart = js.native
}

object ChartFactory {
  @scala.inline
  def apply[TChart](generate: () => TChart): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
  @scala.inline
  implicit class ChartFactoryOps[Self[tchart] <: ChartFactory[tchart], TChart] (val x: Self[TChart]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TChart] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TChart]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TChart] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TChart] with Other]
    @scala.inline
    def withGenerate(value: () => TChart): Self[TChart] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallback(value: /* chart */ TChart => Unit): Self[TChart] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self[TChart] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
  }
  
}

