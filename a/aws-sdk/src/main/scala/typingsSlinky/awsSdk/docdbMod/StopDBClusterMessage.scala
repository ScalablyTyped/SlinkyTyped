package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDBClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to stop. Example: docdb-2019-05-28-15-24-52 
    */
  var DBClusterIdentifier: String = js.native
}
object StopDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBClusterMessage]
  }
  
  @scala.inline
  implicit class StopDBClusterMessageMutableBuilder[Self <: StopDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
