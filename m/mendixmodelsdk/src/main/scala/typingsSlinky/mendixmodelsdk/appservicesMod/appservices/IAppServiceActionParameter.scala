package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppServiceActionParameter
  extends IElement
     with IByNameReferrable {
  val containerAsAppServiceAction: IAppServiceAction = js.native
  @JSName("model")
  val model_IAppServiceActionParameter: IModel = js.native
  val name: String = js.native
}

