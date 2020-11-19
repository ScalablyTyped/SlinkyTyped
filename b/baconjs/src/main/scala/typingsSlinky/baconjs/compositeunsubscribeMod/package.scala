package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object compositeunsubscribeMod {
  
  type Subscription = js.Function2[
    /* unsubAll */ typingsSlinky.baconjs.typesMod.Unsub, 
    /* unsubMe */ typingsSlinky.baconjs.typesMod.Unsub, 
    typingsSlinky.baconjs.typesMod.Unsub
  ]
}
