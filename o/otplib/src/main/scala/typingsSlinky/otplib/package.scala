package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object otplib {
  type createHmacSecret = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplib.HmacOptions, 
    typingsSlinky.node.Buffer
  ]
  type hotpCheck = js.Function4[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplib.HotpOptionsInterface, 
    scala.Boolean
  ]
  type hotpCounter = js.Function1[/* counter */ scala.Double, java.lang.String]
  type hotpDigest = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type hotpOptions = js.Function1[/* options */ js.Any, typingsSlinky.otplib.HotpOptionsInterface]
  type hotpSecret = typingsSlinky.otplib.createHmacSecret
  type hotpToken = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsSlinky.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type totpCheck = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplib.TotpOptionsInterface, 
    scala.Boolean
  ]
  type totpCheckWithWindow = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplib.TotpOptionsInterface, 
    scala.Double | scala.Null
  ]
  type totpCounter = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpOptions = js.Function1[/* options */ js.Any, typingsSlinky.otplib.TotpOptionsInterface]
  type totpSecret = typingsSlinky.otplib.createHmacSecret
  type totpTimeRemaining = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpTimeUsed = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpToken = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsSlinky.otplib.TotpOptionsInterface, 
    java.lang.String
  ]
}
