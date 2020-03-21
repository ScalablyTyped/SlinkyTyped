package typingsSlinky.jupyterlabServices.kernelKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Kernel {
  type IControlFuture[REQUEST /* <: typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */, REPLY /* <: typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType] */] = typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
  type IShellFuture[REQUEST /* <: typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */, REPLY /* <: typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] */] = typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IFuture[REQUEST, REPLY]
}
