package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object observableMod {
  
  type ObservableConstructor = js.Function2[
    /* description */ typingsSlinky.baconjs.describeMod.Desc, 
    /* subscribe */ typingsSlinky.baconjs.typesMod.Subscribe[js.Any], 
    typingsSlinky.baconjs.observableMod.Observable[js.Any]
  ]
}
