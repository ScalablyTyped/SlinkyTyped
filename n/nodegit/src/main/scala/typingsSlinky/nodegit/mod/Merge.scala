package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.mergeFileInputMod.MergeFileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Merge")
@js.native
class Merge ()
  extends typingsSlinky.nodegit.mergeMod.Merge
/* static members */
object Merge {
  
  @JSImport("nodegit", "Merge.base")
  @js.native
  def base(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    one: typingsSlinky.nodegit.oidMod.Oid,
    two: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Merge.bases")
  @js.native
  def bases(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    one: typingsSlinky.nodegit.oidMod.Oid,
    two: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.oidArrayMod.Oidarray] = js.native
  
  @JSImport("nodegit", "Merge.commits")
  @js.native
  def commits(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    theirCommit: typingsSlinky.nodegit.commitMod.Commit
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.commits")
  @js.native
  def commits(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    theirCommit: typingsSlinky.nodegit.commitMod.Commit,
    options: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  
  @JSImport("nodegit", "Merge.fileInitInput")
  @js.native
  def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
  
  @JSImport("nodegit", "Merge.initOptions")
  @js.native
  def initOptions(opts: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    theirHead: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    theirHead: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: js.UndefOr[scala.Nothing],
    checkoutOpts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    theirHead: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    theirHead: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions,
    checkoutOpts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = js.native
  
  @JSImport("nodegit", "Merge.trees")
  @js.native
  def trees(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ancestorTree: typingsSlinky.nodegit.treeMod.Tree,
    ourTree: typingsSlinky.nodegit.treeMod.Tree,
    theirTree: typingsSlinky.nodegit.treeMod.Tree
  ): js.Promise[Index] = js.native
  @JSImport("nodegit", "Merge.trees")
  @js.native
  def trees(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ancestorTree: typingsSlinky.nodegit.treeMod.Tree,
    ourTree: typingsSlinky.nodegit.treeMod.Tree,
    theirTree: typingsSlinky.nodegit.treeMod.Tree,
    opts: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
}
