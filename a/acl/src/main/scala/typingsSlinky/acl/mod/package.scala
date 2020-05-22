package typingsSlinky.acl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ js.Error, /* allowed */ scala.Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ js.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], js.Any]
  type GetUserId = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    typingsSlinky.acl.mod.Value
  ]
  type MemoryBackend = typingsSlinky.acl.mod.Backend[js.Array[typingsSlinky.acl.mod.Action]]
  // for mongodb backend
  type MongodbBackend = typingsSlinky.acl.mod.Backend[typingsSlinky.acl.mod.Callback]
  // for redis backend
  type RedisBackend = typingsSlinky.acl.mod.Backend[typingsSlinky.redis.mod.RedisClient]
  type Value = java.lang.String | scala.Double
  type Values = typingsSlinky.acl.mod.Value | js.Array[typingsSlinky.acl.mod.Value]
  type strings = java.lang.String | js.Array[java.lang.String]
}
