package typingsSlinky.mendixmodelsdk.mappingsMod.mappings

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure
import typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import typingsSlinky.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
abstract class MappingDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMappingDocument: FolderBase = js.native
  
  def importedWebService: IImportedWebService | Null = js.native
  
  def importedWebServiceQualifiedName: String | Null = js.native
  
  def importedWebService_=(newValue: IImportedWebService | Null): Unit = js.native
  
  /**
    * In version 6.4.0: introduced
    */
  def jsonStructure: IJsonStructure | Null = js.native
  
  def jsonStructureQualifiedName: String | Null = js.native
  
  def jsonStructure_=(newValue: IJsonStructure | Null): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def messageDefinition: IMessageDefinition | Null = js.native
  
  def messageDefinitionQualifiedName: String | Null = js.native
  
  def messageDefinition_=(newValue: IMessageDefinition | Null): Unit = js.native
  
  def operationName: String = js.native
  def operationName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.14.0: introduced
    */
  def publicName: String = js.native
  def publicName_=(newValue: String): Unit = js.native
  
  def rootElementName: String = js.native
  def rootElementName_=(newValue: String): Unit = js.native
  
  def rootMappingElements: IList[ObjectMappingElement] = js.native
  
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  
  def xmlSchema: IXmlSchema | Null = js.native
  
  def xmlSchemaQualifiedName: String | Null = js.native
  
  def xmlSchema_=(newValue: IXmlSchema | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
object MappingDocument extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
