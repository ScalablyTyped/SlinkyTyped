package typingsSlinky.reactNavigationRouters.anon

import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.REPLACE
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadSource extends StackActionType {
  
  var payload: Name = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: REPLACE = js.native
}
object PayloadSource {
  
  @scala.inline
  def apply(payload: Name, `type`: REPLACE): PayloadSource = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadSource]
  }
  
  @scala.inline
  implicit class PayloadSourceMutableBuilder[Self <: PayloadSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Name): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: REPLACE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
