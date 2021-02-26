package typingsSlinky.raty

import typingsSlinky.raty.ratyStrings.cancel
import typingsSlinky.raty.ratyStrings.click
import typingsSlinky.raty.ratyStrings.destroy
import typingsSlinky.raty.ratyStrings.move
import typingsSlinky.raty.ratyStrings.readonly
import typingsSlinky.raty.ratyStrings.reload
import typingsSlinky.raty.ratyStrings.score
import typingsSlinky.raty.ratyStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def raty(): JQuery = js.native
  def raty(method: String, parameter: js.Any): js.Any = js.native
  def raty(options: JQueryRatyOptions): JQuery = js.native
  @JSName("raty")
  def raty_cancel(method: cancel, on: Boolean): Unit = js.native
  @JSName("raty")
  def raty_click(method: click, star: Double): Unit = js.native
  @JSName("raty")
  def raty_destroy(method: destroy): JQuery = js.native
  @JSName("raty")
  def raty_move(method: move, number: Double): Unit = js.native
  @JSName("raty")
  def raty_readonly(method: readonly, on: Boolean): Unit = js.native
  @JSName("raty")
  def raty_reload(method: reload): Unit = js.native
  @JSName("raty")
  def raty_score(method: score): Double = js.native
  @JSName("raty")
  def raty_score(method: score, score: Double): Unit = js.native
  @JSName("raty")
  def raty_set(method: set, options: JQueryRatyOptions): Unit = js.native
}
