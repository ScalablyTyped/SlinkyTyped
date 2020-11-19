package typingsSlinky.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddressCallback = js.Function2[/* err */ js.Error, /* addr */ typingsSlinky.address.mod.Address, scala.Unit]
  
  type DnsCallback = js.Function2[/* err */ js.Error, /* servers */ js.Array[java.lang.String], scala.Unit]
  
  type MacCallback = js.Function2[/* err */ js.Error, /* addr */ java.lang.String, scala.Unit]
}
