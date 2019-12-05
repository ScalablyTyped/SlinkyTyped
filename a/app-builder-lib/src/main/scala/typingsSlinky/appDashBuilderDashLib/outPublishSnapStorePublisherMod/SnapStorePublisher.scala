package typingsSlinky.appDashBuilderDashLib.outPublishSnapStorePublisherMod

import typingsSlinky.appDashBuilderDashLib.appDashBuilderDashLibStrings.snapStore
import typingsSlinky.electronDashPublish.electronDashPublishMod.PublishContext
import typingsSlinky.electronDashPublish.electronDashPublishMod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
@js.native
class SnapStorePublisher protected () extends Publisher {
  def this(context: PublishContext, options: SnapStoreOptions) = this()
  var options: js.Any = js.native
  @JSName("providerName")
  val providerName_SnapStorePublisher: snapStore = js.native
}

