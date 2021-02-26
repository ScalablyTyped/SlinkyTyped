package typingsSlinky.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieUpgradeParameter extends StObject {
  
  var name: String = js.native
  
  var power: Double = js.native
  
  /**
    * The name of cookie required to unlock the cookie
    */
  var require: js.UndefOr[String] = js.native
  
  /**
    * The season required to unlock the cookie
    */
  var season: js.UndefOr[String] = js.native
}
object CookieUpgradeParameter {
  
  @scala.inline
  def apply(name: String, power: Double): CookieUpgradeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieUpgradeParameter]
  }
  
  @scala.inline
  implicit class CookieUpgradeParameterMutableBuilder[Self <: CookieUpgradeParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
  }
}
