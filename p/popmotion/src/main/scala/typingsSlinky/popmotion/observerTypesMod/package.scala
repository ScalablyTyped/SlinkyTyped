package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object observerTypesMod {
  
  type Complete = js.Function0[js.Any]
  
  type Error = js.Function1[/* err */ js.UndefOr[js.Any], js.Any]
  
  type Middleware = js.Function2[
    /* update */ typingsSlinky.popmotion.observerTypesMod.Update, 
    /* complete */ js.UndefOr[typingsSlinky.popmotion.observerTypesMod.Complete], 
    js.Function1[/* v */ js.Any, js.Any]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.popmotion.observerTypesMod.Update
    - typingsSlinky.popmotion.observerTypesMod.IObserver
    - typingsSlinky.popmotion.observerTypesMod.PartialObserver
  */
  type ObserverCandidate = typingsSlinky.popmotion.observerTypesMod._ObserverCandidate | typingsSlinky.popmotion.observerTypesMod.Update
  
  type ObserverEvent = js.Function2[/* type */ js.UndefOr[java.lang.String], /* v */ js.UndefOr[js.Any], js.Any]
  
  type ObserverFactory = js.Function2[
    /* observerCandidate */ typingsSlinky.popmotion.observerTypesMod.ObserverCandidate, 
    /* props */ typingsSlinky.popmotion.observerTypesMod.ObserverProps, 
    typingsSlinky.popmotion.observerTypesMod.IObserver
  ]
  
  type Update = js.Function
}
