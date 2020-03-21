package typingsSlinky.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frontendMod {
  type JupyterFrontEnd[T /* <: typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell */] = typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd_[T]
  type JupyterFrontEndPlugin[T] = typingsSlinky.phosphorApplication.mod.IPlugin[
    typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd[typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell], 
    T
  ]
}
