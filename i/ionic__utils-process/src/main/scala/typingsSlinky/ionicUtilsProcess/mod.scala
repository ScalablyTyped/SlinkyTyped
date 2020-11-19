package typingsSlinky.ionicUtilsProcess

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ionicUtilsProcess.anon.Interval
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-process", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ERROR_TIMEOUT_REACHED: js.Error = js.native
  
  def createProcessEnv(sources: StringDictionary[js.UndefOr[String]]*): ProcessEnv = js.native
  
  def getPathParts(): js.Array[String] = js.native
  def getPathParts(envpath: String): js.Array[String] = js.native
  
  def killProcessTree(pid: Double): js.Promise[Unit] = js.native
  def killProcessTree(pid: Double, signal: String): js.Promise[Unit] = js.native
  def killProcessTree(pid: Double, signal: Double): js.Promise[Unit] = js.native
  
  def offBeforeExit(fn: ExitFn): Unit = js.native
  
  def onBeforeExit(fn: ExitFn): Unit = js.native
  
  def onExit(fn: js.Function0[Unit]): Unit = js.native
  
  def processExit(): js.Promise[Unit] = js.native
  def processExit(exitCode: Double): js.Promise[Unit] = js.native
  
  def sleep(ms: Double): js.Promise[Unit] = js.native
  
  def sleepForever(): js.Promise[scala.Nothing] = js.native
  
  def sleepUntil(predicate: js.Function0[Boolean], hasIntervalTimeout: Interval): js.Promise[Unit] = js.native
  
  type ExitFn = js.Function0[js.Promise[Unit]]
}
