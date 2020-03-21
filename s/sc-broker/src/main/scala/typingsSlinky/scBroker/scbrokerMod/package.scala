package typingsSlinky.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scbrokerMod {
  type PublishMiddleware = js.Function1[/* req */ typingsSlinky.scBroker.scbrokerMod.PublishMiddlewareData, scala.Unit]
  type QueryFunction = js.Function3[
    /* dataMap */ typingsSlinky.fleximap.mod.FlexiMap, 
    /* dataExpirer */ typingsSlinky.expirymanager.mod.ExpiryManager, 
    /* subscriptions */ typingsSlinky.scBroker.scbrokerMod.Subscriptions, 
    js.Any
  ]
  type SubscribeMiddleware = js.Function1[/* req */ typingsSlinky.scBroker.scbrokerMod.SubscribeMiddlewareData, scala.Unit]
  type Subscriptions = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.StringDictionary[typingsSlinky.ncom.mod.ComSocket]]
}
