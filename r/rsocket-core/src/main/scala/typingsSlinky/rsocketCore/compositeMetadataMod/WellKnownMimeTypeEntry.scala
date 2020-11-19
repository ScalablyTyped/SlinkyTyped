package typingsSlinky.rsocketCore.compositeMetadataMod

import typingsSlinky.node.Buffer
import typingsSlinky.rsocketCore.wellKnownMimeTypeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/CompositeMetadata", "WellKnownMimeTypeEntry")
@js.native
class WellKnownMimeTypeEntry protected () extends Entry {
  def this(content: Buffer, `type`: default) = this()
  
  @JSName("mimeType")
  val mimeType_WellKnownMimeTypeEntry: String = js.native
  
  /**
    * Returns the {@link WellKnownMimeType} for this entry.
    *
    * @return the {@link WellKnownMimeType} for this entry
    */
  val `type`: default = js.native
}
