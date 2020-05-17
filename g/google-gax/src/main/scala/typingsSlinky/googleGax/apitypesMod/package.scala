package typingsSlinky.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apitypesMod {
  type APICallback = js.Function4[
    /* err */ typingsSlinky.googleGax.googleErrorMod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.ResponseType], 
    /* next */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.NextPageRequestType], 
    /* rawResponse */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.RawResponseType], 
    scala.Unit
  ]
  type BiDiStreamingCall = js.Function2[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    typingsSlinky.node.streamMod.Duplex with typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  ]
  type CancellableStream = typingsSlinky.node.streamMod.Duplex with typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  type ClientStreamingCall = js.Function3[
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.APICallback], 
    typingsSlinky.node.streamMod.Duplex with typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  ]
  type GaxCall = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typingsSlinky.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.APICallback], 
    typingsSlinky.googleGax.apitypesMod.GaxCallResult
  ]
  type GaxCallPromise = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typingsSlinky.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.APICallback], 
    typingsSlinky.googleGax.callMod.CancellablePromise[typingsSlinky.googleGax.apitypesMod.ResultTuple]
  ]
  type GaxCallStream = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typingsSlinky.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.APICallback], 
    typingsSlinky.googleGax.apitypesMod.CancellableStream
  ]
  type RequestType = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | js.Object]
  type ResultTuple = js.Tuple3[
    typingsSlinky.googleGax.apitypesMod.ResponseType, 
    js.UndefOr[typingsSlinky.googleGax.apitypesMod.NextPageRequestType], 
    js.UndefOr[typingsSlinky.googleGax.apitypesMod.RawResponseType]
  ]
  type ServerStreamingCall = js.Function3[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    typingsSlinky.node.streamMod.Duplex with typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  ]
  type SimpleCallbackFunction = js.Function2[
    /* request */ typingsSlinky.googleGax.apitypesMod.RequestType, 
    /* callback */ typingsSlinky.googleGax.apitypesMod.APICallback, 
    typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  ]
  type UnaryCall = js.Function4[
    /* argument */ js.Object, 
    /* metadata */ js.Object, 
    /* options */ js.Object, 
    /* callback */ typingsSlinky.googleGax.apitypesMod.APICallback, 
    typingsSlinky.googleGax.apitypesMod.GRPCCallResult
  ]
}
