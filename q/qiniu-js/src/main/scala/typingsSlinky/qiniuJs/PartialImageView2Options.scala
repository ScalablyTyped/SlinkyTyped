package typingsSlinky.qiniuJs

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

/* Inlined std.Partial<qiniu-js.qiniu-js.ImageView2Options> */
trait PartialImageView2Options extends js.Object {
  var format: js.UndefOr[jpg | gif | png | webp | String] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.undefined
  var q: js.UndefOr[Double] = js.undefined
  var w: js.UndefOr[Double] = js.undefined
}

object PartialImageView2Options {
  @scala.inline
  def apply(
    format: jpg | gif | png | webp | String = null,
    h: Int | Double = null,
    mode: `0` | `1` | `2` | `3` | `4` | `5` = null,
    q: Int | Double = null,
    w: Int | Double = null
  ): PartialImageView2Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImageView2Options]
  }
}

