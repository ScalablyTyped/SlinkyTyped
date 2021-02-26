package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.stashMod.StashApplyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends typingsSlinky.nodegit.stashMod.Stash
/* static members */
object Stash {
  
  @JSImport("nodegit", "Stash.apply")
  @js.native
  def apply(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.apply")
  @js.native
  def apply(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.applyInitOptions")
  @js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Stash.drop")
  @js.native
  def drop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.foreach")
  @js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.foreach")
  @js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.pop")
  @js.native
  def pop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSImport("nodegit", "Stash.pop")
  @js.native
  def pop(repo: typingsSlinky.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Stash.save")
  @js.native
  def save(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    stasher: typingsSlinky.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
}
