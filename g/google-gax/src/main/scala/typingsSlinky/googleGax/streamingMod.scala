package typingsSlinky.googleGax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.googleGax.apitypesMod.APICallback
import typingsSlinky.googleGax.apitypesMod.CancellableStream
import typingsSlinky.googleGax.apitypesMod.GRPCCallResult
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.gaxMod.RetryRequestOptions
import typingsSlinky.googleGax.googleGaxBooleans.`false`
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streaming", "StreamProxy")
  @js.native
  class StreamProxy protected ()
    extends DuplexifyConstructor
       with GRPCCallResult {
    /**
      * StreamProxy is a proxy to gRPC-streaming method.
      *
      * @private
      * @constructor
      * @param {StreamType} type - the type of gRPC stream.
      * @param {ApiCallback} callback - the callback for further API call.
      */
    def this(`type`: StreamType, callback: APICallback) = this()
    
    var _callback: js.Any = js.native
    
    var _isCancelCalled: js.Any = js.native
    
    /**
      * Forward events from an API request stream to the user's stream.
      * @param {Stream} stream - The API request stream.
      */
    def forwardEvents(stream: Stream): Unit = js.native
    
    /**
      * Specifies the target stream.
      * @param {ApiCall} apiCall - the API function to be called.
      * @param {Object} argument - the argument to be passed to the apiCall.
      */
    def setStream(apiCall: SimpleCallbackFunction, argument: js.Object): Unit = js.native
    def setStream(apiCall: SimpleCallbackFunction, argument: js.Object, retryRequestOptions: RetryRequestOptions): Unit = js.native
    
    var stream: js.UndefOr[CancellableStream] = js.native
    
    var `type`: StreamType = js.native
  }
  
  @js.native
  sealed trait StreamType extends StObject
  @JSImport("google-gax/build/src/streamingCalls/streaming", "StreamType")
  @js.native
  object StreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StreamType with Double] = js.native
    
    /** Both client and server stream objects. */
    @js.native
    sealed trait BIDI_STREAMING extends StreamType
    /* 3 */ val BIDI_STREAMING: typingsSlinky.googleGax.streamingMod.StreamType.BIDI_STREAMING with Double = js.native
    
    /** Client streams requests, server returns a single response. */
    @js.native
    sealed trait CLIENT_STREAMING extends StreamType
    /* 2 */ val CLIENT_STREAMING: typingsSlinky.googleGax.streamingMod.StreamType.CLIENT_STREAMING with Double = js.native
    
    /** Client sends a single request, server streams responses. */
    @js.native
    sealed trait SERVER_STREAMING extends StreamType
    /* 1 */ val SERVER_STREAMING: typingsSlinky.googleGax.streamingMod.StreamType.SERVER_STREAMING with Double = js.native
  }
  
  @js.native
  trait Duplexify extends Duplex {
    
    def setReadable(): Unit = js.native
    def setReadable(readable: Readable): Unit = js.native
    @JSName("setReadable")
    def setReadable_false(readable: `false`): Unit = js.native
    
    def setWritable(): Unit = js.native
    def setWritable(writable: Writable): Unit = js.native
    @JSName("setWritable")
    def setWritable_false(writable: `false`): Unit = js.native
  }
  
  @js.native
  trait DuplexifyConstructor
    extends Instantiable0[Duplexify]
       with Instantiable1[`false` | (/* writable */ Writable), Duplexify]
       with Instantiable2[
          js.UndefOr[`false` | (/* writable */ Null) | (/* writable */ Writable)], 
          `false` | (/* readable */ Readable), 
          Duplexify
        ]
       with Instantiable3[
          js.UndefOr[`false` | (/* writable */ Null) | (/* writable */ Writable)], 
          js.UndefOr[`false` | (/* readable */ Null) | (/* readable */ Readable)], 
          /* options */ DuplexifyOptions, 
          Duplexify
        ] {
    
    def apply(): Duplexify = js.native
    def apply(
      writable: js.UndefOr[scala.Nothing],
      readable: js.UndefOr[scala.Nothing],
      options: DuplexifyOptions
    ): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: `false`): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: Readable): Duplexify = js.native
    def apply(writable: js.UndefOr[scala.Nothing], readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: `false`): Duplexify = js.native
    def apply(writable: Null, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: Readable): Duplexify = js.native
    def apply(writable: Null, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`): Duplexify = js.native
    def apply(writable: `false`, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: `false`): Duplexify = js.native
    def apply(writable: `false`, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: Readable): Duplexify = js.native
    def apply(writable: `false`, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable): Duplexify = js.native
    def apply(writable: Writable, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: `false`): Duplexify = js.native
    def apply(writable: Writable, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: Readable): Duplexify = js.native
    def apply(writable: Writable, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    
    def obj(): Duplexify = js.native
    def obj(
      writable: js.UndefOr[scala.Nothing],
      readable: js.UndefOr[scala.Nothing],
      options: DuplexifyOptions
    ): Duplexify = js.native
    def obj(writable: js.UndefOr[scala.Nothing], readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: js.UndefOr[scala.Nothing], readable: Readable): Duplexify = js.native
    def obj(writable: js.UndefOr[scala.Nothing], readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Null, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Null, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Null, readable: Readable): Duplexify = js.native
    def obj(writable: Null, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable): Duplexify = js.native
    def obj(writable: Writable, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable, readable: Readable): Duplexify = js.native
    def obj(writable: Writable, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: js.UndefOr[scala.Nothing], readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: js.UndefOr[scala.Nothing], readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Null, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Null, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: js.UndefOr[scala.Nothing], options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Readable): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Writable, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Writable, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
  }
  
  @js.native
  trait DuplexifyOptions extends DuplexOptions {
    
    var end: js.UndefOr[Boolean] = js.native
  }
  object DuplexifyOptions {
    
    @scala.inline
    def apply(): DuplexifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexifyOptions]
    }
    
    @scala.inline
    implicit class DuplexifyOptionsMutableBuilder[Self <: DuplexifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
