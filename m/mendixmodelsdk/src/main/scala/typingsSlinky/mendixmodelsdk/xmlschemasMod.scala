package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlschemasMod {
  
  @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object xmlschemas {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.MxSchema")
    @js.native
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
    }
    object MxSchema {
      
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.MxSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.MxSchema.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.MxSchema.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 6.6.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement")
    @js.native
    class XmlElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object XmlElement {
      
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement.create")
      @js.native
      def create(model: IModel): XmlElement = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement.createInElementUnderChildren")
      @js.native
      def createInElementUnderChildren(container: Element): XmlElement = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement.createInJsonStructureUnderElements")
      @js.native
      def createInJsonStructureUnderElements(container: JsonStructure): XmlElement = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType")
    @js.native
    class XmlPrimitiveType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object XmlPrimitiveType {
      
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.AnyType")
      @js.native
      def AnyType: XmlPrimitiveType = js.native
      @scala.inline
      def AnyType_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyType")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Binary")
      @js.native
      def Binary: XmlPrimitiveType = js.native
      @scala.inline
      def Binary_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Boolean")
      @js.native
      def Boolean: XmlPrimitiveType = js.native
      @scala.inline
      def Boolean_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Date")
      @js.native
      def Date: XmlPrimitiveType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.DateTime")
      @js.native
      def DateTime: XmlPrimitiveType = js.native
      @scala.inline
      def DateTime_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Date_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Decimal")
      @js.native
      def Decimal: XmlPrimitiveType = js.native
      @scala.inline
      def Decimal_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Float")
      @js.native
      def Float: XmlPrimitiveType = js.native
      @scala.inline
      def Float_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Integer")
      @js.native
      def Integer: XmlPrimitiveType = js.native
      @scala.inline
      def Integer_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Long")
      @js.native
      def Long: XmlPrimitiveType = js.native
      @scala.inline
      def Long_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.String")
      @js.native
      def String: XmlPrimitiveType = js.native
      @scala.inline
      def String_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Time")
      @js.native
      def Time: XmlPrimitiveType = js.native
      @scala.inline
      def Time_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Unknown")
      @js.native
      def Unknown: XmlPrimitiveType = js.native
      @scala.inline
      def Unknown_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
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
    - typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchema")
    @js.native
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
    }
    object XmlSchema {
      
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new XmlSchema unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchema.createIn")
      @js.native
      def createIn(container: IFolderBase): XmlSchema = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchema.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchema.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry")
    @js.native
    class XmlSchemaEntry protected ()
      extends typingsSlinky.mendixmodelsdk.internalMod.Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
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
      
      def targetNamespace: String = js.native
      def targetNamespace_=(newValue: String): Unit = js.native
    }
    object XmlSchemaEntry {
      
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.create")
      @js.native
      def create(model: IModel): XmlSchemaEntry = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
        * of the parent webservices.WsdlDescription element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.createInWsdlDescriptionUnderSchemaEntries")
      @js.native
      def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): XmlSchemaEntry = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'entries' property
        * of the parent XmlSchema element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.createInXmlSchemaUnderEntries")
      @js.native
      def createInXmlSchemaUnderEntries(container: XmlSchema): XmlSchemaEntry = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `XmlSchemas`.
      */
    @js.native
    trait IMxSchema extends IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
      */
    @js.native
    trait IXmlSchema extends IMxSchema
  }
}
