package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBindingsOptionsObject extends StObject {
  
  /**
    * ClassName of the element for a binding.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Last event to be fired after last step event.
    */
  var end: js.UndefOr[js.Function] = js.native
  
  /**
    * Initial event, fired on a button click.
    */
  var init: js.UndefOr[js.Function] = js.native
  
  /**
    * Event fired on first click on a chart.
    */
  var start: js.UndefOr[js.Function] = js.native
  
  /**
    * Last event to be fired after last step event. Array of step events to be
    * called sequentially after each user click.
    */
  var steps: js.UndefOr[js.Array[js.Function]] = js.native
}
object NavigationBindingsOptionsObject {
  
  @scala.inline
  def apply(): NavigationBindingsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsOptionsObject]
  }
  
  @scala.inline
  implicit class NavigationBindingsOptionsObjectMutableBuilder[Self <: NavigationBindingsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Function): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setStart(value: js.Function): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[js.Function]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: js.Function*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
