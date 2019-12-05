package typingsSlinky.nodegit.nodegitMod

import typingsSlinky.nodegit.diffDashOptionsMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Diff")
@js.native
class Diff ()
  extends typingsSlinky.nodegit.diffMod.Diff

/* static members */
@JSImport("nodegit", "Diff")
@js.native
object Diff extends js.Object {
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: js.UndefOr[typingsSlinky.nodegit.blobMod.Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[_] = js.native
  def fromBuffer(content: String, contentLen: Double): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToIndex(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldIndex: typingsSlinky.nodegit.indexUnderscoreMod.Index,
    newIndex: typingsSlinky.nodegit.indexUnderscoreMod.Index
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToIndex(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldIndex: typingsSlinky.nodegit.indexUnderscoreMod.Index,
    newIndex: typingsSlinky.nodegit.indexUnderscoreMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    index: typingsSlinky.nodegit.indexUnderscoreMod.Index
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    index: typingsSlinky.nodegit.indexUnderscoreMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldTree: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    index: typingsSlinky.nodegit.indexUnderscoreMod.Index
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    index: typingsSlinky.nodegit.indexUnderscoreMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldTree: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    new_tree: typingsSlinky.nodegit.treeMod.Tree
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    new_tree: typingsSlinky.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldTree: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldTree: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    oldTree: typingsSlinky.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
}

