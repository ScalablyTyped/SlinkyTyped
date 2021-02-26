package typingsSlinky.mendixmodelsdk.mod.webservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.WsdlDescription")
@js.native
class WsdlDescription protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.webservices.WsdlDescription {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WsdlDescription {
  
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription.createInImportedWebServiceUnderWsdlDescription")
  @js.native
  def createInImportedWebServiceUnderWsdlDescription(container: typingsSlinky.mendixmodelsdk.webservicesMod.webservices.ImportedWebService): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription.createInMsdUnderWsdlDescription")
  @js.native
  def createInMsdUnderWsdlDescription(container: Msd): typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.WsdlDescription.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
