package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
@js.native
class WsdlDescription protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsImportedWebService: ImportedWebService = js.native
  
  def containerAsMsd: Msd = js.native
  
  def importsHaveLocations: Boolean = js.native
  def importsHaveLocations_=(newValue: Boolean): Unit = js.native
  
  def schemaEntries: IList[XmlSchemaEntry] = js.native
  
  def services: IList[ServiceInfo] = js.native
  
  def targetNamespace: String = js.native
  def targetNamespace_=(newValue: String): Unit = js.native
  
  def wsdlEntries: IList[WsdlEntry] = js.native
}
object WsdlDescription {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription.create")
  @js.native
  def create(model: IModel): WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription.createInImportedWebServiceUnderWsdlDescription")
  @js.native
  def createInImportedWebServiceUnderWsdlDescription(container: ImportedWebService): WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription.createInMsdUnderWsdlDescription")
  @js.native
  def createInMsdUnderWsdlDescription(container: Msd): WsdlDescription = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
