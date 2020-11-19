package typingsSlinky.jupyterlabServices.sessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ISessionConnection {
  
  /**
    * An arguments object for the kernel changed signal.
    */
  type IKernelChangedArgs = typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.kernel
  ]
}
