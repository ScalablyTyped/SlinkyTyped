package typingsSlinky.expressBruteMongo.mod

import typingsSlinky.mongodb.mod.Collection
import typingsSlinky.mongodb.mod.DefaultSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary MongoDB store adapter.
  */
@JSImport("express-brute-mongo", JSImport.Namespace)
@js.native
class ^ protected () extends MongoStore {
  def this(getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[DefaultSchema], Unit], Unit]) = this()
  def this(
    getCollection: js.Function1[/* collection */ js.Function1[/* c */ Collection[DefaultSchema], Unit], Unit],
    options: js.Object
  ) = this()
}
