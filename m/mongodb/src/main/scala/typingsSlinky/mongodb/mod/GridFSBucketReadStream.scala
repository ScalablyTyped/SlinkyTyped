package typingsSlinky.mongodb.mod

import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "GridFSBucketReadStream")
@js.native
class GridFSBucketReadStream protected () extends Readable {
  def this(chunks: Collection[_], files: Collection[_], readPreference: js.Object, filter: js.Object) = this()
  def this(
    chunks: Collection[_],
    files: Collection[_],
    readPreference: js.Object,
    filter: js.Object,
    options: GridFSBucketReadStreamOptions
  ) = this()
  
  var id: typingsSlinky.bson.mod.ObjectId = js.native
}
