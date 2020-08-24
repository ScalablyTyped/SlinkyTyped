package typingsSlinky.ltijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object providerMod {
  type OnConnectCallback = js.Function4[
    /* connection */ typingsSlinky.ltijs.idTokenMod.IdToken, 
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    typingsSlinky.express.mod.Response_[js.Any] | scala.Unit
  ]
  type ServerAddonFunction = js.Function1[/* app */ typingsSlinky.express.mod.Express, scala.Unit]
}
