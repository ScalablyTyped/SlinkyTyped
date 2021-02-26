package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.anon.Headers
import typingsSlinky.awsSdk.anon.Timeout
import typingsSlinky.awsSdk.anon.TimeoutNumber
import typingsSlinky.awsSdk.errorMod.AWSError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataServiceMod {
  
  @JSImport("aws-sdk/lib/metadata_service", "MetadataService")
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  class MetadataService () extends StObject {
    def this(options: MetadataServiceOptions) = this()
    
    /**
      * A map of options to pass to the underlying HTTP request.
      */
    var httpOptions: TimeoutNumber = js.native
    
    /**
      * Sends a request to the instance metadata service for a given resource.
      */
    def request(path: String, callback: js.Function2[/* err */ AWSError, /* data */ String, Unit]): Unit = js.native
    def request(
      path: String,
      options: Headers,
      callback: js.Function2[/* err */ AWSError, /* data */ String, Unit]
    ): Unit = js.native
  }
  /* static members */
  object MetadataService {
    
    @JSImport("aws-sdk/lib/metadata_service", "MetadataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 169.254.169.254
      */
    @JSImport("aws-sdk/lib/metadata_service", "MetadataService.host")
    @js.native
    def host: String = js.native
    @scala.inline
    def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MetadataServiceOptions extends StObject {
    
    /**
      * the hostname of the instance metadata service.
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * a map of options to pass to the underlying HTTP request.
      */
    var httpOptions: js.UndefOr[Timeout] = js.native
    
    /**
      * the maximum number of retries to perform for timeout errors.
      */
    var maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * A set of options to configure the retry delay on retryable errors. See AWS.Config for details.
      */
    var retryDelayOptions: js.UndefOr[js.Any] = js.native
  }
  object MetadataServiceOptions {
    
    @scala.inline
    def apply(): MetadataServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataServiceOptions]
    }
    
    @scala.inline
    implicit class MetadataServiceOptionsMutableBuilder[Self <: MetadataServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttpOptions(value: Timeout): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setRetryDelayOptions(value: js.Any): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    }
  }
}
