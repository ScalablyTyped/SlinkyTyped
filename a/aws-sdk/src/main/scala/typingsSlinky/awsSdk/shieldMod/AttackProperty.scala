package typingsSlinky.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackProperty extends StObject {
  
  /**
    * The type of distributed denial of service (DDoS) event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackLayer] = js.native
  
  /**
    * Defines the DDoS attack property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback DDoS attacks.
    */
  var AttackPropertyIdentifier: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackPropertyIdentifier] = js.native
  
  /**
    * The array of contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[typingsSlinky.awsSdk.shieldMod.TopContributors] = js.native
  
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.native
  
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.shieldMod.Unit] = js.native
}
object AttackProperty {
  
  @scala.inline
  def apply(): AttackProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackProperty]
  }
  
  @scala.inline
  implicit class AttackPropertyMutableBuilder[Self <: AttackProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackLayer(value: AttackLayer): Self = StObject.set(x, "AttackLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackLayerUndefined: Self = StObject.set(x, "AttackLayer", js.undefined)
    
    @scala.inline
    def setAttackPropertyIdentifier(value: AttackPropertyIdentifier): Self = StObject.set(x, "AttackPropertyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackPropertyIdentifierUndefined: Self = StObject.set(x, "AttackPropertyIdentifier", js.undefined)
    
    @scala.inline
    def setTopContributors(value: TopContributors): Self = StObject.set(x, "TopContributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopContributorsUndefined: Self = StObject.set(x, "TopContributors", js.undefined)
    
    @scala.inline
    def setTopContributorsVarargs(value: Contributor*): Self = StObject.set(x, "TopContributors", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Long): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
