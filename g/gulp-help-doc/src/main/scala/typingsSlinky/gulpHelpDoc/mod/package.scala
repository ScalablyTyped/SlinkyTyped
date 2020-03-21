package typingsSlinky.gulpHelpDoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Usage = js.Function2[
    /* gulp */ typingsSlinky.gulp.mod.Gulp, 
    /* options */ js.UndefOr[typingsSlinky.gulpHelpDoc.mod.UsageOptions], 
    js.Promise[js.Any]
  ]
}
