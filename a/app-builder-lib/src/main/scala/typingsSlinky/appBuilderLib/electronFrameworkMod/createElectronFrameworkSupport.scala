package typingsSlinky.appBuilderLib.electronFrameworkMod

import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.appBuilderLib.frameworkMod.Framework
import typingsSlinky.appBuilderLib.mod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/electron/ElectronFramework", "createElectronFrameworkSupport")
@js.native
object createElectronFrameworkSupport extends js.Object {
  def apply(configuration: Configuration, packager: Packager): js.Promise[Framework] = js.native
}

