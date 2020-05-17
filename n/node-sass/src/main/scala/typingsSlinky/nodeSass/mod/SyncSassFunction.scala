package typingsSlinky.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.mod.SyncSassFn
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn1
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn2
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn3
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn4
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn5
  - typingsSlinky.nodeSass.mod.SyncSassVarArgFn6
*/
trait SyncSassFunction extends SassFunction

object SyncSassFunction {
  @scala.inline
  implicit def apply(value: SyncSassFn | SyncSassVarArgFn1): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
  @scala.inline
  implicit def apply(value: SyncSassVarArgFn2): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
  @scala.inline
  implicit def apply(value: SyncSassVarArgFn3): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
  @scala.inline
  implicit def apply(value: SyncSassVarArgFn4): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
  @scala.inline
  implicit def apply(value: SyncSassVarArgFn5): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
  @scala.inline
  implicit def apply(value: SyncSassVarArgFn6): SyncSassFunction = value.asInstanceOf[SyncSassFunction]
}

