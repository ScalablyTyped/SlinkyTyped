package typingsSlinky.gulpDashCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashCheerioMod {
  import typingsSlinky.cheerio.CheerioStatic
  import typingsSlinky.vinyl.vinylMod.File

  type Callback = js.Function3[/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function], js.Any]
}
