package typingsSlinky.jestCli

import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cli/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  
  def buildArgv(): Argv = js.native
  def buildArgv(maybeArgv: js.Array[String]): Argv = js.native
  
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.UndefOr[scala.Nothing], project: Path): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: Path): js.Promise[Unit] = js.native
}
