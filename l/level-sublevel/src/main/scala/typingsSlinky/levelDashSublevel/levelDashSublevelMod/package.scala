package typingsSlinky.levelDashSublevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object levelDashSublevelMod {
  import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
  import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
  import typingsSlinky.levelup.levelupMod.LevelUp

  type Constructor = js.Function1[
    /* levelup */ LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]], 
    Sublevel
  ]
  type Hook = js.Function2[/* ch */ js.Any, /* add */ js.Function1[/* op */ Batch | Boolean, Unit], Unit]
}
