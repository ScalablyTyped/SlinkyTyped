package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlacierJobParameters extends StObject {
  
  /**
    * Retrieval tier at which the restore will be processed.
    */
  var Tier: typingsSlinky.awsSdk.s3Mod.Tier = js.native
}
object GlacierJobParameters {
  
  @scala.inline
  def apply(Tier: Tier): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierJobParameters]
  }
  
  @scala.inline
  implicit class GlacierJobParametersMutableBuilder[Self <: GlacierJobParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
  }
}
