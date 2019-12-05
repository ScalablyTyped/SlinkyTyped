package typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `AppServices`.
  */
@js.native
trait IAppServiceAction
  extends IElement
     with IByNameReferrable {
  val containerAsConsumedAppService: IConsumedAppService = js.native
  @JSName("model")
  val model_IAppServiceAction: IModel = js.native
  val name: String = js.native
  val parameters: IList[IAppServiceActionParameter] = js.native
}

