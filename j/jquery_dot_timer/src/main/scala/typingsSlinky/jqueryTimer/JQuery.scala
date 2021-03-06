package typingsSlinky.jqueryTimer

import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  // #region Constructors
  def timer(): js.Object = js.native
  def timer(action: js.UndefOr[scala.Nothing], time: js.UndefOr[scala.Nothing], autostart: Boolean): js.Object = js.native
  def timer(action: js.UndefOr[scala.Nothing], time: Number): js.Object = js.native
  def timer(action: js.UndefOr[scala.Nothing], time: Number, autostart: Boolean): js.Object = js.native
  def timer(action: js.Function): js.Object = js.native
  def timer(action: js.Function, time: js.UndefOr[scala.Nothing], autostart: Boolean): js.Object = js.native
  def timer(action: js.Function, time: Number): js.Object = js.native
  def timer(action: js.Function, time: Number, autostart: Boolean): js.Object = js.native
  @JSName("timer")
  var timer_Original: JQueryTimer = js.native
}
