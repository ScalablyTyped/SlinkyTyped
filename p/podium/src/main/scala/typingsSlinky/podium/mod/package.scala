package typingsSlinky.podium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[typingsSlinky.podium.mod.Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
