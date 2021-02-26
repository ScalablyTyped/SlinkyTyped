package typingsSlinky.firebaseRemoteConfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigFetchClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/remote_config_fetch_client", "RemoteConfigAbortSignal")
  @js.native
  class RemoteConfigAbortSignal () extends StObject {
    
    def abort(): Unit = js.native
    
    def addEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    var listeners: js.Array[js.Function0[Unit]] = js.native
  }
  
  @js.native
  trait FetchRequest extends StObject {
    
    /**
      * Uses cached config if it is younger than this age.
      *
      * <p>Required because it's defined by settings, which always have a value.
      *
      * <p>Comparable to passing `headers = { 'Cache-Control': max-age <maxAge> }` to the native
      * Fetch API.
      */
    var cacheMaxAgeMillis: Double = js.native
    
    /**
      * The ETag header value from the last response.
      *
      * <p>Optional in case this is the first request.
      *
      * <p>Comparable to passing `headers = { 'If-None-Match': <eTag> }` to the native Fetch API.
      */
    var eTag: js.UndefOr[String] = js.native
    
    /**
      * An event bus for the signal to abort a request.
      *
      * <p>Required because all requests should be abortable.
      *
      * <p>Comparable to the native
      * Fetch API's "signal" field on its request configuration object
      * https://fetch.spec.whatwg.org/#dom-requestinit-signal.
      *
      * <p>Disambiguation: Remote Config commonly refers to API inputs as
      * "signals". See the private ConfigFetchRequestBody interface for those:
      * http://google3/firebase/remote_config/web/src/core/rest_client.ts?l=14&rcl=255515243.
      */
    var signal: RemoteConfigAbortSignal = js.native
  }
  object FetchRequest {
    
    @scala.inline
    def apply(cacheMaxAgeMillis: Double, signal: RemoteConfigAbortSignal): FetchRequest = {
      val __obj = js.Dynamic.literal(cacheMaxAgeMillis = cacheMaxAgeMillis.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRequest]
    }
    
    @scala.inline
    implicit class FetchRequestMutableBuilder[Self <: FetchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheMaxAgeMillis(value: Double): Self = StObject.set(x, "cacheMaxAgeMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
      
      @scala.inline
      def setSignal(value: RemoteConfigAbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FetchResponse extends StObject {
    
    /**
      * Defines the map of parameters returned as "entries" in the fetch response body.
      *
      * <p>Only defined for 200 responses.
      */
    var config: js.UndefOr[FirebaseRemoteConfigObject] = js.native
    
    /**
      * Defines the ETag response header value.
      *
      * <p>Only defined for 200 and 304 responses.
      */
    var eTag: js.UndefOr[String] = js.native
    
    /**
      * The HTTP status, which is useful for differentiating success responses with data from
      * those without.
      *
      * <p>{@link RemoteConfigClient} is modeled after the native {@link GlobalFetch} interface, so
      * HTTP status is first-class.
      *
      * <p>Disambiguation: the fetch response returns a legacy "state" value that is redundant with the
      * HTTP status code. The former is normalized into the latter.
      */
    var status: Double = js.native
  }
  object FetchResponse {
    
    @scala.inline
    def apply(status: Double): FetchResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @scala.inline
    implicit class FetchResponseMutableBuilder[Self <: FetchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: FirebaseRemoteConfigObject): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type FirebaseRemoteConfigObject = StringDictionary[String]
  
  @js.native
  trait RemoteConfigFetchClient extends StObject {
    
    /**
      * @throws if response status is not 200 or 304.
      */
    def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
  }
  object RemoteConfigFetchClient {
    
    @scala.inline
    def apply(fetch: FetchRequest => js.Promise[FetchResponse]): RemoteConfigFetchClient = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[RemoteConfigFetchClient]
    }
    
    @scala.inline
    implicit class RemoteConfigFetchClientMutableBuilder[Self <: RemoteConfigFetchClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: FetchRequest => js.Promise[FetchResponse]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    }
  }
}
