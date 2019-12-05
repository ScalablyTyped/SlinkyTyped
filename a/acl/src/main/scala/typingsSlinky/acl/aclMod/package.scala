package typingsSlinky.acl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aclMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse
  import typingsSlinky.redis.redisMod.RedisClient

  type Action = js.Function0[js.Any]
  type AllowedCallback = js.Function2[/* err */ js.Error, /* allowed */ Boolean, js.Any]
  type AnyCallback = js.Function2[/* err */ js.Error, /* obj */ js.Any, js.Any]
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], js.Any]
  type GetUserId = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Value]
  type MemoryBackend = Backend[js.Array[Action]]
  // for mongodb backend
  type MongodbBackend = Backend[Callback]
  // for redis backend
  type RedisBackend = Backend[RedisClient]
  type Value = String | Double
  type Values = Value | js.Array[Value]
  type strings = String | js.Array[String]
}
