package typingsSlinky.paper.global.paper

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A Project object in Paper.js is what usually is referred to as the
  * document: The top level object that holds all the items contained in the
  * scene graph. As the term document is already taken in the browser context,
  * it is called Project.
  * 
  * Projects allow the manipulation of the styles that are applied to all newly
  * created items, give access to the selected items, and will in future versions
  * offer ways to query for items in the scene graph defining specific
  * requirements, and means to persist and load from different formats, such as
  * SVG and PDF.
  * 
  * The currently active project can be accessed through the
  * {@link PaperScope#project} variable.
  * 
  * An array of all open projects is accessible through the
  * {@link PaperScope#projects} variable.
  */
@JSGlobal("paper.Project")
@js.native
class Project protected ()
  extends typingsSlinky.paper.paper.Project {
  def this(element: String) = this()
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
  def this(element: typingsSlinky.paper.paper.Size) = this()
}
