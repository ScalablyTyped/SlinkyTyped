package typingsSlinky.opentelemetryCore

import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.perfHooksMod.Performance_
import typingsSlinky.opentelemetryCore.anon.RequiredENVIRONMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@opentelemetry/core/build/src/platform", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected ()
    extends typingsSlinky.opentelemetryCore.nodeMod.BasePlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
  
  @JSImport("@opentelemetry/core/build/src/platform", "RandomIdGenerator")
  @js.native
  class RandomIdGenerator ()
    extends typingsSlinky.opentelemetryCore.nodeMod.RandomIdGenerator
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    @scala.inline
    def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    @scala.inline
    def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/core/build/src/platform", "getEnv")
  @js.native
  def getEnv(): RequiredENVIRONMENT = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "hexToBase64")
  @js.native
  def hexToBase64(hexStr: String): String = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "_invokeGlobalShutdown")
  @js.native
  def invokeGlobalShutdown(): Unit = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "notifyOnGlobalShutdown")
  @js.native
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "unrefTimer")
  @js.native
  def unrefTimer(timer: Timer): Unit = js.native
}
