package typingsSlinky.prismicDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTMLSerializer[T] = js.Function5[
    /* type */ typingsSlinky.prismicDom.mod.ElementType, 
    /* element */ js.Any, 
    /* text */ java.lang.String | scala.Null, 
    /* children */ js.Array[T], 
    /* index */ scala.Double, 
    T
  ]
}
