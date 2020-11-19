package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.PasswordPolicySettings")
@js.native
class PasswordPolicySettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsProjectSecurity: ProjectSecurity = js.native
  
  def minimumLength: Double = js.native
  def minimumLength_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FPasswordPolicySettings: IModel = js.native
  
  def requireDigit: Boolean = js.native
  def requireDigit_=(newValue: Boolean): Unit = js.native
  
  def requireMixedCase: Boolean = js.native
  def requireMixedCase_=(newValue: Boolean): Unit = js.native
  
  def requireSymbol: Boolean = js.native
  def requireSymbol_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.PasswordPolicySettings")
@js.native
object PasswordPolicySettings extends js.Object {
  
  /**
    * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PasswordPolicySettings = js.native
  
  /**
    * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
    * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): PasswordPolicySettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
