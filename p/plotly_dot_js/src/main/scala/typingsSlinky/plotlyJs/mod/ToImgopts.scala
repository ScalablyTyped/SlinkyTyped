package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.jpeg
import typingsSlinky.plotlyJs.plotlyJsStrings.png
import typingsSlinky.plotlyJs.plotlyJsStrings.svg
import typingsSlinky.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToImgopts extends js.Object {
  var format: jpeg | png | webp | svg
  var height: Double
  var width: Double
}

object ToImgopts {
  @scala.inline
  def apply(format: jpeg | png | webp | svg, height: Double, width: Double): ToImgopts = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToImgopts]
  }
}

