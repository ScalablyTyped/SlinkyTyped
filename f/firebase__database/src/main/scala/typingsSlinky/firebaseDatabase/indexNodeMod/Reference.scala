package typingsSlinky.firebaseDatabase.indexNodeMod

import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "Reference")
@js.native
class Reference protected ()
  extends typingsSlinky.firebaseDatabase.referenceMod.Reference {
  /**
    * Call options:
    *   new Reference(Repo, Path) or
    *   new Reference(url: string, string|RepoManager)
    *
    * Externally - this is the firebase.database.Reference type.
    *
    * @param {!Repo} repo
    * @param {(!Path)} path
    * @extends {Query}
    */
  def this(repo: Repo, path: Path) = this()
}
