package typingsSlinky.progressbarJs

import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.progressbarJs.mod.AnimationSupport
import typingsSlinky.progressbarJs.mod.PathDrawingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod {
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @JSImport("progressbar.js/shape", JSImport.Namespace)
  @js.native
  /**
    * `Line`, `Circle` or `SemiCircle` shaped progress bar. Appends SVG to container.
    * @param container - Element where SVG is added.
    * @param [opts] - Options for path drawing.
    * @see {@link https://progressbarjs.readthedocs.io/en/latest/api/shape/#new-shapecontainer-options}
    */
  class ^ () extends Shape {
    def this(container: String) = this()
    def this(container: SVGPathElement) = this()
    def this(container: String, opts: PathDrawingOptions) = this()
    def this(container: SVGPathElement, opts: PathDrawingOptions) = this()
    def this(container: Null, opts: PathDrawingOptions) = this()
  }
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @js.native
  trait Shape extends AnimationSupport {
    
    def destroy(): Unit = js.native
    
    /**
      * Reference to SVG path which presents the actual progress bar.
      */
    val path: SVGPathElement = js.native
    
    def setText(newText: String): Unit = js.native
    
    /**
      * Reference to SVG element where progress bar is drawn.
      */
    val svg: SVGElement = js.native
    
    /**
      * Reference to p element which presents the text label for progress bar.
      * Returns `null` if text is not defined.
      */
    val text: HTMLParagraphElement | Null = js.native
    
    /**
      * Reference to SVG path which presents the trail of the progress bar.
      * Returns `null` if trail is not defined.
      */
    val trail: SVGPathElement | Null = js.native
  }
}
