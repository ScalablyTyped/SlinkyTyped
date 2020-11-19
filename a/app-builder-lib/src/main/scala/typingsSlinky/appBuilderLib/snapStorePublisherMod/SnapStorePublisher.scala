package typingsSlinky.appBuilderLib.snapStorePublisherMod

import typingsSlinky.electronPublish.mod.PublishContext
import typingsSlinky.electronPublish.mod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
@js.native
class SnapStorePublisher protected () extends Publisher {
  def this(context: PublishContext, options: SnapStoreOptions) = this()
  
  var options: js.Any = js.native
  
  @JSName("providerName")
  val providerName_FSnapStorePublisher: /* "snapStore" */ String = js.native
}
