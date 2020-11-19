package typingsSlinky.nodegit.diffMod.Diff

import typingsSlinky.nodegit.blobMod.Blob
import typingsSlinky.nodegit.diffOptionsMod.DiffOptions
import typingsSlinky.nodegit.indexMod.Index
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/diff", "Diff")
@js.native
object ^ extends js.Object {
  
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: js.UndefOr[Blob],
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
  
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  
  def indexToWorkdir(repo: Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository, index: js.UndefOr[scala.Nothing], opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  
  def treeToIndex(repo: Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: Repository,
    oldTree: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: js.UndefOr[scala.Nothing], index: Index): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: js.UndefOr[scala.Nothing], index: Index, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: js.UndefOr[scala.Nothing], opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  
  def treeToTree(repo: Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: Repository,
    oldTree: js.UndefOr[scala.Nothing],
    new_tree: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: js.UndefOr[scala.Nothing], new_tree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: js.UndefOr[scala.Nothing], new_tree: Tree, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: js.UndefOr[scala.Nothing], opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  
  def treeToWorkdir(repo: Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: js.UndefOr[scala.Nothing], opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  
  def treeToWorkdirWithIndex(repo: Repository): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: js.UndefOr[scala.Nothing], opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[typingsSlinky.nodegit.diffMod.Diff] = js.native
}
