package typingsSlinky.openfin.shapesPlatformMod

import typingsSlinky.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceLayoutPayload extends StObject {
  
  var opts: ReplaceLayoutOpts = js.native
  
  var target: Identity = js.native
}
object ReplaceLayoutPayload {
  
  @scala.inline
  def apply(opts: ReplaceLayoutOpts, target: Identity): ReplaceLayoutPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutPayload]
  }
  
  @scala.inline
  implicit class ReplaceLayoutPayloadMutableBuilder[Self <: ReplaceLayoutPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpts(value: ReplaceLayoutOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
