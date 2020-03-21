package typingsSlinky.cors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CorsOptionsDelegate = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* callback */ js.Function2[
      /* err */ js.Error | scala.Null, 
      /* options */ js.UndefOr[typingsSlinky.cors.mod.CorsOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[java.lang.String], 
    /* callback */ js.Function2[/* err */ js.Error | scala.Null, /* allow */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
}
