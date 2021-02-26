package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebACLMigrationStackResponse extends StObject {
  
  /**
    * The URL of the template created in Amazon S3. 
    */
  var S3ObjectUrl: typingsSlinky.awsSdk.wafMod.S3ObjectUrl = js.native
}
object CreateWebACLMigrationStackResponse {
  
  @scala.inline
  def apply(S3ObjectUrl: S3ObjectUrl): CreateWebACLMigrationStackResponse = {
    val __obj = js.Dynamic.literal(S3ObjectUrl = S3ObjectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLMigrationStackResponse]
  }
  
  @scala.inline
  implicit class CreateWebACLMigrationStackResponseMutableBuilder[Self <: CreateWebACLMigrationStackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3ObjectUrl(value: S3ObjectUrl): Self = StObject.set(x, "S3ObjectUrl", value.asInstanceOf[js.Any])
  }
}
