package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listRepositoriesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException
    - typingsSlinky.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
  */
  trait ListRepositoriesExceptionsUnion extends StObject
  object ListRepositoriesExceptionsUnion {
    
    @scala.inline
    def InvalidContinuationTokenException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidContinuationTokenException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    @scala.inline
    def InvalidOrderException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException]
    }
    
    @scala.inline
    def InvalidSortByException(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException
    ): typingsSlinky.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException]
    }
  }
}
