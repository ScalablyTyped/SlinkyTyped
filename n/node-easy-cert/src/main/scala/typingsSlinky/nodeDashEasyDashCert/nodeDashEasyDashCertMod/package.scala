package typingsSlinky.nodeDashEasyDashCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashEasyDashCertMod {
  type GenerateCallback = js.Function3[
    /* err */ js.Error | CertErrors | Null, 
    /* keyPath */ String, 
    /* certPath */ String, 
    js.Any
  ]
  type GetCertificateCallback = js.Function3[
    /* err */ js.Error | CertErrors | Null, 
    /* keyContent */ String, 
    /* certContent */ String, 
    js.Any
  ]
}
