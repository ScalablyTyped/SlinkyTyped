package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reset")
@js.native
class Reset ()
  extends typingsSlinky.nodegit.resetMod.Reset
/* static members */
object Reset {
  
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.commitMod.Commit,
    pathspecs: String
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.commitMod.Commit,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  /**
    * Look up a refs's commit.
    */
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.commitMod.Commit,
    pathspecs: typingsSlinky.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.tagMod.Tag,
    pathspecs: String
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.tagMod.Tag,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Reset.default")
  @js.native
  def default(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.tagMod.Tag,
    pathspecs: typingsSlinky.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = js.native
  
  /**
    * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
    * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
    * See the documentation for reset.
    */
  @JSImport("nodegit", "Reset.fromAnnotated")
  @js.native
  def fromAnnotated(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    resetType: Double,
    checkoutOpts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): Double = js.native
  
  /**
    * Look up a refs's commit.
    */
  @JSImport("nodegit", "Reset.reset")
  @js.native
  def reset(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.commitMod.Commit,
    resetType: Double,
    checkoutOpts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Reset.reset")
  @js.native
  def reset(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    target: typingsSlinky.nodegit.tagMod.Tag,
    resetType: Double,
    checkoutOpts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
}
