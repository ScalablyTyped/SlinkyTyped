package typingsSlinky.keyvRedis.mod

import typingsSlinky.keyv.mod.Store
import typingsSlinky.keyvRedis.keyvRedisBooleans.`true`
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyvRedis
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  
  var namespace: js.UndefOr[String] = js.native
  
  def set(key: String): js.Promise[Double] = js.native
  def set(key: String, value: String): js.Promise[Double] = js.native
  def set(key: String, value: String, ttl: Double): js.Promise[Double] = js.native
  
  val ttlSupport: `true` = js.native
}
