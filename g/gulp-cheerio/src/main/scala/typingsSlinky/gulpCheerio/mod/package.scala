package typingsSlinky.gulpCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* $ */ typingsSlinky.cheerio.CheerioStatic, 
    /* file */ typingsSlinky.vinyl.mod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
