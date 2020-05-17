package typingsSlinky.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* res */ T, scala.Unit]
  type CallbackFunction[T] = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.node.NodeJS.ErrnoException | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  type Command = typingsSlinky.ioredis.mod._Command
  type DNSLookupFunction = js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type NatMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ioredis.anon.Host]
  type Ok = typingsSlinky.ioredis.ioredisStrings.OK
}
