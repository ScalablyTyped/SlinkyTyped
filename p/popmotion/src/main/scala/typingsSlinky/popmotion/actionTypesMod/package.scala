package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object actionTypesMod {
  
  type ActionInit = js.Function1[
    /* observer */ typingsSlinky.popmotion.observerTypesMod.IObserver, 
    typingsSlinky.popmotion.anon.PartialColdSubscription | scala.Unit
  ]
}
