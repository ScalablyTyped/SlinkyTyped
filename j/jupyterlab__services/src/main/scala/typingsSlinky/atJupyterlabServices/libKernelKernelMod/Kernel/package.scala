package typingsSlinky.atJupyterlabServices.libKernelKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Kernel {
  import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ControlMessageType
  import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IControlMessage
  import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IShellMessage
  import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ShellMessageType

  type IControlFuture[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] = IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] = IFuture[REQUEST, REPLY]
}
