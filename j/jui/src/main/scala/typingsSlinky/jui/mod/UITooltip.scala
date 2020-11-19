package typingsSlinky.jui.mod

import typingsSlinky.jui.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UITooltip extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Delay): this.type = js.native
  
  /**
    * Changes the content of a tooltip
    *
    */
  def update(newTitle: String): Unit = js.native
}
