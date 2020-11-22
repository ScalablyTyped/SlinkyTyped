package typingsSlinky.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object frontendMod {
  
  type JupyterFrontEnd[T /* <: typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell */] = typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd_[T]
  
  type JupyterFrontEndPlugin[T] = typingsSlinky.luminoApplication.mod.IPlugin[
    typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell], 
    T
  ]
}
