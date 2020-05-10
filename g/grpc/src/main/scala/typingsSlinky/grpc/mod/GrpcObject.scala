package typingsSlinky.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcObject
  extends /* name */ StringDictionary[
      GrpcObject | (Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        js.UndefOr[/* options */ js.Object], 
        Client
      ]) | Message[js.Object]
    ]

object GrpcObject {
  @scala.inline
  def apply(): GrpcObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcObject]
  }
}

