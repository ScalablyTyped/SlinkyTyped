package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "xmlschemas")
@js.native
object xmlschemas extends js.Object {
  @js.native
  abstract class MxSchema protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.xmlschemas.MxSchema {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
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
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlElement {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchema {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchemaEntry {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Binary: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Boolean: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Date: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var DateTime: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Decimal: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Float: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Integer: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Long: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var String: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Time: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Unknown: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsSlinky.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema): typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
  }
  
}

