package typingsSlinky.jqueryMatchHeight

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryMatchHeight.JQueryMatchHeight.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMatchHeight extends StObject {
  
  /**
    * Set all selected elements to the height of the tallest.
    * If the items are on multiple rows, the items of each row will be set to the tallest of that row.
    */
  def apply(): JQuery = js.native
  def apply(options: Options): JQuery = js.native
  
  def _afterUpdate(event: JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  
  def _apply(elements: js.Any, options: js.Any): Unit = js.native
  
  def _beforeUpdate(event: JQueryEventObject, groups: js.Array[_]): js.Any = js.native
  
  var _groups: js.Array[_] = js.native
  
  var _maintainScroll: Boolean = js.native
  
  def _rows($item: JQuery): js.Array[_] = js.native
  
  var _throttle: Double = js.native
  
  def _update(): Unit = js.native
}
object JQueryMatchHeight {
  
  @js.native
  trait Options extends StObject {
    
    var byRow: js.UndefOr[Boolean] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var remove: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByRow(value: Boolean): Self = StObject.set(x, "byRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByRowUndefined: Self = StObject.set(x, "byRow", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
