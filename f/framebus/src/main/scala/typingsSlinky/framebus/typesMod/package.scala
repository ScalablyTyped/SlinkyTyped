package typingsSlinky.framebus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FramebusOnHandler = js.Function2[
    /* data */ typingsSlinky.framebus.typesMod.FramebusSubscriberArg, 
    /* reply */ typingsSlinky.framebus.typesMod.FramebusReplyHandler, 
    scala.Unit
  ]
  
  type FramebusReplyHandler = js.Function1[/* data */ js.Any, scala.Unit]
  
  type FramebusSubscribeHandler = js.Function2[
    /* data */ js.UndefOr[
      typingsSlinky.framebus.typesMod.FramebusSubscriberArg | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object)
    ], 
    /* reply */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias framebus.framebus/dist/lib/types.FramebusSubscribeHandler */ js.Object
    ], 
    scala.Unit
  ]
  
  type FramebusSubscriber = typingsSlinky.std.Record[java.lang.String, typingsSlinky.framebus.typesMod.FramebusSubscription]
  
  type FramebusSubscriberArg = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type FramebusSubscription = typingsSlinky.std.Record[
    java.lang.String, 
    js.Array[typingsSlinky.framebus.typesMod.FramebusSubscribeHandler]
  ]
  
  type ReplyFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
}
