package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Bulk
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Expedited
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Standard_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlacierJobParametersMod {
  
  @js.native
  trait GlacierJobParameters extends StObject {
    
    /**
      * <p>Glacier retrieval tier at which the restore will be processed.</p>
      */
    var Tier: Standard_ | Bulk | Expedited | String = js.native
  }
  object GlacierJobParameters {
    
    @scala.inline
    def apply(Tier: Standard_ | Bulk | Expedited | String): GlacierJobParameters = {
      val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlacierJobParameters]
    }
    
    @scala.inline
    implicit class GlacierJobParametersMutableBuilder[Self <: GlacierJobParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTier(value: Standard_ | Bulk | Expedited | String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledGlacierJobParameters = GlacierJobParameters
}
