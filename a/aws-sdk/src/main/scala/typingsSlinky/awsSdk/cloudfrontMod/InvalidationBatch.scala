package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidationBatch extends StObject {
  
  /**
    * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must specify a new value for CallerReference and change other values in the request as applicable. One way to ensure that the value of CallerReference is unique is to use a timestamp, for example, 20120301090000. If you make a second invalidation request with the same value for CallerReference, and if the rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns information about the invalidation request that you previously created with the same CallerReference. If CallerReference is a value you already sent in a previous invalidation batch request but the content of any Path is different from the original request, CloudFront returns an InvalidationBatchAlreadyExists error.
    */
  var CallerReference: String = js.native
  
  /**
    * A complex type that contains information about the objects that you want to invalidate. For more information, see Specifying the Objects to Invalidate in the Amazon CloudFront Developer Guide. 
    */
  var Paths: typingsSlinky.awsSdk.cloudfrontMod.Paths = js.native
}
object InvalidationBatch {
  
  @scala.inline
  def apply(CallerReference: String, Paths: Paths): InvalidationBatch = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationBatch]
  }
  
  @scala.inline
  implicit class InvalidationBatchMutableBuilder[Self <: InvalidationBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: Paths): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
  }
}
