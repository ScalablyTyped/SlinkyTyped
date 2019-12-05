package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.jpeg
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.png
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.svg
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadImgopts extends js.Object {
  var filename: String
  var format: jpeg | png | webp | svg
  var height: Double
  var width: Double
}

object DownloadImgopts {
  @scala.inline
  def apply(filename: String, format: jpeg | png | webp | svg, height: Double, width: Double): DownloadImgopts = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadImgopts]
  }
}

