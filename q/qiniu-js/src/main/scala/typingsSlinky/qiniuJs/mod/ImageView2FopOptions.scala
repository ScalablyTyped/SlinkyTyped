package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.qiniuJsNumbers.`0`
import typingsSlinky.qiniuJs.qiniuJsNumbers.`1`
import typingsSlinky.qiniuJs.qiniuJsNumbers.`2`
import typingsSlinky.qiniuJs.qiniuJsNumbers.`3`
import typingsSlinky.qiniuJs.qiniuJsNumbers.`4`
import typingsSlinky.qiniuJs.qiniuJsNumbers.`5`
import typingsSlinky.qiniuJs.qiniuJsStrings.gif
import typingsSlinky.qiniuJs.qiniuJsStrings.jpg
import typingsSlinky.qiniuJs.qiniuJsStrings.png
import typingsSlinky.qiniuJs.qiniuJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView2FopOptions extends ImageView2Options {
  var fop: typingsSlinky.qiniuJs.qiniuJsStrings.imageView2
}

object ImageView2FopOptions {
  @scala.inline
  def apply(
    fop: typingsSlinky.qiniuJs.qiniuJsStrings.imageView2,
    format: jpg | gif | png | webp | String,
    h: Double,
    mode: `0` | `1` | `2` | `3` | `4` | `5`,
    q: Double,
    w: Double
  ): ImageView2FopOptions = {
    val __obj = js.Dynamic.literal(fop = fop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageView2FopOptions]
  }
}

