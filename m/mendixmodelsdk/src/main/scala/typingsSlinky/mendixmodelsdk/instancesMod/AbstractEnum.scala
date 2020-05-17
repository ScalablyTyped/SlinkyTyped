package typingsSlinky.mendixmodelsdk.instancesMod

import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.LifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "AbstractEnum")
@js.native
abstract class AbstractEnum protected () extends js.Object {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  var qualifiedTsTypeName: String = js.native
  var versionInfo: LifeCycle = js.native
  def checkEnumVersion(metaModelVersion: Version, includeWarnings: Boolean): Unit = js.native
  def name: String = js.native
  def qualifiedTsLiteralName(): String = js.native
}

