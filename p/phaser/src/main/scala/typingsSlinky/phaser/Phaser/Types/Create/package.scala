package typingsSlinky.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Create {
  import org.scalajs.dom.raw.CanvasRenderingContext2D
  import org.scalajs.dom.raw.HTMLCanvasElement

  type GenerateTextureCallback = js.Function2[/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D, Unit]
}
