package typingsSlinky.dc.mod

import typingsSlinky.dc.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectMenu extends BaseMixin[SelectMenu] {
  
  def filterDisplayed(): js.Function2[/* a */ Key, /* index */ Double, Boolean] = js.native
  def filterDisplayed(t: js.Function2[/* a */ Key, /* index */ Double, Boolean]): SelectMenu = js.native
  @JSName("filterDisplayed")
  var filterDisplayed_Original: IGetSet[js.Function2[/* a */ Key, /* index */ Double, Boolean], SelectMenu] = js.native
  
  def multiple(): Boolean = js.native
  def multiple(t: Boolean): SelectMenu = js.native
  @JSName("multiple")
  var multiple_Original: IGetSet[Boolean, SelectMenu] = js.native
  
  def numberVisible(): Double = js.native
  def numberVisible(t: Double): SelectMenu = js.native
  @JSName("numberVisible")
  var numberVisible_Original: IGetSet[Double, SelectMenu] = js.native
  
  def order(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def order(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): SelectMenu = js.native
  @JSName("order")
  var order_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, Double], SelectMenu] = js.native
  
  def promptText(): String = js.native
  def promptText(t: String): SelectMenu = js.native
  @JSName("promptText")
  var promptText_Original: IGetSet[String, SelectMenu] = js.native
  
  def promptValue(): js.Any = js.native
  def promptValue(t: js.Any): SelectMenu = js.native
  @JSName("promptValue")
  var promptValue_Original: IGetSet[_, SelectMenu] = js.native
}
