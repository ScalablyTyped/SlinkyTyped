package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
abstract class AccessRuleContainerBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def accessRules: IList[AccessRule] = js.native
  
  def containerAsProjectSecurity: ProjectSecurity = js.native
  
  @JSName("model")
  var model_FAccessRuleContainerBase: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
object AccessRuleContainerBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
