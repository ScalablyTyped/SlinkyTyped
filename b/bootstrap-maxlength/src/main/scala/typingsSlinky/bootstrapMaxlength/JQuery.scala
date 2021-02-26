package typingsSlinky.bootstrapMaxlength

import typingsSlinky.bootstrapMaxlength.BootstrapMaxlength.Options
import typingsSlinky.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDothidden
import typingsSlinky.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotreposition
import typingsSlinky.bootstrapMaxlength.bootstrapMaxlengthStrings.maxlengthDotshown
import typingsSlinky.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: Options): JQuery = js.native
  
  @JSName("on")
  def on_maxlengthhidden(
    events: maxlengthDothidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDotshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Array[_]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Object): JQuery = js.native
}
