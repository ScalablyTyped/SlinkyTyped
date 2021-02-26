package typingsSlinky.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsAccessKey extends StObject {
  
  // AWS access key ID
  var aws_access_key_id: String = js.native
  
  // AWS secret access key
  var aws_secret_access_key: String = js.native
}
object AwsAccessKey {
  
  @scala.inline
  def apply(aws_access_key_id: String, aws_secret_access_key: String): AwsAccessKey = {
    val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id.asInstanceOf[js.Any], aws_secret_access_key = aws_secret_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsAccessKey]
  }
  
  @scala.inline
  implicit class AwsAccessKeyMutableBuilder[Self <: AwsAccessKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_access_key_id(value: String): Self = StObject.set(x, "aws_access_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_secret_access_key(value: String): Self = StObject.set(x, "aws_secret_access_key", value.asInstanceOf[js.Any])
  }
}
