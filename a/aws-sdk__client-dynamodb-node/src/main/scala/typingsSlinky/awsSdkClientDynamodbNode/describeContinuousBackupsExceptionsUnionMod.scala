package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeContinuousBackupsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
    - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait DescribeContinuousBackupsExceptionsUnion extends StObject
  object DescribeContinuousBackupsExceptionsUnion {
    
    @scala.inline
    def InternalServerError(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def TableNotFoundException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
