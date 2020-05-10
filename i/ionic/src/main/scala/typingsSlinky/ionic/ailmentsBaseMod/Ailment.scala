package typingsSlinky.ionic.ailmentsBaseMod

import typingsSlinky.debug.mod.Debugger
import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments/base", "Ailment")
@js.native
abstract class Ailment protected () extends IAilment {
  def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  var _debug: js.UndefOr[js.Any] = js.native
  val client: IClient = js.native
  val config: IConfig = js.native
  val log: ILogger = js.native
  val project: IProject = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def debug: Debugger = js.native
  def getLocalPackageJson(pkgName: String): js.Promise[js.UndefOr[PackageJson]] = js.native
}

