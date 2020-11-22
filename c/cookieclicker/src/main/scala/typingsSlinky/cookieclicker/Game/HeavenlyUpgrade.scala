package typingsSlinky.cookieclicker.Game

import typingsSlinky.cookieclicker.cookieclickerStrings.prestige
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeavenlyUpgrade extends Upgrade {
  
  @JSName("pool")
  var pool_HeavenlyUpgrade: prestige = js.native
  
  var posX: Double = js.native
  
  var posY: Double = js.native
  
  /**
    * The function that determines if the heavenly upgrade should be shown
    */
  var showIf: js.UndefOr[js.Function0[Boolean]] = js.native
}
