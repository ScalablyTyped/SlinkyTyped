package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@js.native
trait IDataType extends IElement {
  
  val containerAsAppServiceAction: IAppServiceAction = js.native
  
  val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
  
  val containerAsConstant: IConstant = js.native
  
  val containerAsDataSetParameter: IDataSetParameter = js.native
  
  val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
  
  val containerAsImportMapping: IImportMapping = js.native
  
  val containerAsMicroflowBase: IMicroflowBase = js.native
  
  val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
  
  @JSName("model")
  val model_IDataType: IModel = js.native
}
