package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IMicroflowActionInfo extends IElement {
  
  val caption: String = js.native
  
  val category: String = js.native
  
  val containerAsCodeAction: ICodeAction = js.native
  
  val containerAsMicroflow: IMicroflow = js.native
  
  val icon: IImage | Null = js.native
  
  val iconQualifiedName: String | Null = js.native
  
  @JSName("model")
  val model_IMicroflowActionInfo: IModel = js.native
}
