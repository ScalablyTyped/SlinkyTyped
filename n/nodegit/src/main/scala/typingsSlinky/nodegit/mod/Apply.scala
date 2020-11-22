package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.applyMod.Apply.LOCATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Apply")
@js.native
class Apply ()
  extends typingsSlinky.nodegit.applyMod.Apply
/* static members */
@JSImport("nodegit", "Apply")
@js.native
object Apply extends js.Object {
  
  @JSName("apply")
  def apply(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    diff: typingsSlinky.nodegit.diffMod.Diff,
    location: LOCATION,
    options: typingsSlinky.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[Double] = js.native
  
  def toTree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    preimage: typingsSlinky.nodegit.treeMod.Tree,
    diff: typingsSlinky.nodegit.diffMod.Diff,
    options: typingsSlinky.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[typingsSlinky.nodegit.indexMod.Index] = js.native
}
