package typingsSlinky.backstopjs.mod

import typingsSlinky.backstopjs.backstopjsStrings.desktop
import typingsSlinky.backstopjs.backstopjsStrings.phone
import typingsSlinky.backstopjs.backstopjsStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.backstopjs.mod.ViewportNext
  - typingsSlinky.backstopjs.mod.ViewportLegacy
*/
trait Viewport extends js.Object
object Viewport {
  
  @scala.inline
  def ViewportNext(height: Double, label: String, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  def ViewportLegacy(height: Double, name: phone | tablet | desktop, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}
