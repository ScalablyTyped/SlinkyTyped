package typingsSlinky.gulpDashSvgDashSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashSvgDashSpriteMod {
  import typingsSlinky.node.NodeJS.ReadWriteStream
  import typingsSlinky.svgDashSprite.svgDashSpriteMod.Config

  type SvgSprite = js.Function1[/* options */ js.UndefOr[Config], ReadWriteStream]
}
