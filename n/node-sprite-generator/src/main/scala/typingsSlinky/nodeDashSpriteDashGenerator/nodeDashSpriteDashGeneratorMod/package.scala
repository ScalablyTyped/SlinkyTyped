package typingsSlinky.nodeDashSpriteDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSpriteDashGeneratorMod {
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit], 
    Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ String, 
    /* spritePath */ String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ js.Error, Unit], 
    Unit
  ]
}
