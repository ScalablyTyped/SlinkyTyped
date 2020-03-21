package typingsSlinky.nodeEasyCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenerateCallback = js.Function3[
    /* err */ js.Error | typingsSlinky.nodeEasyCert.mod.CertErrors | scala.Null, 
    /* keyPath */ java.lang.String, 
    /* certPath */ java.lang.String, 
    js.Any
  ]
  type GetCertificateCallback = js.Function3[
    /* err */ js.Error | typingsSlinky.nodeEasyCert.mod.CertErrors | scala.Null, 
    /* keyContent */ java.lang.String, 
    /* certContent */ java.lang.String, 
    js.Any
  ]
}
