package typingsSlinky.paper.paperCoreMod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paper/dist/paper-core", "Project")
@js.native
class Project protected ()
  extends typingsSlinky.paper.paper.Project {
  def this(element: String) = this()
  def this(element: Size) = this()
  /** 
    * Creates a Paper.js project containing one empty {@link Layer}, referenced
    * by {@link Project#activeLayer}.
    * 
    * Note that when working with PaperScript, a project is automatically
    * created for us and the {@link PaperScope#project} variable points to it.
    * 
    * @param element - the HTML canvas element
    * that should be used as the element for the view, or an ID string by which
    * to find the element, or the size of the canvas to be created for usage in
    * a web worker.
    */
  def this(element: HTMLCanvasElement) = this()
}
