package typingsSlinky.mongoose.mod

import typingsSlinky.mongodb.mod.MongoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "connect")
@js.native
object connect extends js.Object {
  
  def apply(uris: String): js.Promise[Mongoose] = js.native
  def apply(uris: String, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def apply(uris: String, options: ConnectionOptions): js.Promise[Mongoose] = js.native
  def apply(uris: String, options: ConnectionOptions, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
}
