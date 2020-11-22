package typingsSlinky.opentelemetryCore

import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.perfHooksMod.Performance_
import typingsSlinky.opentelemetryCore.anon.RequiredENVIRONMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/platform/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def getEnv(): RequiredENVIRONMENT = js.native
  
  def hexToBase64(hexStr: String): String = js.native
  
  @JSName("_invokeGlobalShutdown")
  def invokeGlobalShutdown(): Unit = js.native
  
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  val otperformance: Performance_ = js.native
  
  def unrefTimer(timer: Timer): Unit = js.native
  
  @js.native
  abstract class BasePlugin[T] ()
    extends typingsSlinky.opentelemetryCore.nodeBasePluginMod.BasePlugin[T]
  
  @js.native
  class RandomIdGenerator ()
    extends typingsSlinky.opentelemetryCore.nodeRandomIdGeneratorMod.RandomIdGenerator
  
  @js.native
  object SDK_INFO extends js.Object {
    
    var LANGUAGE: String = js.native
    
    var NAME: String = js.native
    
    var RUNTIME: String = js.native
    
    var VERSION: String = js.native
  }
}
