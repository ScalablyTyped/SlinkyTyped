package typingsSlinky.gulpUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object composerMod {
  type Composer = js.Function2[
    /* uglify */ typingsSlinky.gulpUglify.composerMod.Uglify, 
    /* log */ typingsSlinky.gulpUglify.composerMod.Logger, 
    js.Function1[
      /* options */ js.UndefOr[typingsSlinky.gulpUglify.mod.Options], 
      typingsSlinky.node.NodeJS.ReadWriteStream
    ]
  ]
}
