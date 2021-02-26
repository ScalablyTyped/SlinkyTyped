package typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
@js.native
trait IMicroflowActionInfo extends IElement {
  
  val caption: String = js.native
  
  val category: String = js.native
  
  val containerAsJavaAction: IJavaAction = js.native
  
  val icon: IImage | Null = js.native
  
  val iconQualifiedName: String | Null = js.native
  
  @JSName("model")
  val model_IMicroflowActionInfo: IModel = js.native
}
