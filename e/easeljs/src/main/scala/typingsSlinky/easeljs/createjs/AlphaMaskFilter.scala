package typingsSlinky.easeljs.createjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AlphaMaskFilter")
@js.native
class AlphaMaskFilter protected () extends Filter {
  def this(mask: HTMLCanvasElement) = this()
  def this(mask: HTMLImageElement) = this()
  // properties
  var mask: HTMLImageElement | HTMLCanvasElement = js.native
}

