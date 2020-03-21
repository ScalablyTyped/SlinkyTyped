package typingsSlinky.japanPostalCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* addressData */ typingsSlinky.japanPostalCode.mod.AddressData, scala.Unit]
  type FetchPostalCodeMethod = js.Function2[
    /* stringifiedPostalCode */ java.lang.String, 
    /* callback */ typingsSlinky.japanPostalCode.mod.Callback, 
    scala.Unit
  ]
}
