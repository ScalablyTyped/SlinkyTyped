package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typingsSlinky.nodegit.checkoutMod.Checkout

/* static members */
@JSImport("nodegit", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  def head(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: typingsSlinky.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  def index(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    The: Index,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def initOptions(opts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.commitMod.Commit
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.commitMod.Commit,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(repo: typingsSlinky.nodegit.repositoryMod.Repository, treeish: typingsSlinky.nodegit.oidMod.Oid): js.Promise[Unit] = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.oidMod.Oid,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.referenceMod.Reference,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(repo: typingsSlinky.nodegit.repositoryMod.Repository, treeish: typingsSlinky.nodegit.treeMod.Tree): js.Promise[Unit] = js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.treeMod.Tree,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}

