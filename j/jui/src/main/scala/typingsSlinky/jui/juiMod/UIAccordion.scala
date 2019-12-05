package typingsSlinky.jui.juiMod

import typingsSlinky.jui.Anon_AutoFold
import typingsSlinky.juiDashCore.juiDashCoreMod.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIAccordion extends UIEvent {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_AutoFold): this.type = js.native
  /**
    * Gets the index of the currently enabled node
    *
    * @return Index
    */
  def activeIndex(): Double = js.native
}

