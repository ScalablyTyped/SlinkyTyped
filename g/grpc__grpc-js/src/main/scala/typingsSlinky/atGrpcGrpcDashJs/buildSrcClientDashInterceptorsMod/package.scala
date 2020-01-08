package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcClientDashInterceptorsMod {
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typingsSlinky.std.Partial

  type CancelRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  type CloseRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  type Interceptor = js.Function2[/* options */ InterceptorOptions, /* nextCall */ NextCall, InterceptingCall]
  type InterceptorProvider = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientMethodDefinition<any, any> */ /* methodDefinition */ js.Any, 
    Interceptor
  ]
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit], Unit]
  type MetadataRequester = js.Function3[
    /* metadata */ Metadata, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterceptingListener */ /* listener */ js.Any, 
    /* next */ js.Function2[
      /* metadata */ Metadata, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterceptingListener */ /* listener */ js.Any, 
      Unit
    ], 
    Unit
  ]
  type NextCall = js.Function1[/* options */ InterceptorOptions, InterceptingCallInterface]
  type Requester = Partial[FullRequester]
}
