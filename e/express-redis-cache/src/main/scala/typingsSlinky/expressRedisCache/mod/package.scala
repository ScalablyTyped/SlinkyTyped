package typingsSlinky.expressRedisCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpirationConfig = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type ExpirationPolicy = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    scala.Double
  ]
  type ExpireOption = scala.Double | typingsSlinky.expressRedisCache.mod.ExpirationConfig
}
