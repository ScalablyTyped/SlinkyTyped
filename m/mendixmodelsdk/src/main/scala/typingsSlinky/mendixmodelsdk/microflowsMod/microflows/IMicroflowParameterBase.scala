package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMicroflowParameterBase
  extends IElement
     with IByNameReferrable {
  
  val containerAsMicroflow: IMicroflow = js.native
  
  val containerAsRule: IRule = js.native
  
  @JSName("model")
  val model_IMicroflowParameterBase: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  val parameterType: IDataType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  val `type`: String | Null = js.native
}
