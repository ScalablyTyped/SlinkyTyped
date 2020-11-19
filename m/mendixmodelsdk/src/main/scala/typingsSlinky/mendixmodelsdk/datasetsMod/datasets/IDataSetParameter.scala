package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataSetParameter
  extends IElement
     with IByNameReferrable {
  
  val containerAsDataSet: IDataSet = js.native
  
  @JSName("model")
  val model_IDataSetParameter: IModel = js.native
  
  val name: String = js.native
}
