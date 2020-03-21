package typingsSlinky.roads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simpleRouterMod {
  type Route = js.ThisFunction4[
    /* this */ typingsSlinky.roads.roadMod.Context, 
    /* path */ java.lang.String, 
    /* body */ java.lang.String, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* next */ typingsSlinky.roads.roadMod.ResponseMiddleware, 
    js.Promise[typingsSlinky.roads.responseMod.default]
  ]
}
