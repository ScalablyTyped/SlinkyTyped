package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typingsSlinky.nodegit.checkoutMod.Checkout
/* static members */
object Checkout {
  
  /**
    * Patch head checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.head")
  @js.native
  def head(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.head")
  @js.native
  def head(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  /**
    * Patch index checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.index")
  @js.native
  def index(repo: typingsSlinky.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.index")
  @js.native
  def index(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    The: Index,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("nodegit", "Checkout.initOptions")
  @js.native
  def initOptions(opts: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.commitMod.Commit
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.commitMod.Commit,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typingsSlinky.nodegit.repositoryMod.Repository, treeish: typingsSlinky.nodegit.oidMod.Oid): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.oidMod.Oid,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.referenceMod.Reference,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typingsSlinky.nodegit.repositoryMod.Repository, treeish: typingsSlinky.nodegit.treeMod.Tree): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    treeish: typingsSlinky.nodegit.treeMod.Tree,
    options: typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}
