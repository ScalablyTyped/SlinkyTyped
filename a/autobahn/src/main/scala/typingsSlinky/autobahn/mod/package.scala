package typingsSlinky.autobahn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = java.lang.String with js.Object
  type DeferFactory = js.Function0[typingsSlinky.when.When.Promise_[js.Any]]
  type OnChallengeHandler = js.Function3[
    /* session */ typingsSlinky.autobahn.mod.Session, 
    /* method */ java.lang.String, 
    /* extra */ js.Any, 
    java.lang.String | typingsSlinky.when.When.Promise_[java.lang.String]
  ]
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsSlinky.autobahn.mod.IInvocation], 
    scala.Unit
  ]
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsSlinky.autobahn.mod.IEvent], 
    scala.Unit
  ]
  type TransportType = typingsSlinky.autobahn.mod.DefaultTransportType | typingsSlinky.autobahn.mod.CustomTransportType
}
