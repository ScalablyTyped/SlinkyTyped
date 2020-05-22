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
  type GRPCCall = typingsSlinky.googleGax.apitypesMod.UnaryCall | typingsSlinky.googleGax.apitypesMod.ServerStreamingCall | typingsSlinky.googleGax.apitypesMod.ClientStreamingCall | typingsSlinky.googleGax.apitypesMod.BiDiStreamingCall
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
  type GaxCallResult = typingsSlinky.googleGax.callMod.CancellablePromise[typingsSlinky.googleGax.apitypesMod.ResultTuple] | typingsSlinky.googleGax.apitypesMod.CancellableStream
  type GaxCallStream = js.Function3[
    /* argument */ js.Object, 
    /* callOptions */ js.UndefOr[typingsSlinky.googleGax.gaxMod.CallOptions], 
    /* callback */ js.UndefOr[typingsSlinky.googleGax.apitypesMod.APICallback], 
    typingsSlinky.googleGax.apitypesMod.CancellableStream
  ]
  type NextPageRequestType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | js.Object]) | scala.Null
  type RawResponseType = typingsSlinky.googleGax.longrunningMod.Operation_ | js.Object | scala.Null
  type RequestType = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | js.Object]
  type ResponseType = js.Object | scala.Null
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
