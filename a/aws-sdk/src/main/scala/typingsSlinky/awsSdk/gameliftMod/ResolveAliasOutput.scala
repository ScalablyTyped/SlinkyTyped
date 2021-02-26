package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveAliasOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet resource that this alias points to. 
    */
  var FleetArn: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetArn] = js.native
  
  /**
    * The fleet identifier that the alias is pointing to.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
}
object ResolveAliasOutput {
  
  @scala.inline
  def apply(): ResolveAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveAliasOutput]
  }
  
  @scala.inline
  implicit class ResolveAliasOutputMutableBuilder[Self <: ResolveAliasOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
