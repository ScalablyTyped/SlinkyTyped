package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewSearch")
@js.native
class ListViewSearch protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsListViewDatabaseSource: ListViewDatabaseSource = js.native
  
  def containerAsListViewXPathSource: ListViewXPathSource = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def searchPaths: IList[String] = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def searchRefs: IList[AttributeRef] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewSearch")
@js.native
object ListViewSearch extends js.Object {
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ListViewSearch = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewDatabaseSource element passed as argument.
    */
  def createInListViewDatabaseSourceUnderSearch(container: ListViewDatabaseSource): ListViewSearch = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewXPathSource element passed as argument.
    */
  def createInListViewXPathSourceUnderSearch(container: ListViewXPathSource): ListViewSearch = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
