package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.DemoUser")
@js.native
class DemoUser protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsProjectSecurity: ProjectSecurity = js.native
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  
  def password: String = js.native
  def password_=(newValue: String): Unit = js.native
  
  def userName: String = js.native
  def userName_=(newValue: String): Unit = js.native
  
  def userRoles: IList[IUserRole] = js.native
  
  def userRolesQualifiedNames: js.Array[String] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.DemoUser")
@js.native
object DemoUser extends js.Object {
  
  /**
    * Creates and returns a new DemoUser instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DemoUser = js.native
  
  /**
    * Creates and returns a new DemoUser instance in the SDK and on the server.
    * The new DemoUser will be automatically stored in the 'demoUsers' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): DemoUser = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
