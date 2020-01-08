package typingsSlinky.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioredisMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.ioredis.Anon_Host
  import typingsSlinky.ioredis.Anon_Ip
  import typingsSlinky.ioredis.ioredisStrings.OK
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.NodeJS.ErrnoException

  type CallbackFunction[T] = js.Function2[/* err */ js.UndefOr[ErrnoException | Null], /* result */ js.UndefOr[T], Unit]
  type ClusterNode = String | Double | NodeConfiguration
  type DNSLookupFunction = js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function3[/* err */ ErrnoException, /* address */ String, /* family */ Double, Unit], 
    Unit
  ]
  type KeyType = String | Buffer
  type NatMap = StringDictionary[Anon_Host]
  type Ok = OK
  type PreferredSlaves = (js.Function1[/* slaves */ js.Array[AddressFromResponse], AddressFromResponse | Null]) | js.Array[Anon_Ip] | Anon_Ip
  type ValueType = String | Buffer | Double | js.Array[js.Any]
}
