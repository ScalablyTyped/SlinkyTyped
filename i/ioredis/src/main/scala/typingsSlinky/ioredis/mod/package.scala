package typingsSlinky.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* res */ T, scala.Unit]
  
  type CallbackFunction[T] = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.node.NodeJS.ErrnoException | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type ClusterNode = java.lang.String | scala.Double | typingsSlinky.ioredis.mod.NodeConfiguration
  
  type Command = typingsSlinky.ioredis.mod._Command
  
  type DNSLookupFunction = js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function3[
      /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type KeyType = java.lang.String | typingsSlinky.node.Buffer
  
  type NatMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ioredis.anon.Host]
  
  type Ok = typingsSlinky.ioredis.ioredisStrings.OK
  
  type PreferredSlaves = (js.Function1[
    /* slaves */ js.Array[typingsSlinky.ioredis.mod.AddressFromResponse], 
    typingsSlinky.ioredis.mod.AddressFromResponse | scala.Null
  ]) | js.Array[typingsSlinky.ioredis.anon.Ip] | typingsSlinky.ioredis.anon.Ip
  
  type ValueType = java.lang.String | typingsSlinky.node.Buffer | scala.Double | js.Array[js.Any]
}
