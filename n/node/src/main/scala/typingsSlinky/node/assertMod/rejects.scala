package typingsSlinky.node.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "rejects")
@js.native
object rejects extends js.Object {
  
  def apply(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: AssertPredicate): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], message: String): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], message: js.Error): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_]): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: AssertPredicate): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: AssertPredicate, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: AssertPredicate, message: js.Error): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], message: String): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], message: js.Error): js.Promise[Unit] = js.native
}
