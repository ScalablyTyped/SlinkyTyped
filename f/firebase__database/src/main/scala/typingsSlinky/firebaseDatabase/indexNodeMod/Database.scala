package typingsSlinky.firebaseDatabase.indexNodeMod

import typingsSlinky.firebaseDatabase.anon.TIMESTAMP
import typingsSlinky.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "Database")
@js.native
class Database protected ()
  extends typingsSlinky.firebaseDatabase.databaseMod.Database {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repoInternal_
    */
  def this(repoInternal_ : Repo) = this()
}
/* static members */
@JSImport("@firebase/database/dist/index.node", "Database")
@js.native
object Database extends js.Object {
  
  val ServerValue: TIMESTAMP = js.native
}
