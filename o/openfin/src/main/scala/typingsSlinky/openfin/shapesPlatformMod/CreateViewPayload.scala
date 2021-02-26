package typingsSlinky.openfin.shapesPlatformMod

import typingsSlinky.openfin.shapesIdentityMod.Identity
import typingsSlinky.openfin.viewViewMod.ViewCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateViewPayload extends StObject {
  
  var opts: ViewCreationOptions = js.native
  
  var target: Identity = js.native
}
object CreateViewPayload {
  
  @scala.inline
  def apply(opts: ViewCreationOptions, target: Identity): CreateViewPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateViewPayload]
  }
  
  @scala.inline
  implicit class CreateViewPayloadMutableBuilder[Self <: CreateViewPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpts(value: ViewCreationOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
