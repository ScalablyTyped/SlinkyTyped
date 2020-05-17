package typingsSlinky.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
