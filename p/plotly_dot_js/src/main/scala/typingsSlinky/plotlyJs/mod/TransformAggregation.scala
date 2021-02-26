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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformAggregation extends StObject {
  
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
  implicit class TransformAggregationMutableBuilder[Self <: TransformAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFunc(value: count | sum | avg | median | mode | rms | stddev | min | max | first | last): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    @scala.inline
    def setFuncmode(value: sample | population): Self = StObject.set(x, "funcmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuncmodeUndefined: Self = StObject.set(x, "funcmode", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
