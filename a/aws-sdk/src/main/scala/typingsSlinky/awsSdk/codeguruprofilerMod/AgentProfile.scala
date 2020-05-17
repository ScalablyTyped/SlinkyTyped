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
trait AgentProfile extends js.Object

object AgentProfile {
  @scala.inline
  implicit def apply(value: Blob): AgentProfile = value.asInstanceOf[AgentProfile]
  @scala.inline
  implicit def apply(value: Buffer): AgentProfile = value.asInstanceOf[AgentProfile]
  @scala.inline
  implicit def apply(value: java.lang.String): AgentProfile = value.asInstanceOf[AgentProfile]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): AgentProfile = value.asInstanceOf[AgentProfile]
}

