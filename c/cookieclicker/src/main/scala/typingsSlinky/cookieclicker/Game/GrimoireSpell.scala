package typingsSlinky.cookieclicker.Game

import typingsSlinky.cookieclicker.cookieclickerNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrimoireSpell extends StObject {
  
  /**
    * The minimum cost of the spell, in mana
    */
  var costMin: Double = js.native
  
  /**
    * The cost of the spell, in raw multiplier of max mana
    */
  var costPercent: js.UndefOr[Double] = js.native
  
  /**
    * The description of the positive effect of the spell, in HTML text
    */
  var desc: String = js.native
  
  /**
    * Called when the spell fails
    */
  var fail: js.UndefOr[js.Function0[`-1` | Unit]] = js.native
  
  /**
    * The description of the negative effect of the spell, in HTML text
    */
  var failDesc: js.UndefOr[String] = js.native
  
  var icon: Icon = js.native
  
  var id: Double = js.native
  
  /**
    * The displayed name for the spell
    */
  var name: String = js.native
  
  /**
    * Called when the spell succeeds, always called if no fail function
    */
  def win(): `-1` | Unit = js.native
}
object GrimoireSpell {
  
  @scala.inline
  def apply(costMin: Double, desc: String, icon: Icon, id: Double, name: String, win: () => `-1` | Unit): GrimoireSpell = {
    val __obj = js.Dynamic.literal(costMin = costMin.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], win = js.Any.fromFunction0(win))
    __obj.asInstanceOf[GrimoireSpell]
  }
  
  @scala.inline
  implicit class GrimoireSpellMutableBuilder[Self <: GrimoireSpell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostMin(value: Double): Self = StObject.set(x, "costMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostPercent(value: Double): Self = StObject.set(x, "costPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostPercentUndefined: Self = StObject.set(x, "costPercent", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: () => `-1` | Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailDesc(value: String): Self = StObject.set(x, "failDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailDescUndefined: Self = StObject.set(x, "failDesc", js.undefined)
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin(value: () => `-1` | Unit): Self = StObject.set(x, "win", js.Any.fromFunction0(value))
  }
}
