package typingsSlinky.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFrontendMod {
  import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
  import typingsSlinky.atPhosphorApplication.atPhosphorApplicationMod.IPlugin

  type JupyterFrontEnd[T /* <: IShell */] = JupyterFrontEnd_[T]
  type JupyterFrontEndPlugin[T] = IPlugin[JupyterFrontEnd[IShell], T]
}
