package typingsSlinky.nodegit.applyMod.Apply

import typingsSlinky.nodegit.applyOptionsMod.ApplyOptions
import typingsSlinky.nodegit.diffMod.Diff
import typingsSlinky.nodegit.indexMod.Index
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/apply", "Apply")
@js.native
object ^ extends js.Object {
  
  @JSName("apply")
  def apply(repo: Repository, diff: Diff, location: LOCATION, options: ApplyOptions): js.Promise[Double] = js.native
  
  def toTree(repo: Repository, preimage: Tree, diff: Diff, options: ApplyOptions): js.Promise[Index] = js.native
}
