package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
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
  * See: {@link https://docs.mendix.com/refguide7/user-roles relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.securityMod.security.IUserRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProjectSecurity, name */ @JSImport("mendixmodelsdk/dist/gen/security", "security.UserRole")
@js.native
class UserRole protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def checkSecurity: Boolean = js.native
  def checkSecurity_=(newValue: Boolean): Unit = js.native
  
  def containerAsProjectSecurity: ProjectSecurity = js.native
  @JSName("containerAsProjectSecurity")
  val containerAsProjectSecurity_FUserRole: IProjectSecurity = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  
  def manageAllRoles: Boolean = js.native
  def manageAllRoles_=(newValue: Boolean): Unit = js.native
  
  def manageUsersWithoutRoles: Boolean = js.native
  def manageUsersWithoutRoles_=(newValue: Boolean): Unit = js.native
  
  def manageableRoles: IList[IUserRole] = js.native
  
  def manageableRolesQualifiedNames: js.Array[String] = js.native
  
  @JSName("model")
  var model_FUserRole: IModel = js.native
  
  def moduleRoles: IList[IModuleRole] = js.native
  
  def moduleRolesQualifiedNames: js.Array[String] = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FUserRole: String = js.native
  
  @JSName("qualifiedName")
  def qualifiedName_MUserRole: String | Null = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.UserRole")
@js.native
object UserRole extends js.Object {
  
  /**
    * Creates and returns a new UserRole instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): UserRole = js.native
  
  /**
    * Creates and returns a new UserRole instance in the SDK and on the server.
    * The new UserRole will be automatically stored in the 'userRoles' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): UserRole = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
