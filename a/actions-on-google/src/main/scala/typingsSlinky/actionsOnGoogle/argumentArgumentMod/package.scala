package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object argumentArgumentMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - `js.undefined`
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus
    - scala.Boolean
    - java.lang.String
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Location
    - typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any]
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[
    typingsSlinky.actionsOnGoogle.argumentArgumentMod._Argument | typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any] | scala.Double | scala.Boolean | java.lang.String
  ]
  type ArgumentsIndexable = org.scalablytyped.runtime.StringDictionary[typingsSlinky.actionsOnGoogle.argumentArgumentMod.Argument]
  type ArgumentsRaw = /** @public */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Argument]
  type ArgumentsStatus = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsSlinky.actionsOnGoogle.v2Mod.GoogleRpcStatus]]
}
