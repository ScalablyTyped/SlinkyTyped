package typingsSlinky.atFirebaseDatabase.atFirebaseDatabaseMod

import typingsSlinky.atFirebaseDatabase.Anon_TIMESTAMP
import typingsSlinky.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Database")
@js.native
class Database protected ()
  extends typingsSlinky.atFirebaseDatabase.distSrcApiDatabaseMod.Database {
  /**
    * The constructor should not be called by users of our public API.
    * @param {!Repo} repo_
    */
  def this(repo_ : Repo) = this()
}

/* static members */
@JSImport("@firebase/database", "Database")
@js.native
object Database extends js.Object {
  val ServerValue: Anon_TIMESTAMP = js.native
}

