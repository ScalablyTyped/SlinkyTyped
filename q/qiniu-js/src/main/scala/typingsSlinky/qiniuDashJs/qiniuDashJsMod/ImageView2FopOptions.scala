package typingsSlinky.qiniuDashJs.qiniuDashJsMod

import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`0`
import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`1`
import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`2`
import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`3`
import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`4`
import typingsSlinky.qiniuDashJs.qiniuDashJsNumbers.`5`
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.gif
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.jpg
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.png
import typingsSlinky.qiniuDashJs.qiniuDashJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView2FopOptions extends ImageView2Options {
  var fop: typingsSlinky.qiniuDashJs.qiniuDashJsStrings.imageView2
}

object ImageView2FopOptions {
  @scala.inline
  def apply(
    fop: typingsSlinky.qiniuDashJs.qiniuDashJsStrings.imageView2,
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

