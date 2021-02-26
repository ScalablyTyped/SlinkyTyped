package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partition extends StObject {
  
  /** This token can be passed to Read, StreamingRead, ExecuteSql, or ExecuteStreamingSql requests to restrict the results to those identified by this partition token. */
  var partitionToken: js.UndefOr[String] = js.native
}
object Partition {
  
  @scala.inline
  def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  
  @scala.inline
  implicit class PartitionMutableBuilder[Self <: Partition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
  }
}
