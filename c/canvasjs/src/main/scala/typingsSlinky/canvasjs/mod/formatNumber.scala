package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvasjs", "formatNumber")
@js.native
object formatNumber extends js.Object {
  
  /**
    * Formats number according to the given formatString(optional) & culture(optional).
    * @param number Number to format.
    * @param formatString Default formatString is “#,##0.##” .
    * @param culture Default culture is “en”
    */
  def apply(number: Double): String = js.native
  def apply(number: Double, formatString: js.UndefOr[scala.Nothing], culture: String): String = js.native
  def apply(number: Double, formatString: String): String = js.native
  def apply(number: Double, formatString: String, culture: String): String = js.native
}
