package typingsSlinky.gulpMinify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type minify = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.gulpMinify.mod.Options], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
}
