package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "xmlschemas")
@js.native
object xmlschemas extends js.Object {
  @js.native
  abstract class MxSchema protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.xmlschemas.MxSchema {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.xmlschemas.XmlElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.xmlschemas.XmlPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.xmlschemas.XmlSchema {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.xmlschemas.XmlSchemaEntry {
    def this(
      model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Binary: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Boolean: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Date: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var DateTime: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Decimal: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Float: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Integer: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Long: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var String: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Time: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Unknown: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchema): typingsSlinky.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
  }
  
}

