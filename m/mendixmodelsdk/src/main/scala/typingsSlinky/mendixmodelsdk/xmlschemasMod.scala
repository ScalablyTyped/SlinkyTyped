package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.Element
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/xmlschemas", JSImport.Namespace)
@js.native
object xmlschemasMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object xmlschemas extends js.Object {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `XmlSchemas`.
      */
    @js.native
    trait IMxSchema extends IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
      */
    @js.native
    trait IXmlSchema extends IMxSchema
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    abstract class MxSchema protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMxSchema: FolderBase = js.native
      
      @JSName("model")
      var model_FMxSchema: IModel = js.native
    }
    /* static members */
    @js.native
    object MxSchema extends js.Object {
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /**
      * In version 6.6.0: introduced
      */
    @js.native
    class XmlElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      @JSName("model")
      var model_FXmlElement: IModel = js.native
    }
    /* static members */
    @js.native
    object XmlElement extends js.Object {
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): XmlElement = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      def createInElementUnderChildren(container: Element): XmlElement = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      def createInJsonStructureUnderElements(container: JsonStructure): XmlElement = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    @js.native
    class XmlPrimitiveType () extends AbstractEnum
    /* static members */
    @js.native
    object XmlPrimitiveType extends js.Object {
      
      var AnyType: XmlPrimitiveType = js.native
      
      var Binary: XmlPrimitiveType = js.native
      
      var Boolean: XmlPrimitiveType = js.native
      
      var Date: XmlPrimitiveType = js.native
      
      var DateTime: XmlPrimitiveType = js.native
      
      var Decimal: XmlPrimitiveType = js.native
      
      var Float: XmlPrimitiveType = js.native
      
      var Integer: XmlPrimitiveType = js.native
      
      var Long: XmlPrimitiveType = js.native
      
      var String: XmlPrimitiveType = js.native
      
      var Time: XmlPrimitiveType = js.native
      
      var Unknown: XmlPrimitiveType = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class XmlSchema protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MXmlSchema: FolderBase = js.native
      
      def entries: IList[XmlSchemaEntry] = js.native
      
      def filePath: String = js.native
      def filePath_=(newValue: String): Unit = js.native
      
      @JSName("model")
      var model_FXmlSchema: IModel = js.native
    }
    /* static members */
    @js.native
    object XmlSchema extends js.Object {
      
      /**
        * Creates a new XmlSchema unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): XmlSchema = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
    
    @js.native
    class XmlSchemaEntry protected ()
      extends typingsSlinky.mendixmodelsdk.internalMod.Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      
      def containerAsWsdlDescription: WsdlDescription = js.native
      
      def containerAsXmlSchema: XmlSchema = js.native
      
      def contents: String = js.native
      def contents_=(newValue: String): Unit = js.native
      
      def localizedContentsFormat: String = js.native
      def localizedContentsFormat_=(newValue: String): Unit = js.native
      
      def localizedLocationFormat: String = js.native
      def localizedLocationFormat_=(newValue: String): Unit = js.native
      
      def location: String = js.native
      def location_=(newValue: String): Unit = js.native
      
      @JSName("model")
      var model_FXmlSchemaEntry: IModel = js.native
      
      def targetNamespace: String = js.native
      def targetNamespace_=(newValue: String): Unit = js.native
    }
    /* static members */
    @js.native
    object XmlSchemaEntry extends js.Object {
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): XmlSchemaEntry = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
        * of the parent webservices.WsdlDescription element passed as argument.
        */
      def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): XmlSchemaEntry = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'entries' property
        * of the parent XmlSchema element passed as argument.
        */
      def createInXmlSchemaUnderEntries(container: XmlSchema): XmlSchemaEntry = js.native
      
      var structureTypeName: String = js.native
      
      var versionInfo: StructureVersionInfo = js.native
    }
  }
}
