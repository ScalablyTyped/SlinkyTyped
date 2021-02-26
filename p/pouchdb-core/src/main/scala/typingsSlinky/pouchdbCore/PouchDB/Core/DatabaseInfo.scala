package typingsSlinky.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseInfo extends StObject {
  
  /** Name of the database you gave when you called new PouchDB(), and also the unique identifier for the database. */
  var db_name: String = js.native
  
  /** Total number of non-deleted documents in the database. */
  var doc_count: Double = js.native
  
  /** Sequence number of the database. It starts at 0 and gets incremented every time a document is added or modified */
  var update_seq: Double | String = js.native
}
object DatabaseInfo {
  
  @scala.inline
  def apply(db_name: String, doc_count: Double, update_seq: Double | String): DatabaseInfo = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
  
  @scala.inline
  implicit class DatabaseInfoMutableBuilder[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb_name(value: String): Self = StObject.set(x, "db_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seq(value: Double | String): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
  }
}
