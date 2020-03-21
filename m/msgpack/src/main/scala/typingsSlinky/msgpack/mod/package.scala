package typingsSlinky.msgpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ typingsSlinky.msgpack.mod.MsgPackDownloadOption, 
    /* result */ typingsSlinky.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
  type MsgPackUploadCallback = js.Function3[
    /* data */ java.lang.String, 
    /* option */ typingsSlinky.msgpack.mod.MsgPackUploadOption, 
    /* result */ typingsSlinky.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
}
