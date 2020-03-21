package typingsSlinky.ndnJs.mod

import typingsSlinky.ndnJs.nameMod.Name.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typingsSlinky.ndnJs.nameMod.Name {
  def this(components: js.Array[Component | scala.scalajs.js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typingsSlinky.ndnJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  @js.native
  class Component ()
    extends typingsSlinky.ndnJs.nameMod.Name.Component {
    def this(component: typingsSlinky.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typingsSlinky.ndnJs.blobMod.Blob) = this()
    def this(value: scala.scalajs.js.typedarray.ArrayBuffer) = this()
    def this(value: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(value: String, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: typingsSlinky.ndnJs.blobMod.Blob, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: scala.scalajs.js.typedarray.ArrayBuffer, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: scala.scalajs.js.typedarray.Uint8Array, `type`: typingsSlinky.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(
      value: typingsSlinky.ndnJs.blobMod.Blob,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.ArrayBuffer,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.Uint8Array,
      `type`: typingsSlinky.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  
  def fromEscapedString(uri: String): typingsSlinky.ndnJs.nameMod.Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typingsSlinky.ndnJs.blobMod.Blob): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnJs.nameMod.ComponentType): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromParametersSha256Digest(digest: typingsSlinky.ndnJs.blobMod.Blob): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromSegment(segment: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromTimestamp(timestamp: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
    def fromVersion(version: Double): typingsSlinky.ndnJs.nameMod.Name.Component = js.native
  }
  
}

