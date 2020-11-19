package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ShowPageAction
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
class PageSettings protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
object PageSettings extends js.Object {
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createInAssociationWidgetUnderSelectPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.AssociationWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  def createInDataGridAddButtonUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataGridAddButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridEditButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  def createInGridNewButtonUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridNewButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInNewButtonUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NewButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  def createInPageClientActionUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.PageClientAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  def createInPageForSpecializationUnderPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.PageForSpecialization): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderGotoPageSettings(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
