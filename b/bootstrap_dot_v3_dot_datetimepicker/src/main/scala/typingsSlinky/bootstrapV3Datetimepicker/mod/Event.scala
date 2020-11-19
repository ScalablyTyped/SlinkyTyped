package typingsSlinky.bootstrapV3Datetimepicker.mod

import typingsSlinky.jquery.JQueryMouseEventObject
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.std.Event because Already inherited
- typingsSlinky.jquery.BaseJQueryEventObject because Already inherited
- typingsSlinky.jquery.JQueryInputEventObject because Already inherited
- typingsSlinky.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait Event extends JQueryMouseEventObject {
  
  /** @deprecated */
  var char: String = js.native
  
  /** @deprecated */
  var charCode: Double = js.native
  
  var date: Moment = js.native
  
  var key: String = js.native
  
  /** @deprecated */
  var keyCode: Double = js.native
}
