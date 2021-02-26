package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.rebaseMod.RebaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Rebase")
@js.native
class Rebase ()
  extends typingsSlinky.nodegit.rebaseMod.Rebase
/* static members */
object Rebase {
  
  @JSImport("nodegit", "Rebase.init")
  @js.native
  def init(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    branch: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Promise[typingsSlinky.nodegit.rebaseMod.Rebase] = js.native
  @JSImport("nodegit", "Rebase.init")
  @js.native
  def init(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    branch: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[typingsSlinky.nodegit.rebaseMod.Rebase] = js.native
  
  @JSImport("nodegit", "Rebase.initOptions")
  @js.native
  def initOptions(opts: RebaseOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Rebase.open")
  @js.native
  def open(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.rebaseMod.Rebase] = js.native
  @JSImport("nodegit", "Rebase.open")
  @js.native
  def open(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: RebaseOptions): js.Promise[typingsSlinky.nodegit.rebaseMod.Rebase] = js.native
}
