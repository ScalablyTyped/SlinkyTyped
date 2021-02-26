package typingsSlinky.cookieclicker.Game

import typingsSlinky.cookieclicker.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cookieclicker.Game.BaselessArt
  - typingsSlinky.cookieclicker.Game.BaseArt
*/
trait Art extends StObject
object Art {
  
  @scala.inline
  def BaseArt(base: String): typingsSlinky.cookieclicker.Game.BaseArt = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cookieclicker.Game.BaseArt]
  }
  
  @scala.inline
  def BaselessArt(
    bg: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit]),
    pic: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])
  ): typingsSlinky.cookieclicker.Game.BaselessArt = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cookieclicker.Game.BaselessArt]
  }
}
