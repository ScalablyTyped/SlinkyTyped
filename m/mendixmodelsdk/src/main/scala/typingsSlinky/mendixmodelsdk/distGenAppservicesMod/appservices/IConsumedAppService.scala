package typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices

import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
@js.native
trait IConsumedAppService extends IDocument {
  val actions: IList[IAppServiceAction] = js.native
}

