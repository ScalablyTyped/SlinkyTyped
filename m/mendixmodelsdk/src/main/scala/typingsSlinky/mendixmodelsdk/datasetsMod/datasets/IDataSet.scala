package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataSets`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
  */
@js.native
trait IDataSet extends IDocument {
  
  val parameters: IList[IDataSetParameter] = js.native
}
