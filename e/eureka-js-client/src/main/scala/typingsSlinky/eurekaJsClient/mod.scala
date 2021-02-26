package typingsSlinky.eurekaJsClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eurekaJsClient.anon.Debug
import typingsSlinky.eurekaJsClient.mod.EurekaClient.EurekaConfig
import typingsSlinky.eurekaJsClient.mod.EurekaClient.EurekaInstanceConfig
import typingsSlinky.eurekaJsClient.mod.EurekaClient.EurekaMiddlewareConfig
import typingsSlinky.eurekaJsClient.mod.EurekaClient.EurekaYmlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eureka-js-client", "Eureka")
  @js.native
  class Eureka protected () extends StObject {
    def this(config: EurekaConfig) = this()
    def this(config: EurekaMiddlewareConfig) = this()
    def this(config: EurekaYmlConfig) = this()
    
    def getInstancesByAppId(appId: String): js.Array[EurekaInstanceConfig] = js.native
    
    def getInstancesByVipAddress(vidAddress: String): js.Array[EurekaInstanceConfig] = js.native
    
    def start(): Unit = js.native
    def start(cb: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(cb: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]): Unit = js.native
  }
  
  object EurekaClient {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.ADDED
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MODIFIED
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DELETED
    */
    trait ActionType extends StObject
    object ActionType {
      
      @scala.inline
      def ADDED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.ADDED = "ADDED".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.ADDED]
      
      @scala.inline
      def DELETED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DELETED]
      
      @scala.inline
      def MODIFIED: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MODIFIED = "MODIFIED".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MODIFIED]
    }
    
    @js.native
    trait DataCenterInfo extends StObject {
      
      var `@class`: js.UndefOr[String] = js.native
      
      var name: DataCenterName = js.native
    }
    object DataCenterInfo {
      
      @scala.inline
      def apply(name: DataCenterName): DataCenterInfo = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataCenterInfo]
      }
      
      @scala.inline
      implicit class DataCenterInfoMutableBuilder[Self <: DataCenterInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `set@class`(value: String): Self = StObject.set(x, "@class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `set@classUndefined`: Self = StObject.set(x, "@class", js.undefined)
        
        @scala.inline
        def setName(value: DataCenterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Netflix
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Amazon
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MyOwn
    */
    trait DataCenterName extends StObject
    object DataCenterName {
      
      @scala.inline
      def Amazon: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Amazon = "Amazon".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Amazon]
      
      @scala.inline
      def MyOwn: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MyOwn = "MyOwn".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MyOwn]
      
      @scala.inline
      def Netflix: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Netflix = "Netflix".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Netflix]
    }
    
    @js.native
    trait EurekaClientConfig extends StObject {
      
      var clusterRefreshInterval: js.UndefOr[Boolean] = js.native
      
      var fetchMetadata: js.UndefOr[Boolean] = js.native
      
      var fetchRegistry: js.UndefOr[Boolean] = js.native
      
      var filterUpInstances: js.UndefOr[Boolean] = js.native
      
      var heartbeatInterval: js.UndefOr[Double] = js.native
      
      var host: js.UndefOr[String] = js.native
      
      var maxRetries: js.UndefOr[Double] = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      var preferIpAddress: js.UndefOr[Boolean] = js.native
      
      var preferSameZone: js.UndefOr[Boolean] = js.native
      
      var registerWithEureka: js.UndefOr[Boolean] = js.native
      
      var registryFetchInterval: js.UndefOr[Double] = js.native
      
      var requestRetryDelay: js.UndefOr[Double] = js.native
      
      var servicePath: js.UndefOr[String] = js.native
      
      var serviceUrls: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
      
      var ssl: js.UndefOr[Boolean] = js.native
      
      var useDns: js.UndefOr[Boolean] = js.native
      
      var useLocalMetadata: js.UndefOr[Boolean] = js.native
    }
    object EurekaClientConfig {
      
      @scala.inline
      def apply(): EurekaClientConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EurekaClientConfig]
      }
      
      @scala.inline
      implicit class EurekaClientConfigMutableBuilder[Self <: EurekaClientConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClusterRefreshInterval(value: Boolean): Self = StObject.set(x, "clusterRefreshInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClusterRefreshIntervalUndefined: Self = StObject.set(x, "clusterRefreshInterval", js.undefined)
        
        @scala.inline
        def setFetchMetadata(value: Boolean): Self = StObject.set(x, "fetchMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetchMetadataUndefined: Self = StObject.set(x, "fetchMetadata", js.undefined)
        
        @scala.inline
        def setFetchRegistry(value: Boolean): Self = StObject.set(x, "fetchRegistry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFetchRegistryUndefined: Self = StObject.set(x, "fetchRegistry", js.undefined)
        
        @scala.inline
        def setFilterUpInstances(value: Boolean): Self = StObject.set(x, "filterUpInstances", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUpInstancesUndefined: Self = StObject.set(x, "filterUpInstances", js.undefined)
        
        @scala.inline
        def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
        
        @scala.inline
        def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        @scala.inline
        def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setPreferIpAddress(value: Boolean): Self = StObject.set(x, "preferIpAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreferIpAddressUndefined: Self = StObject.set(x, "preferIpAddress", js.undefined)
        
        @scala.inline
        def setPreferSameZone(value: Boolean): Self = StObject.set(x, "preferSameZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreferSameZoneUndefined: Self = StObject.set(x, "preferSameZone", js.undefined)
        
        @scala.inline
        def setRegisterWithEureka(value: Boolean): Self = StObject.set(x, "registerWithEureka", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegisterWithEurekaUndefined: Self = StObject.set(x, "registerWithEureka", js.undefined)
        
        @scala.inline
        def setRegistryFetchInterval(value: Double): Self = StObject.set(x, "registryFetchInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistryFetchIntervalUndefined: Self = StObject.set(x, "registryFetchInterval", js.undefined)
        
        @scala.inline
        def setRequestRetryDelay(value: Double): Self = StObject.set(x, "requestRetryDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestRetryDelayUndefined: Self = StObject.set(x, "requestRetryDelay", js.undefined)
        
        @scala.inline
        def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
        
        @scala.inline
        def setServiceUrls(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "serviceUrls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUrlsUndefined: Self = StObject.set(x, "serviceUrls", js.undefined)
        
        @scala.inline
        def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
        
        @scala.inline
        def setUseDns(value: Boolean): Self = StObject.set(x, "useDns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseDnsUndefined: Self = StObject.set(x, "useDns", js.undefined)
        
        @scala.inline
        def setUseLocalMetadata(value: Boolean): Self = StObject.set(x, "useLocalMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseLocalMetadataUndefined: Self = StObject.set(x, "useLocalMetadata", js.undefined)
      }
    }
    
    @js.native
    trait EurekaConfig extends StObject {
      
      var eureka: EurekaClientConfig = js.native
      
      var instance: EurekaInstanceConfig = js.native
      
      var logger: js.UndefOr[Debug] = js.native
      
      var requestMiddleware: js.UndefOr[
            js.Function2[/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit], Unit]
          ] = js.native
      
      var shouldUseDelta: js.UndefOr[Boolean] = js.native
    }
    object EurekaConfig {
      
      @scala.inline
      def apply(eureka: EurekaClientConfig, instance: EurekaInstanceConfig): EurekaConfig = {
        val __obj = js.Dynamic.literal(eureka = eureka.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
        __obj.asInstanceOf[EurekaConfig]
      }
      
      @scala.inline
      implicit class EurekaConfigMutableBuilder[Self <: EurekaConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEureka(value: EurekaClientConfig): Self = StObject.set(x, "eureka", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstance(value: EurekaInstanceConfig): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
        
        @scala.inline
        def setRequestMiddleware(value: (/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit]) => Unit): Self = StObject.set(x, "requestMiddleware", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRequestMiddlewareUndefined: Self = StObject.set(x, "requestMiddleware", js.undefined)
        
        @scala.inline
        def setShouldUseDelta(value: Boolean): Self = StObject.set(x, "shouldUseDelta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldUseDeltaUndefined: Self = StObject.set(x, "shouldUseDelta", js.undefined)
      }
    }
    
    @js.native
    trait EurekaInstanceConfig extends StObject {
      
      var actionType: js.UndefOr[ActionType] = js.native
      
      var app: String = js.native
      
      var appGroupName: js.UndefOr[String] = js.native
      
      var countryId: js.UndefOr[Double] = js.native
      
      var dataCenterInfo: DataCenterInfo = js.native
      
      var healthCheckUrl: js.UndefOr[String] = js.native
      
      var homePageUrl: js.UndefOr[String] = js.native
      
      var hostName: String = js.native
      
      var instanceId: js.UndefOr[String] = js.native
      
      var ipAddr: String = js.native
      
      var isCoordinatingDiscoveryServer: js.UndefOr[Boolean] = js.native
      
      var lastDirtyTimestamp: js.UndefOr[Double] = js.native
      
      var lastUpdatedTimestamp: js.UndefOr[Double] = js.native
      
      var leaseInfo: js.UndefOr[LeaseInfo] = js.native
      
      var metadata: js.UndefOr[StringDictionary[String]] = js.native
      
      var overriddenstatus: js.UndefOr[InstanceStatus] = js.native
      
      var port: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
      
      var secureHealthCheckUrl: js.UndefOr[String] = js.native
      
      var securePort: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
      
      var secureVipAddress: js.UndefOr[String] = js.native
      
      var sid: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[InstanceStatus] = js.native
      
      var statusPageUrl: js.UndefOr[String] = js.native
      
      var vipAddress: String = js.native
    }
    object EurekaInstanceConfig {
      
      @scala.inline
      def apply(app: String, dataCenterInfo: DataCenterInfo, hostName: String, ipAddr: String, vipAddress: String): EurekaInstanceConfig = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], dataCenterInfo = dataCenterInfo.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], ipAddr = ipAddr.asInstanceOf[js.Any], vipAddress = vipAddress.asInstanceOf[js.Any])
        __obj.asInstanceOf[EurekaInstanceConfig]
      }
      
      @scala.inline
      implicit class EurekaInstanceConfigMutableBuilder[Self <: EurekaInstanceConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionType(value: ActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
        
        @scala.inline
        def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppGroupName(value: String): Self = StObject.set(x, "appGroupName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppGroupNameUndefined: Self = StObject.set(x, "appGroupName", js.undefined)
        
        @scala.inline
        def setCountryId(value: Double): Self = StObject.set(x, "countryId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryIdUndefined: Self = StObject.set(x, "countryId", js.undefined)
        
        @scala.inline
        def setDataCenterInfo(value: DataCenterInfo): Self = StObject.set(x, "dataCenterInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHealthCheckUrl(value: String): Self = StObject.set(x, "healthCheckUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHealthCheckUrlUndefined: Self = StObject.set(x, "healthCheckUrl", js.undefined)
        
        @scala.inline
        def setHomePageUrl(value: String): Self = StObject.set(x, "homePageUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHomePageUrlUndefined: Self = StObject.set(x, "homePageUrl", js.undefined)
        
        @scala.inline
        def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
        
        @scala.inline
        def setIpAddr(value: String): Self = StObject.set(x, "ipAddr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCoordinatingDiscoveryServer(value: Boolean): Self = StObject.set(x, "isCoordinatingDiscoveryServer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCoordinatingDiscoveryServerUndefined: Self = StObject.set(x, "isCoordinatingDiscoveryServer", js.undefined)
        
        @scala.inline
        def setLastDirtyTimestamp(value: Double): Self = StObject.set(x, "lastDirtyTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastDirtyTimestampUndefined: Self = StObject.set(x, "lastDirtyTimestamp", js.undefined)
        
        @scala.inline
        def setLastUpdatedTimestamp(value: Double): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
        
        @scala.inline
        def setLeaseInfo(value: LeaseInfo): Self = StObject.set(x, "leaseInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaseInfoUndefined: Self = StObject.set(x, "leaseInfo", js.undefined)
        
        @scala.inline
        def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setOverriddenstatus(value: InstanceStatus): Self = StObject.set(x, "overriddenstatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverriddenstatusUndefined: Self = StObject.set(x, "overriddenstatus", js.undefined)
        
        @scala.inline
        def setPort(value: Double | PortWrapper | LegacyPortWrapper): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setSecureHealthCheckUrl(value: String): Self = StObject.set(x, "secureHealthCheckUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureHealthCheckUrlUndefined: Self = StObject.set(x, "secureHealthCheckUrl", js.undefined)
        
        @scala.inline
        def setSecurePort(value: Double | PortWrapper | LegacyPortWrapper): Self = StObject.set(x, "securePort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecurePortUndefined: Self = StObject.set(x, "securePort", js.undefined)
        
        @scala.inline
        def setSecureVipAddress(value: String): Self = StObject.set(x, "secureVipAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureVipAddressUndefined: Self = StObject.set(x, "secureVipAddress", js.undefined)
        
        @scala.inline
        def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
        
        @scala.inline
        def setStatus(value: InstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusPageUrl(value: String): Self = StObject.set(x, "statusPageUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusPageUrlUndefined: Self = StObject.set(x, "statusPageUrl", js.undefined)
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setVipAddress(value: String): Self = StObject.set(x, "vipAddress", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EurekaMiddlewareConfig extends StObject {
      
      def requestMiddleware(requestOpts: js.Any, done: js.Function1[/* opts */ js.Any, Unit]): Unit = js.native
    }
    object EurekaMiddlewareConfig {
      
      @scala.inline
      def apply(requestMiddleware: (js.Any, js.Function1[/* opts */ js.Any, Unit]) => Unit): EurekaMiddlewareConfig = {
        val __obj = js.Dynamic.literal(requestMiddleware = js.Any.fromFunction2(requestMiddleware))
        __obj.asInstanceOf[EurekaMiddlewareConfig]
      }
      
      @scala.inline
      implicit class EurekaMiddlewareConfigMutableBuilder[Self <: EurekaMiddlewareConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequestMiddleware(value: (js.Any, js.Function1[/* opts */ js.Any, Unit]) => Unit): Self = StObject.set(x, "requestMiddleware", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait EurekaYmlConfig extends StObject {
      
      var cwd: String = js.native
      
      var filename: js.UndefOr[String] = js.native
    }
    object EurekaYmlConfig {
      
      @scala.inline
      def apply(cwd: String): EurekaYmlConfig = {
        val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
        __obj.asInstanceOf[EurekaYmlConfig]
      }
      
      @scala.inline
      implicit class EurekaYmlConfigMutableBuilder[Self <: EurekaYmlConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UP
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DOWN
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.STARTING
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE
      - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UNKNOWN
    */
    trait InstanceStatus extends StObject
    object InstanceStatus {
      
      @scala.inline
      def DOWN: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DOWN = "DOWN".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.DOWN]
      
      @scala.inline
      def OUT_OF_SERVICE: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE = "OUT_OF_SERVICE".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE]
      
      @scala.inline
      def STARTING: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.STARTING]
      
      @scala.inline
      def UNKNOWN: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UNKNOWN]
      
      @scala.inline
      def UP: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UP = "UP".asInstanceOf[typingsSlinky.eurekaJsClient.eurekaJsClientStrings.UP]
    }
    
    @js.native
    trait LeaseInfo extends StObject {
      
      var durationInSecs: js.UndefOr[Double] = js.native
      
      var evictionTimestamp: js.UndefOr[Double] = js.native
      
      var lastRenewalTimestamp: js.UndefOr[Double] = js.native
      
      var registrationTimestamp: js.UndefOr[Double] = js.native
      
      var renewalIntervalInSecs: js.UndefOr[Double] = js.native
      
      var serviceUpTimestamp: js.UndefOr[Double] = js.native
    }
    object LeaseInfo {
      
      @scala.inline
      def apply(): LeaseInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LeaseInfo]
      }
      
      @scala.inline
      implicit class LeaseInfoMutableBuilder[Self <: LeaseInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDurationInSecs(value: Double): Self = StObject.set(x, "durationInSecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurationInSecsUndefined: Self = StObject.set(x, "durationInSecs", js.undefined)
        
        @scala.inline
        def setEvictionTimestamp(value: Double): Self = StObject.set(x, "evictionTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvictionTimestampUndefined: Self = StObject.set(x, "evictionTimestamp", js.undefined)
        
        @scala.inline
        def setLastRenewalTimestamp(value: Double): Self = StObject.set(x, "lastRenewalTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastRenewalTimestampUndefined: Self = StObject.set(x, "lastRenewalTimestamp", js.undefined)
        
        @scala.inline
        def setRegistrationTimestamp(value: Double): Self = StObject.set(x, "registrationTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistrationTimestampUndefined: Self = StObject.set(x, "registrationTimestamp", js.undefined)
        
        @scala.inline
        def setRenewalIntervalInSecs(value: Double): Self = StObject.set(x, "renewalIntervalInSecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenewalIntervalInSecsUndefined: Self = StObject.set(x, "renewalIntervalInSecs", js.undefined)
        
        @scala.inline
        def setServiceUpTimestamp(value: Double): Self = StObject.set(x, "serviceUpTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUpTimestampUndefined: Self = StObject.set(x, "serviceUpTimestamp", js.undefined)
      }
    }
    
    @js.native
    trait LegacyPortWrapper extends StObject {
      
      @JSName("$")
      var $: Double = js.native
      
      var `@enabled`: Boolean = js.native
    }
    object LegacyPortWrapper {
      
      @scala.inline
      def apply($: Double, `@enabled`: Boolean): LegacyPortWrapper = {
        val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
        __obj.updateDynamic("@enabled")(`@enabled`.asInstanceOf[js.Any])
        __obj.asInstanceOf[LegacyPortWrapper]
      }
      
      @scala.inline
      implicit class LegacyPortWrapperMutableBuilder[Self <: LegacyPortWrapper] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$(value: Double): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `set@enabled`(value: Boolean): Self = StObject.set(x, "@enabled", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PortWrapper extends StObject {
      
      var enabled: Boolean = js.native
      
      var port: Double = js.native
    }
    object PortWrapper {
      
      @scala.inline
      def apply(enabled: Boolean, port: Double): PortWrapper = {
        val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[PortWrapper]
      }
      
      @scala.inline
      implicit class PortWrapperMutableBuilder[Self <: PortWrapper] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      }
    }
  }
}
