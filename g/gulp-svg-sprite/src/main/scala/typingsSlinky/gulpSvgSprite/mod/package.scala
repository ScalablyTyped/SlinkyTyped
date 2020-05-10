package typingsSlinky.gulpSvgSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SvgSprite = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.svgSprite.mod.Config], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
}
