package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Credit")
@js.native
class Credit protected () extends StObject {
  def this(html: String) = this()
  def this(html: String, showOnScreen: Boolean) = this()
  
  val element: HTMLElement = js.native
  
  def equals(credits: Credit): Boolean = js.native
  
  def hasImage(): Boolean = js.native
  
  def hasLink(): Boolean = js.native
  
  val html: String = js.native
  
  val imageUrl: String = js.native
  
  val link: String = js.native
  
  val showOnScreen: Boolean = js.native
  
  val text: String = js.native
}
object Credit {
  
  /* static member */
  @JSImport("cesium", "Credit.equals")
  @js.native
  def equals_(left: Credit, right: Credit): Boolean = js.native
}
