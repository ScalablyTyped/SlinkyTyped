package typingsSlinky.levelSublevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Constructor = js.Function1[
    /* levelup */ typingsSlinky.levelup.mod.LevelUp[
      typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN[js.Any, js.Any], 
      typingsSlinky.abstractLeveldown.mod.AbstractIterator[js.Any, js.Any]
    ], 
    typingsSlinky.levelSublevel.mod.Sublevel
  ]
  
  type Hook = js.Function2[
    /* ch */ js.Any, 
    /* add */ js.Function1[/* op */ typingsSlinky.levelSublevel.mod.Batch | scala.Boolean, scala.Unit], 
    scala.Unit
  ]
}
