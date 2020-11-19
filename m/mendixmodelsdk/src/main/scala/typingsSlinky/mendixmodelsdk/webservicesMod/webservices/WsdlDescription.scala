package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
@js.native
class WsdlDescription protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsImportedWebService: ImportedWebService = js.native
  
  def containerAsMsd: Msd = js.native
  
  def importsHaveLocations: Boolean = js.native
  def importsHaveLocations_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FWsdlDescription: IModel = js.native
  
  def schemaEntries: IList[XmlSchemaEntry] = js.native
  
  def services: IList[ServiceInfo] = js.native
  
  def targetNamespace: String = js.native
  def targetNamespace_=(newValue: String): Unit = js.native
  
  def wsdlEntries: IList[WsdlEntry] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
@js.native
object WsdlDescription extends js.Object {
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  def createInImportedWebServiceUnderWsdlDescription(container: ImportedWebService): WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    */
  def createInMsdUnderWsdlDescription(container: Msd): WsdlDescription = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
