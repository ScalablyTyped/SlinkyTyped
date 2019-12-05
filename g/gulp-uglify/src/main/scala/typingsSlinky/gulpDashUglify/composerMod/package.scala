package typingsSlinky.gulpDashUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composerMod {
  import typingsSlinky.gulpDashUglify.gulpDashUglifyMod.Options
  import typingsSlinky.node.NodeJS.ReadWriteStream

  type Composer = js.Function2[
    /* uglify */ Uglify, 
    /* log */ Logger, 
    js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  ]
}
