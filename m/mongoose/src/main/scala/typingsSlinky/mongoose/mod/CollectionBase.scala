package typingsSlinky.mongoose.mod

import typingsSlinky.mongodb.mod.DefaultSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * section collection.js
  * http://mongoosejs.com/docs/api.html#collection-js
  */
@js.native
trait CollectionBase
  extends typingsSlinky.mongodb.mod.Collection[DefaultSchema] {
  
  /** The Connection instance */
  var conn: Connection_ = js.native
  
  /*
    * Abstract methods. Some of these are already defined on the
    * mongodb.Collection interface so they've been commented out.
    */
  def ensureIndex(args: js.Any*): js.Any = js.native
  
  //find(...args: any[]): any;
  def findAndModify(args: js.Any*): js.Any = js.native
  
  //findOne(...args: any[]): any;
  def getIndexes(args: js.Any*): js.Any = js.native
  
  /** The collection name */
  var name: String = js.native
}
