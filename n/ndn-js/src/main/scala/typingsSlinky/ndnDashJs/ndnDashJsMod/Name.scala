package typingsSlinky.ndnDashJs.ndnDashJsMod

import typingsSlinky.ndnDashJs.nameMod.Name.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typingsSlinky.ndnDashJs.nameMod.Name {
  def this(components: js.Array[Component | scala.scalajs.js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typingsSlinky.ndnDashJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  @js.native
  class Component ()
    extends typingsSlinky.ndnDashJs.nameMod.Name.Component {
    def this(component: typingsSlinky.ndnDashJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typingsSlinky.ndnDashJs.blobMod.Blob) = this()
    def this(value: scala.scalajs.js.typedarray.ArrayBuffer) = this()
    def this(value: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(value: String, `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: typingsSlinky.ndnDashJs.blobMod.Blob, `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType) = this()
    def this(
      value: scala.scalajs.js.typedarray.ArrayBuffer,
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.Uint8Array,
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType
    ) = this()
    def this(value: String, `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(
      value: js.Array[Double],
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: typingsSlinky.ndnDashJs.blobMod.Blob,
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.ArrayBuffer,
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(
      value: scala.scalajs.js.typedarray.Uint8Array,
      `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  
  def fromEscapedString(uri: String): typingsSlinky.ndnDashJs.nameMod.Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typingsSlinky.ndnDashJs.blobMod.Blob): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: typingsSlinky.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromParametersSha256Digest(digest: typingsSlinky.ndnDashJs.blobMod.Blob): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromSegment(segment: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromTimestamp(timestamp: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
    def fromVersion(version: Double): typingsSlinky.ndnDashJs.nameMod.Name.Component = js.native
  }
  
}

