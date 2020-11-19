package typingsSlinky.keyvMysql.mod

import typingsSlinky.keyv.mod.Store
import typingsSlinky.keyvMysql.keyvMysqlBooleans.`false`
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyvMysql
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  
  var namespace: js.UndefOr[String] = js.native
  
  def set(key: String): js.Promise[_] = js.native
  def set(key: String, value: String): js.Promise[_] = js.native
  
  val ttlSupport: `false` = js.native
}
