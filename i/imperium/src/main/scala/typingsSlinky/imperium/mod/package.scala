package typingsSlinky.imperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Context_ = js.Array[
    typingsSlinky.imperium.imperiumStrings.params | typingsSlinky.imperium.imperiumStrings.query | typingsSlinky.imperium.imperiumStrings.headers | typingsSlinky.imperium.imperiumStrings.body
  ]
  type GetAcl = js.Function1[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    js.Promise[scala.Boolean | js.Object]
  ]
  type RoleParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Roles_ = org.scalablytyped.runtime.StringDictionary[typingsSlinky.imperium.mod.RoleActions]
}
