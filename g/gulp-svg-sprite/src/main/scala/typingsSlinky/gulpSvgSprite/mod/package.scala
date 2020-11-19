package typingsSlinky.gulpSvgSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SvgSprite = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.svgSprite.mod.Config], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
}
