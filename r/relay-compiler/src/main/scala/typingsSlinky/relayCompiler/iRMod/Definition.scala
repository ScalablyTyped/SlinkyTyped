package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
*/
trait Definition extends js.Object

object Definition {
  @scala.inline
  implicit def apply(value: Fragment): Definition = value.asInstanceOf[Definition]
  @scala.inline
  implicit def apply(value: Root): Definition = value.asInstanceOf[Definition]
  @scala.inline
  implicit def apply(value: SplitOperation): Definition = value.asInstanceOf[Definition]
}

