package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsSlinky.awsSdk.configMod.APIVersions
import typingsSlinky.awsSdk.configMod.GlobalConfigInstance
import typingsSlinky.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import typingsSlinky.awsSdk.coreMod.Config
import typingsSlinky.awsSdk.credentialProviderChainMod.provider
import typingsSlinky.awsSdk.credentialsMod.CredentialsOptions
import typingsSlinky.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import typingsSlinky.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import typingsSlinky.awsSdk.metadataServiceMod.MetadataServiceOptions
import typingsSlinky.awsSdk.processCredentialsMod.ProcessCredentialsOptions
import typingsSlinky.awsSdk.remoteCredentialsMod.RemoteCredentialsOptions
import typingsSlinky.awsSdk.samlCredentialsMod.SAMLCredentialsParams
import typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions
import typingsSlinky.awsSdk.sharedIniFileCredentialsMod.SharedIniFileCredentialsOptions
import typingsSlinky.awsSdk.temporaryCredentialsMod.TemporaryCredentials.TemporaryCredentialsOptions
import typingsSlinky.awsSdk.webIdentityCredentialsMod.WebIdentityCredentials.WebIdentityCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("aws-sdk/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-sdk/global", "ChainableTemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    */
  class ChainableTemporaryCredentials ()
    extends typingsSlinky.awsSdk.coreMod.ChainableTemporaryCredentials {
    def this(options: ChainableTemporaryCredentialsOptions) = this()
  }
  // Needed to expose interfaces on the class
  object ChainableTemporaryCredentials
  
  @JSImport("aws-sdk/global", "CognitoIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    */
  class CognitoIdentityCredentials ()
    extends typingsSlinky.awsSdk.coreMod.CognitoIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuration.
      */
    def this(options: CognitoIdentityOptions) = this()
    def this(
      options: CognitoIdentityOptions,
      clientConfig: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions
    ) = this()
  }
  // Needed to expose interfaces on the class
  object CognitoIdentityCredentials
  
  @JSImport("aws-sdk/global", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  class Config_ () extends Config {
    def this(options: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
  }
  
  @JSImport("aws-sdk/global", "ConfigurationOptions")
  @js.native
  abstract class ConfigurationOptions ()
    extends typingsSlinky.awsSdk.coreMod.ConfigurationOptions
  
  @JSImport("aws-sdk/global", "CredentialProviderChain")
  @js.native
  /**
    * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
    */
  class CredentialProviderChain ()
    extends typingsSlinky.awsSdk.coreMod.CredentialProviderChain {
    def this(providers: js.Array[provider]) = this()
  }
  /* static members */
  object CredentialProviderChain {
    
    @JSImport("aws-sdk/global", "CredentialProviderChain")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/global", "CredentialProviderChain.defaultProviders")
    @js.native
    def defaultProviders: js.Array[provider] = js.native
    @scala.inline
    def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "Credentials")
  @js.native
  class Credentials protected ()
    extends typingsSlinky.awsSdk.coreMod.Credentials {
    /**
      * Creates a Credentials object with a given set of credential information as an options hash.
      *
      * @param {object} options - An option hash containing a set of credential information.
      */
    def this(options: CredentialsOptions) = this()
    /**
      * Creates a Credentials object with a given set of credential information as positional arguments.
      *          *
      * @param {string} accessKeyId - The AWS access key ID.
      * @param {string} secretAccessKey - The AWS secret access key.
      * @param {string} sessionToken - The optional AWS session token.
      */
    def this(accessKeyId: String, secretAccessKey: String) = this()
    def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
  }
  /* static members */
  object Credentials {
    
    @JSImport("aws-sdk/global", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/global", "Credentials.expiryWindow")
    @js.native
    def expiryWindow: Double = js.native
    @scala.inline
    def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "EC2MetadataCredentials")
  @js.native
  /**
  		 * Creates credentials from the metadata service on an EC2 instance.
  		 * @param {object} options - Override the default (1s) timeout period.
  		 */
  class EC2MetadataCredentials ()
    extends typingsSlinky.awsSdk.coreMod.EC2MetadataCredentials {
    def this(options: EC2MetadataCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "ECSCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class ECSCredentials ()
    extends typingsSlinky.awsSdk.coreMod.ECSCredentials {
    def this(options: ECSCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typingsSlinky.awsSdk.coreMod.Endpoint {
    /**
      * Constructs a new endpoint given an endpoint URL.
      */
    def this(url: String) = this()
  }
  
  @JSImport("aws-sdk/global", "EnvironmentCredentials")
  @js.native
  class EnvironmentCredentials protected ()
    extends typingsSlinky.awsSdk.coreMod.EnvironmentCredentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
  object EventListeners {
    
    object Core {
      
      @JSImport("aws-sdk/global", "EventListeners.Core.HTTP_DATA")
      @js.native
      def HTTP_DATA(): Unit = js.native
      
      @JSImport("aws-sdk/global", "EventListeners.Core.SEND")
      @js.native
      def SEND(): Unit = js.native
      
      @JSImport("aws-sdk/global", "EventListeners.Core.VALIDATE_CREDENTIALS")
      @js.native
      def VALIDATE_CREDENTIALS(): Unit = js.native
      
      @JSImport("aws-sdk/global", "EventListeners.Core.VALIDATE_PARAMETERS")
      @js.native
      def VALIDATE_PARAMETERS(): Unit = js.native
      
      @JSImport("aws-sdk/global", "EventListeners.Core.VALIDATE_REGION")
      @js.native
      def VALIDATE_REGION(): Unit = js.native
      
      @JSImport("aws-sdk/global", "EventListeners.Core.removeListener")
      @js.native
      def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
    }
  }
  
  @JSImport("aws-sdk/global", "FileSystemCredentials")
  @js.native
  class FileSystemCredentials protected ()
    extends typingsSlinky.awsSdk.coreMod.FileSystemCredentials {
    /**
      * Creates a new FileSystemCredentials object from a filename.
      * @param {string} filename - The path on disk to the JSON file to load.
      */
    def this(filename: String) = this()
  }
  
  @JSImport("aws-sdk/global", "HttpRequest")
  @js.native
  class HttpRequest protected ()
    extends typingsSlinky.awsSdk.coreMod.HttpRequest {
    /**
      * Constructs HttpRequest object with provided endpoint and region
      */
    def this(endpoint: typingsSlinky.awsSdk.endpointMod.Endpoint, region: String) = this()
  }
  
  @JSImport("aws-sdk/global", "HttpResponse")
  @js.native
  class HttpResponse ()
    extends typingsSlinky.awsSdk.coreMod.HttpResponse
  
  @JSImport("aws-sdk/global", "IniLoader")
  @js.native
  class IniLoader ()
    extends typingsSlinky.awsSdk.coreMod.IniLoader
  
  @JSImport("aws-sdk/global", "MetadataService")
  @js.native
  /**
    * Creates a new MetadataService object with a given set of options.
    */
  class MetadataService ()
    extends typingsSlinky.awsSdk.coreMod.MetadataService {
    def this(options: MetadataServiceOptions) = this()
  }
  /* static members */
  object MetadataService {
    
    @JSImport("aws-sdk/global", "MetadataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 169.254.169.254
      */
    @JSImport("aws-sdk/global", "MetadataService.host")
    @js.native
    def host: String = js.native
    @scala.inline
    def host_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("host")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-sdk/global", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  class ProcessCredentials ()
    extends typingsSlinky.awsSdk.coreMod.ProcessCredentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "RemoteCredentials")
  @js.native
  /**
    * Represents credentials received.
    * @param {object} options - Override the default (1s) timeout period.
    */
  class RemoteCredentials ()
    extends typingsSlinky.awsSdk.coreMod.RemoteCredentials {
    def this(options: RemoteCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "Request")
  @js.native
  class Request[D, E] protected ()
    extends typingsSlinky.awsSdk.coreMod.Request[D, E] {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: typingsSlinky.awsSdk.serviceMod.Service, operation: String) = this()
    def this(service: typingsSlinky.awsSdk.serviceMod.Service, operation: String, params: js.Any) = this()
  }
  
  @JSImport("aws-sdk/global", "Response")
  @js.native
  class Response[D, E] ()
    extends typingsSlinky.awsSdk.coreMod.Response[D, E]
  
  @JSImport("aws-sdk/global", "SAMLCredentials")
  @js.native
  class SAMLCredentials protected ()
    extends typingsSlinky.awsSdk.coreMod.SAMLCredentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
  }
  
  @JSImport("aws-sdk/global", "Service")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class Service ()
    extends typingsSlinky.awsSdk.coreMod.Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  class SharedIniFileCredentials ()
    extends typingsSlinky.awsSdk.coreMod.SharedIniFileCredentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "TemporaryCredentials")
  @js.native
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class TemporaryCredentials ()
    extends typingsSlinky.awsSdk.coreMod.TemporaryCredentials {
    /**
      * Creates a new temporary credentials object.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
      */
    def this(options: TemporaryCredentialsOptions) = this()
    def this(
      options: TemporaryCredentialsOptions,
      masterCredentials: typingsSlinky.awsSdk.credentialsMod.Credentials
    ) = this()
  }
  // Needed to expose interfaces on the class
  object TemporaryCredentials
  
  @JSImport("aws-sdk/global", "TokenFileWebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  class TokenFileWebIdentityCredentials ()
    extends typingsSlinky.awsSdk.coreMod.TokenFileWebIdentityCredentials {
    def this(clientConfig: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions) = this()
  }
  
  @JSImport("aws-sdk/global", "WebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object.
    * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    */
  class WebIdentityCredentials ()
    extends typingsSlinky.awsSdk.coreMod.WebIdentityCredentials {
    /**
      * Creates a new credentials object with optional configuraion.
      * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
      * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
      */
    def this(options: WebIdentityCredentialsOptions) = this()
    def this(
      options: WebIdentityCredentialsOptions,
      clientConfig: typingsSlinky.awsSdk.configBaseMod.ConfigurationOptions
    ) = this()
  }
  // Needed to expose interfaces on the class
  object WebIdentityCredentials
  
  @JSImport("aws-sdk/global", "config")
  @js.native
  def config: GlobalConfigInstance = js.native
  @scala.inline
  def config_=(x: GlobalConfigInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
}
