package typingsSlinky.keyvPostgres.mod

import typingsSlinky.keyv.mod.Store
import typingsSlinky.keyvPostgres.keyvPostgresBooleans.`false`
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyvPostgres
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  
  var namespace: js.UndefOr[String] = js.native
  
  def set(key: String): js.Promise[_] = js.native
  def set(key: String, value: String): js.Promise[_] = js.native
  
  val ttlSupport: `false` = js.native
}
