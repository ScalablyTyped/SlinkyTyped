package typingsSlinky.rsocketCore.compositeMetadataMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/CompositeMetadata", "ReservedMimeTypeEntry")
@js.native
class ReservedMimeTypeEntry protected () extends Entry {
  def this(content: Buffer, `type`: Double) = this()
  
  /**
    * {@inheritDoc} Since this entry represents a compressed id that couldn't be decoded, this is
    * always {@code null}.
    */
  @JSName("mimeType")
  val mimeType_ReservedMimeTypeEntry: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Returns the reserved, but unknown {@link WellKnownMimeType} for this entry. Range is 0-127
    * (inclusive).
    *
    * @return the reserved, but unknown {@link WellKnownMimeType} for this entry
    */
  val `type`: Double = js.native
}
