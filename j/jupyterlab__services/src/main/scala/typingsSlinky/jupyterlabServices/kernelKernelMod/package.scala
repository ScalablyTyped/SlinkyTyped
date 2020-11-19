package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kernelKernelMod {
  
  type IControlFuture[REQUEST /* <: typingsSlinky.jupyterlabServices.messagesMod.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.ControlMessageType] */, REPLY /* <: typingsSlinky.jupyterlabServices.messagesMod.IControlMessage[typingsSlinky.jupyterlabServices.messagesMod.ControlMessageType] */] = typingsSlinky.jupyterlabServices.kernelKernelMod.IFuture[REQUEST, REPLY]
  
  type IKernelConnection = typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection_
  
  type IShellFuture[REQUEST /* <: typingsSlinky.jupyterlabServices.messagesMod.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType] */, REPLY /* <: typingsSlinky.jupyterlabServices.messagesMod.IShellMessage[typingsSlinky.jupyterlabServices.messagesMod.ShellMessageType] */] = typingsSlinky.jupyterlabServices.kernelKernelMod.IFuture[REQUEST, REPLY]
}
