package typingsSlinky.jestRuntime

import typingsSlinky.jestTypes.configMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runtime/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  
  def run(): js.Promise[Unit] = js.native
  def run(cliArgv: js.UndefOr[scala.Nothing], cliInfo: js.Array[String]): js.Promise[Unit] = js.native
  def run(cliArgv: Argv): js.Promise[Unit] = js.native
  def run(cliArgv: Argv, cliInfo: js.Array[String]): js.Promise[Unit] = js.native
}
