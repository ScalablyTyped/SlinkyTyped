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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFunc(value: count | sum | avg | median | mode | rms | stddev | min | max | first | last): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    
    @scala.inline
    def setFuncmode(value: sample | population): Self = this.set("funcmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuncmode: Self = this.set("funcmode", js.undefined)
  }
}
