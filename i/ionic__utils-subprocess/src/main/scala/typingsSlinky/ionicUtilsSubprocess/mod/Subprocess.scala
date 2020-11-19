package typingsSlinky.ionicUtilsSubprocess.mod

import typingsSlinky.ionicUtilsSubprocess.anon.PromisevoidpChildProcess
import typingsSlinky.ionicUtilsSubprocess.anon.ReadonlySpawnOptions
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-subprocess", "Subprocess")
@js.native
class Subprocess protected () extends js.Object {
  def this(name: String, args: js.Array[String]) = this()
  def this(name: String, args: js.Array[String], options: SubprocessOptions) = this()
  
  var _options: SpawnOptions = js.native
  
  var args: js.Array[String] = js.native
  
  def bashify(): String = js.native
  def bashify(hasMaskArgv0MaskArgv1ShiftArgv0: SubprocessBashifyOptions): String = js.native
  
  def bashifyArg(arg: String): String = js.native
  
  def combinedOutput(): js.Promise[String] = js.native
  
  def maskArg(arg: String): String = js.native
  
  var name: String = js.native
  
  def options: ReadonlySpawnOptions = js.native
  
  def output(): js.Promise[String] = js.native
  
  val path: js.UndefOr[String] = js.native
  
  def run(): PromisevoidpChildProcess = js.native
  
  def spawn(): ChildProcess = js.native
}
