package typingsSlinky.googleGax

import typingsSlinky.googleGax.apitypesMod.GaxCall
import typingsSlinky.googleGax.descriptorMod.Descriptor
import typingsSlinky.googleGax.gaxMod.CallSettings
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/paginationCalls/pageDescriptor", JSImport.Namespace)
@js.native
object pageDescriptorMod extends js.Object {
  @js.native
  class PageDescriptor protected () extends Descriptor {
    def this(requestPageTokenField: String, responsePageTokenField: String, resourceField: String) = this()
    var requestPageSizeField: js.UndefOr[String] = js.native
    var requestPageTokenField: String = js.native
    var resourceField: String = js.native
    var responsePageTokenField: String = js.native
    /**
      * Creates a new object Stream which emits the resource on 'data' event.
      */
    def createStream(apiCall: GaxCall, request: js.Object, options: CallSettings): Transform = js.native
  }
  
}

