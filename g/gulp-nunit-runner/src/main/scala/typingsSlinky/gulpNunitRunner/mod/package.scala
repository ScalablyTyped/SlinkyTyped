package typingsSlinky.gulpNunitRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NUnit = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.gulpNunitRunner.mod.Options], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
}
