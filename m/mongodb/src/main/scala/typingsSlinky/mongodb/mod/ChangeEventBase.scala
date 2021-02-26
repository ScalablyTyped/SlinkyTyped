package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.Uid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEventBase[TSchema /* <: StringDictionary[js.Any] */] extends StObject {
  
  var _id: ResumeToken = js.native
  
  var clusterTime: typingsSlinky.bson.mod.Timestamp = js.native
  
  var lsid: js.UndefOr[Uid] = js.native
  
  /**
    * We leave this off the base type so that we can differentiate
    * by checking its value and get intelligent types on the other fields
    */
  // operationType: ChangeEventTypes;
  var ns: Coll = js.native
  
  var txnNumber: js.UndefOr[scala.Double] = js.native
}
object ChangeEventBase {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, ns: Coll): ChangeEventBase[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventBase[TSchema]]
  }
  
  @scala.inline
  implicit class ChangeEventBaseMutableBuilder[Self <: ChangeEventBase[_], TSchema /* <: StringDictionary[js.Any] */] (val x: Self with ChangeEventBase[TSchema]) extends AnyVal {
    
    @scala.inline
    def setClusterTime(value: typingsSlinky.bson.mod.Timestamp): Self = StObject.set(x, "clusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLsid(value: Uid): Self = StObject.set(x, "lsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLsidUndefined: Self = StObject.set(x, "lsid", js.undefined)
    
    @scala.inline
    def setNs(value: Coll): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxnNumber(value: scala.Double): Self = StObject.set(x, "txnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxnNumberUndefined: Self = StObject.set(x, "txnNumber", js.undefined)
    
    @scala.inline
    def set_id(value: ResumeToken): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
