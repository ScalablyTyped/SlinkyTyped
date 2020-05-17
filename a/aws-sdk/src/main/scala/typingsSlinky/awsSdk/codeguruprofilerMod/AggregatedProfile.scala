package typingsSlinky.awsSdk.codeguruprofilerMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.codeguruprofilerMod.Blob
  - java.lang.String
*/
trait AggregatedProfile extends js.Object

object AggregatedProfile {
  @scala.inline
  implicit def apply(value: Blob): AggregatedProfile = value.asInstanceOf[AggregatedProfile]
  @scala.inline
  implicit def apply(value: Buffer): AggregatedProfile = value.asInstanceOf[AggregatedProfile]
  @scala.inline
  implicit def apply(value: java.lang.String): AggregatedProfile = value.asInstanceOf[AggregatedProfile]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): AggregatedProfile = value.asInstanceOf[AggregatedProfile]
}

