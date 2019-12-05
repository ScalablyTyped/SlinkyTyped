package typingsSlinky.mendixmodelsdk.distGenSecurityMod.security

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
  */
@js.native
trait IUserRole
  extends IElement
     with IByNameReferrable {
  val containerAsProjectSecurity: IProjectSecurity = js.native
  @JSName("model")
  val model_IUserRole: IModel = js.native
  val name: String = js.native
}

