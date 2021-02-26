package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.checkboxClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesCheckboxClickEventObject extends StObject {
  
  /**
    * Whether the box has been checked.
    */
  var checked: Boolean = js.native
  
  /**
    * Related series.
    */
  var item: Series = js.native
  
  /**
    * Related series.
    */
  var target: Series = js.native
  
  /**
    * Event type.
    */
  var `type`: checkboxClick = js.native
}
object SeriesCheckboxClickEventObject {
  
  @scala.inline
  def apply(checked: Boolean, item: Series, target: Series, `type`: checkboxClick): SeriesCheckboxClickEventObject = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCheckboxClickEventObject]
  }
  
  @scala.inline
  implicit class SeriesCheckboxClickEventObjectMutableBuilder[Self <: SeriesCheckboxClickEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Series): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Series): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: checkboxClick): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
