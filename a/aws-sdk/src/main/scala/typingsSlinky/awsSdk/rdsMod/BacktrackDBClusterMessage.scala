package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacktrackDBClusterMessage extends StObject {
  
  /**
    * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information about ISO 8601, see the ISO8601 Wikipedia page.   If the specified time isn't a consistent time for the DB cluster, Aurora automatically chooses the nearest possible consistent time for the DB cluster.  Constraints:   Must contain a valid ISO 8601 timestamp.   Can't contain a timestamp set in the future.   Example: 2017-07-08T18:00Z 
    */
  var BacktrackTo: js.Date = js.native
  
  /**
    * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * A value that indicates whether to force the DB cluster to backtrack when binary logging is enabled. Otherwise, an error occurs when binary logging is enabled.
    */
  var Force: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A value that indicates whether to backtrack the DB cluster to the earliest possible backtrack time when BacktrackTo is set to a timestamp earlier than the earliest backtrack time. When this parameter is disabled and BacktrackTo is set to a timestamp earlier than the earliest backtrack time, an error occurs.
    */
  var UseEarliestTimeOnPointInTimeUnavailable: js.UndefOr[BooleanOptional] = js.native
}
object BacktrackDBClusterMessage {
  
  @scala.inline
  def apply(BacktrackTo: js.Date, DBClusterIdentifier: String): BacktrackDBClusterMessage = {
    val __obj = js.Dynamic.literal(BacktrackTo = BacktrackTo.asInstanceOf[js.Any], DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacktrackDBClusterMessage]
  }
  
  @scala.inline
  implicit class BacktrackDBClusterMessageMutableBuilder[Self <: BacktrackDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacktrackTo(value: js.Date): Self = StObject.set(x, "BacktrackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: BooleanOptional): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setUseEarliestTimeOnPointInTimeUnavailable(value: BooleanOptional): Self = StObject.set(x, "UseEarliestTimeOnPointInTimeUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEarliestTimeOnPointInTimeUnavailableUndefined: Self = StObject.set(x, "UseEarliestTimeOnPointInTimeUnavailable", js.undefined)
  }
}
