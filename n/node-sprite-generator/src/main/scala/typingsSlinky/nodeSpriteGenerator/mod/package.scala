package typingsSlinky.nodeSpriteGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LayoutFunc = js.Function3[
    /* images */ js.Array[typingsSlinky.nodeSpriteGenerator.mod.Image], 
    /* options */ typingsSlinky.nodeSpriteGenerator.mod.LayoutOption, 
    /* callback */ js.Function2[
      /* error */ js.Error, 
      /* layout */ typingsSlinky.nodeSpriteGenerator.mod.Layout, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ typingsSlinky.nodeSpriteGenerator.mod.Layout, 
    /* stylesheetPath */ java.lang.String, 
    /* spritePath */ java.lang.String, 
    /* options */ typingsSlinky.nodeSpriteGenerator.mod.StylesheetOption, 
    /* callback */ js.Function1[/* error */ js.Error, scala.Unit], 
    scala.Unit
  ]
}
