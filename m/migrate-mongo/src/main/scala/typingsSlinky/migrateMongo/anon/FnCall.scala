package typingsSlinky.migrateMongo.anon

import typingsSlinky.mongodb.mod.MongoCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(): js.Promise[Unit] = js.native
  def apply(callback: MongoCallback[Unit]): Unit = js.native
  def apply(force: Boolean): js.Promise[Unit] = js.native
  def apply(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
}
