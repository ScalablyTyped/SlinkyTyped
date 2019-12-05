package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object html2canvas {
  import org.scalajs.dom.raw.HTMLCanvasElement
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.html2canvas.Html2Canvas.Html2CanvasOptions

  type Html2CanvasStatic = js.Function2[
    /* element */ HTMLElement, 
    /* options */ js.UndefOr[Html2CanvasOptions], 
    Html2CanvasPromise[HTMLCanvasElement]
  ]
}
