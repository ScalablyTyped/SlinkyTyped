package typingsSlinky.bootstrapDashMaxlength

import typingsSlinky.bootstrapDashMaxlength.BootstrapMaxlength.Options
import typingsSlinky.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOThidden
import typingsSlinky.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOTreposition
import typingsSlinky.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOTshown
import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: Options): JQuery = js.native
  @JSName("on")
  def on_maxlengthhidden(
    events: maxlengthDOThidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDOTshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition, extraParameters: js.Array[_]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition, extraParameters: js.Object): JQuery = js.native
}

