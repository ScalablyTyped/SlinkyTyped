package typingsSlinky.ndnJs.mod

import typingsSlinky.ndnJs.nameMod.Name.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typingsSlinky.ndnJs.nameMod.Name {
  def this(components: js.Array[Component | js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typingsSlinky.ndnJs.nameMod.Name) = this()
}
/* static members */
object Name {
  
  @JSImport("ndn-js", "Name.Component")
  @js.native
  class Component ()
    extends typingsSlinky.ndnJs.nameMod.Name.Component {
    def this(component: typingsSlinky.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: js.typedarray.ArrayBuffer) = this()
    def this(value: js.typedarray.Uint8Array) = this()
    def this(value: typingsSlinky.ndnJs.blobMod.Blob) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.Uint8Array, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: typingsSlinky.ndnJs.blobMod.Blob, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: js.UndefOr[scala.Nothing],
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: String, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: String, `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.ArrayBuffer,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: js.typedarray.Uint8Array, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.Uint8Array,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: typingsSlinky.ndnJs.blobMod.Blob, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: typingsSlinky.ndnJs.blobMod.Blob,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  object Component {
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromImplicitSha256Digest")
    @js.native
    def fromImplicitSha256Digest(digest: typingsSlinky.ndnJs.blobMod.Blob): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnJs.nameMod.ComponentType): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromNumberWithMarker")
    @js.native
    def fromNumberWithMarker(number: Double, marker: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromParametersSha256Digest")
    @js.native
    def fromParametersSha256Digest(digest: typingsSlinky.ndnJs.blobMod.Blob): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSegment")
    @js.native
    def fromSegment(segment: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSegmentOffset")
    @js.native
    def fromSegmentOffset(segmentOffset: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSequenceNumber")
    @js.native
    def fromSequenceNumber(sequenceNumber: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromTimestamp")
    @js.native
    def fromTimestamp(timestamp: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromVersion")
    @js.native
    def fromVersion(version: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
  }
  
  @JSImport("ndn-js", "Name.fromEscapedString")
  @js.native
  def fromEscapedString(uri: String): typingsSlinky.ndnJs.nameMod.Name = js.native
}
