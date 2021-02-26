package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
    - typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
  */
  trait DescribeGlobalTableExceptionsUnion extends StObject
  object DescribeGlobalTableExceptionsUnion {
    
    @scala.inline
    def GlobalTableNotFoundException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException]
    }
    
    @scala.inline
    def InternalServerError(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
  }
}
