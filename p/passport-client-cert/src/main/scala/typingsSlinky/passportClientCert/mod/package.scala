package typingsSlinky.passportClientCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typingsSlinky.passportClientCert.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function2[
    /* clientCert */ typingsSlinky.passportClientCert.mod.PeerCertificate, 
    /* done */ typingsSlinky.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ typingsSlinky.passportClientCert.mod.PeerCertificate, 
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* done */ typingsSlinky.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
}
