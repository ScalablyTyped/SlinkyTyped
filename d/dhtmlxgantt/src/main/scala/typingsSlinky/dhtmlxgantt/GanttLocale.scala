package typingsSlinky.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttLocale extends StObject {
  
  var date: GanttLocaleDate = js.native
  
  var labels: GanttLocaleLabels = js.native
}
object GanttLocale {
  
  @scala.inline
  def apply(date: GanttLocaleDate, labels: GanttLocaleLabels): GanttLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocale]
  }
  
  @scala.inline
  implicit class GanttLocaleMutableBuilder[Self <: GanttLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: GanttLocaleDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: GanttLocaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
