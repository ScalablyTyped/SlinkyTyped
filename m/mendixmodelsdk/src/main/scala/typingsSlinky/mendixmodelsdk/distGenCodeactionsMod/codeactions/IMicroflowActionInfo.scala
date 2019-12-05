package typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenImagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

