package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageForSpecialization")
@js.native
class PageForSpecialization protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsGridEditButton: GridEditButton = js.native
  
  def containerAsPageClientAction: PageClientAction = js.native
  
  def entity: IEntity = js.native
  
  def entityQualifiedName: String = js.native
  
  def entity_=(newValue: IEntity): Unit = js.native
  
  @JSName("model")
  var model_FPageForSpecialization: IModel = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageForSpecialization")
@js.native
object PageForSpecialization extends js.Object {
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PageForSpecialization = js.native
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPagesForSpecializations(container: GridEditButton): PageForSpecialization = js.native
  
  /**
    * Creates and returns a new PageForSpecialization instance in the SDK and on the server.
    * The new PageForSpecialization will be automatically stored in the 'pagesForSpecializations' property
    * of the parent PageClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPageClientActionUnderPagesForSpecializations(container: PageClientAction): PageForSpecialization = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
