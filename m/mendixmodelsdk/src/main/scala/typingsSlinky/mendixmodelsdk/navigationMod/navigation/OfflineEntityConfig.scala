package typingsSlinky.mendixmodelsdk.navigationMod.navigation

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
@js.native
class OfflineEntityConfig protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def constraint: String = js.native
  def constraint_=(newValue: String): Unit = js.native
  
  def containerAsNavigationProfileBase: NavigationProfileBase = js.native
  
  /**
    * In version 8.9.0: introduced
    */
  def downloadMode: OfflineEntitySyncDownloadMode = js.native
  def downloadMode_=(newValue: OfflineEntitySyncDownloadMode): Unit = js.native
  
  def entity: IEntity = js.native
  
  def entityQualifiedName: String = js.native
  
  def entity_=(newValue: IEntity): Unit = js.native
  
  @JSName("model")
  var model_FOfflineEntityConfig: IModel = js.native
  
  /**
    * In version 8.9.0: deleted
    */
  def shouldDownload: Boolean = js.native
  def shouldDownload_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
@js.native
object OfflineEntityConfig extends js.Object {
  
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OfflineEntityConfig = js.native
  
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
    * of the parent NavigationProfileBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: NavigationProfileBase): OfflineEntityConfig = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
