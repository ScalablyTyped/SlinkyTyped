package typingsSlinky.entriaRelayExperimental.queryResourceMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResourceCacheEntry extends js.Object {
  
  val cacheKey: String = js.native
  
  def getRetainCount(): Double = js.native
  
  def getValue(): js.Error | js.Promise[Unit] | QueryResult = js.native
  
  def permanentRetain(environment: Environment): Disposable = js.native
  
  def setValue(value: js.Promise[Unit]): Unit = js.native
  def setValue(value: QueryResult): Unit = js.native
  def setValue(value: js.Error): Unit = js.native
  
  def temporaryRetain(environment: Environment): Unit = js.native
}
