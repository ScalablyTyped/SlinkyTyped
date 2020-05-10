package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.avg
import typingsSlinky.plotlyJs.plotlyJsStrings.count
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.max
import typingsSlinky.plotlyJs.plotlyJsStrings.median
import typingsSlinky.plotlyJs.plotlyJsStrings.min
import typingsSlinky.plotlyJs.plotlyJsStrings.mode
import typingsSlinky.plotlyJs.plotlyJsStrings.population
import typingsSlinky.plotlyJs.plotlyJsStrings.rms
import typingsSlinky.plotlyJs.plotlyJsStrings.sample
import typingsSlinky.plotlyJs.plotlyJsStrings.stddev
import typingsSlinky.plotlyJs.plotlyJsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformAggregation extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.native
  var funcmode: js.UndefOr[sample | population] = js.native
  var target: String = js.native
}

object TransformAggregation {
  @scala.inline
  def apply(target: String): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
  @scala.inline
  implicit class TransformAggregationOps[Self <: TransformAggregation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFunc(value: count | sum | avg | median | mode | rms | stddev | min | max | first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.undefined)
        ret
    }
    @scala.inline
    def withFuncmode(value: sample | population): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuncmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcmode")(js.undefined)
        ret
    }
  }
  
}

