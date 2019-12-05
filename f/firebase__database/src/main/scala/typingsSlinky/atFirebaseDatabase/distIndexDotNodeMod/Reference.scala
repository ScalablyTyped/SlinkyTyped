package typingsSlinky.atFirebaseDatabase.distIndexDotNodeMod

import typingsSlinky.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "Reference")
@js.native
class Reference protected ()
  extends typingsSlinky.atFirebaseDatabase.distSrcApiReferenceMod.Reference {
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

