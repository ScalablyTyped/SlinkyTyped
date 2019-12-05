package typingsSlinky.easeljs.createjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AlphaMapFilter")
@js.native
class AlphaMapFilter protected () extends Filter {
  def this(alphaMap: HTMLCanvasElement) = this()
  def this(alphaMap: HTMLImageElement) = this()
  // properties
  var alphaMap: HTMLImageElement | HTMLCanvasElement = js.native
}

