package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.stashMod.StashApplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends typingsSlinky.nodegit.stashMod.Stash

/* static members */
@JSImport("nodegit", "Stash")
@js.native
object Stash extends js.Object {
  @JSName("apply")
  def apply(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSName("apply")
  def apply(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  def drop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def pop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def pop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def save(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    stasher: typingsSlinky.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
}

