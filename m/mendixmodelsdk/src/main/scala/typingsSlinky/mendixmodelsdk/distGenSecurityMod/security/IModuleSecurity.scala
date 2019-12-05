package typingsSlinky.mendixmodelsdk.distGenSecurityMod.security

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
@js.native
trait IModuleSecurity extends IModelUnit {
  val containerAsModule: IModule = js.native
  @JSName("model")
  val model_IModuleSecurity: IModel = js.native
  val moduleRoles: IList[IModuleRole] = js.native
}

