package typingsSlinky.mendixmodelsdk.mappingsMod.mappings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
  @JSName("model")
  var model_FMappingDocument: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMappingDocument: FolderBase = js.native
  def importedWebService(): js.Any = js.native
  def importedWebService(newValue: IImportedWebService): js.Any = js.native
  def importedWebServiceQualifiedName: String | Null = js.native
  @JSName("importedWebService")
  def importedWebService_Union: IImportedWebService | Null = js.native
  def jsonStructure(): js.Any = js.native
  def jsonStructure(newValue: IJsonStructure): js.Any = js.native
  def jsonStructureQualifiedName: String | Null = js.native
  /**
    * In version 6.4.0: introduced
    */
  @JSName("jsonStructure")
  def jsonStructure_Union: IJsonStructure | Null = js.native
  def messageDefinition(): js.Any = js.native
  def messageDefinition(newValue: IMessageDefinition): js.Any = js.native
  def messageDefinitionQualifiedName: String | Null = js.native
  /**
    * In version 7.6.0: introduced
    */
  @JSName("messageDefinition")
  def messageDefinition_Union: IMessageDefinition | Null = js.native
  def operationName: String = js.native
  def operationName(newValue: String): js.Any = js.native
  /**
    * In version 7.14.0: introduced
    */
  def publicName: String = js.native
  def publicName(newValue: String): js.Any = js.native
  def rootElementName: String = js.native
  def rootElementName(newValue: String): js.Any = js.native
  def rootMappingElements: IList[ObjectMappingElement] = js.native
  def serviceName: String = js.native
  def serviceName(newValue: String): js.Any = js.native
  def xmlSchema(): js.Any = js.native
  def xmlSchema(newValue: IXmlSchema): js.Any = js.native
  def xmlSchemaQualifiedName: String | Null = js.native
  @JSName("xmlSchema")
  def xmlSchema_Union: IXmlSchema | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
object MappingDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

