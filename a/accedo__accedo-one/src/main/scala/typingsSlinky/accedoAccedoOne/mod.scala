package typingsSlinky.accedoAccedoOne

import typingsSlinky.accedoAccedoOne.anon.Alpha2Code
import typingsSlinky.accedoAccedoOne.anon.DeviceId
import typingsSlinky.accedoAccedoOne.anon.Locales
import typingsSlinky.accedoAccedoOne.anon.PickAccedoEntryParamsprev
import typingsSlinky.accedoAccedoOne.anon.ReadonlyDetails
import typingsSlinky.accedoAccedoOne.mod.AccedoLog.Level
import typingsSlinky.accedoAccedoOne.mod.AccedoLog.Logobject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@accedo/accedo-one", JSImport.Namespace)
  @js.native
  def apply(config: AccedoConfig): AccedoClient = js.native
  
  object AccedoLog {
    
    @js.native
    sealed trait Level extends StObject
    @JSImport("@accedo/accedo-one", "AccedoLog.Level")
    @js.native
    object Level extends StObject {
      
      @js.native
      sealed trait DEBUG extends Level
      
      @js.native
      sealed trait ERROR extends Level
      
      @js.native
      sealed trait INFO extends Level
      
      @js.native
      sealed trait WARN extends Level
    }
    
    @js.native
    trait Details extends StObject {
      
      /** The dimension 1 information */
      var dim1: js.UndefOr[String] = js.native
      
      /** The dimension 2 information */
      var dim2: js.UndefOr[String] = js.native
      
      /** The dimension 3 information */
      var dim3: js.UndefOr[String] = js.native
      
      /** The dimension 4 information */
      var dim4: js.UndefOr[String] = js.native
      
      /** The error code (max 5 digits) */
      var errorCode: js.UndefOr[Double] = js.native
      
      /** The log message */
      var message: String = js.native
    }
    object Details {
      
      @scala.inline
      def apply(message: String): Details = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[Details]
      }
      
      @scala.inline
      implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDim1(value: String): Self = StObject.set(x, "dim1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDim1Undefined: Self = StObject.set(x, "dim1", js.undefined)
        
        @scala.inline
        def setDim2(value: String): Self = StObject.set(x, "dim2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDim2Undefined: Self = StObject.set(x, "dim2", js.undefined)
        
        @scala.inline
        def setDim3(value: String): Self = StObject.set(x, "dim3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDim3Undefined: Self = StObject.set(x, "dim3", js.undefined)
        
        @scala.inline
        def setDim4(value: String): Self = StObject.set(x, "dim4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDim4Undefined: Self = StObject.set(x, "dim4", js.undefined)
        
        @scala.inline
        def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Logobject extends Details {
      
      /**
        * the log type
        */
      var logType: Level = js.native
      
      /** Extra metadata (will go through JSON.stringify) */
      var metadata: js.UndefOr[js.Any] = js.native
      
      /**
        * The timestamp for the log, as a UTC ISO 8601 string
        * (ie. '2016-07-04T06:17:21Z'), or a POSIX millisecond
        * number
        */
      var timestamp: String | Double = js.native
    }
    object Logobject {
      
      @scala.inline
      def apply(logType: Level, message: String, timestamp: String | Double): Logobject = {
        val __obj = js.Dynamic.literal(logType = logType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Logobject]
      }
      
      @scala.inline
      implicit class LogobjectMutableBuilder[Self <: Logobject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLogType(value: Level): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setTimestamp(value: String | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait AccedoClient extends StObject {
    
    var config: AccedoConfig = js.native
    
    /**
      * Create a session and store it for reuse in this client instance.
      * Note you do not usually need to worry about this. Other methods
      * will call it automatically for you when it is needed.
      *
      * @returns a Promise of a string, the sessionKey
      */
    def createSession(): js.Promise[String] = js.native
    
    /**
      * Get all the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @returns A promise of the requested data
      */
    def getAllApplicationGroupScopeDataByUser(userName: String): js.Promise[_] = js.native
    
    /**
      * Get all the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @returns A promise of the requested data
      */
    def getAllApplicationScopeDataByUser(userName: String): js.Promise[_] = js.native
    
    /**
      * Lists all the assets.
      *
      * @returns A promise of a hash of assets (key: asset name, value: asset URL)
      */
    def getAllAssets(): js.Promise[String] = js.native
    
    /**
      * Get all the enabled plugins
      *
      * @returns A promise of the requested data
      */
    def getAllEnabledPlugins(): js.Promise[_] = js.native
    
    /**
      * Get all the metadata
      *
      * @returns A promise of the requested data
      */
    def getAllMetadata(): js.Promise[_] = js.native
    
    /**
      * Get all the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @returns A promise of the requested data
      */
    def getApplicationGroupScopeDataByUserAndKey(userName: String, key: String): js.Promise[_] = js.native
    
    /**
      * Get all the application-scope data for a given user and data key
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      */
    def getApplicationScopeDataByUserAndKey(userName: String, key: String): js.Promise[_] = js.native
    
    /**
      * Get the current application status
      *
      * @returns A promise of the application status (string)
      */
    def getApplicationStatus(): js.Promise[String] = js.native
    
    /**
      * Get all the available locales
      *
      * @returns A promise of the requested data
      */
    def getAvailableLocales(): js.Promise[Locales] = js.native
    
    /**
      * Get all the content entries, based on the given parameters.
      * DO NOT use several of the id, alias, typeId and typeAlias
      * options at the same time - behaviour would be ungaranteed.
      *
      * @param params
      */
    def getEntries(): js.Promise[_] = js.native
    def getEntries(params: AccedoEntryParams): js.Promise[_] = js.native
    
    /**
      * Get one content entry, based on the given parameters.
      *
      * @param alias
      * @param params
      */
    def getEntryByAlias[A](alias: A): js.Promise[A] = js.native
    def getEntryByAlias[A](alias: A, params: PickAccedoEntryParamsprev): js.Promise[A] = js.native
    
    /**
      * Get one content entry by id, based on the given parameters.
      *
      * @param id
      * @param params
      */
    def getEntryById(id: String): js.Promise[_] = js.native
    def getEntryById(id: String, params: PickAccedoEntryParamsprev): js.Promise[_] = js.native
    
    /**
      * Get the current log level
      *
      * @returns a promise of the log level (string)
      */
    def getLogLevel(): js.Promise[Level] = js.native
    
    /**
      * Get the metadata by a specific key
      *
      * @param key a key to get specific metadata
      * @returns a promise of the requested data
      */
    def getMetadataByKey(key: String): js.Promise[_] = js.native
    
    /**
      * Get the metadata by specific keys
      *
      * @param keys an array of keys (strings)
      * @returns a promise of the requested data
      */
    def getMetadataByKeys(keys: js.Array[String]): js.Promise[_] = js.native
    
    /**
      * Get the profile information
      *
      * @returns A promise of the requested data
      */
    def getProfileInfo(): js.Promise[AccedoProfile] = js.native
    
    /**
      * Returns the currently stored sessionKey for this client instance
      *
      * @returns string: the sessionKey, if any
      */
    def getSessionKey(): String = js.native
    
    /**
      * NOTE: the behaviour varies when run on Node.js or on browsers.
      *
      * On Node.js, the log will be sent immediately.
      * On browsers: add the log to a queue so several logs may be sent
      * as a batch, when a predefined total size is reached or after a
      * debouncing delay. Whenever the user navigates away, the SDK will
      * also attempt to send any queued-up log.
      *
      * If the current log level is high enough, lower level logs will be ignored.
      *
      * @param level the log level
      * @param details the log information
      * @param metadata extra metadata (will go through JSON.stringify). Can be passed as any number of trailing arguments.
      */
    def sendLog(level: Level, details: ReadonlyDetails): js.Promise[Boolean] = js.native
    def sendLog(level: Level, details: ReadonlyDetails, metadata: js.Any): js.Promise[Boolean] = js.native
    
    /**
      * Send batched logs, each with its own level, timestamp, details and extra metadata.
      * Note that on browsers, the other method, sendLog, is more convenient as it will
      * auto-batch logs for you.
      *
      * @param logs
      * @returns A promise of the success of the operation
      */
    def sendLogs(logs: js.Array[Logobject]): js.Promise[Boolean] = js.native
    
    /**
      * Send a usage START event
      *
      * @returns A promise denoting the success of the operation
      */
    def sendUsageStartEvent(): js.Promise[Boolean] = js.native
    
    /**
      * Send a usage QUIT event
      *
      * @param retentionTimeInSeconds the retention time, in seconds
      * @returns A promise denoting the success of the operation
      */
    def sendUsageStopEvent(): js.Promise[Boolean] = js.native
    def sendUsageStopEvent(retentionTimeInSeconds: String): js.Promise[Boolean] = js.native
    def sendUsageStopEvent(retentionTimeInSeconds: Double): js.Promise[Boolean] = js.native
    
    /**
      * Set the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationGroupScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-group-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationGroupScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
    
    /**
      * Set the application-scope data for a given user
      *
      * @param userName an Accedo One user
      * @param key a key to specify what data to obtain
      * @param data the data to store
      * @returns A promise of the requested data
      */
    def setApplicationScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
  }
  
  @js.native
  trait AccedoConfig extends StObject {
    
    /** The application Key */
    var appKey: String = js.native
    
    /**
      * A function that should return an object with deviceId and
      * sessionKey properties, saved from previous sessions (see
      * onDeviceIdGenerated, onSessionKeyChanged)
      */
    var browserInfoProvider: js.UndefOr[js.Function0[DeviceId]] = js.native
    
    /** The device identifier (if not provided, a uuid will be generated instead) */
    var deviceId: js.UndefOr[String] = js.native
    
    /** the user's IP, given to Accedo One for every request this client will trigger (for geolocation). */
    var ip: js.UndefOr[String] = js.native
    
    /** A function to use to see this SDK's logs */
    var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    /** Callback to obtain the new deviceId, if one gets generated */
    var onDeviceIdGenerated: js.UndefOr[js.Function1[/* deviceId */ String, Unit]] = js.native
    
    /** Callback to obtain the sessionKey, anytime a new one gets generated */
    var onSessionKeyChanged: js.UndefOr[js.Function1[/* sessionKey */ String, Unit]] = js.native
    
    /** The sessionKey (note a new one may be created when not given or expired) */
    var sessionKey: js.UndefOr[String] = js.native
    
    /** All APIs calls will use this as the base API URL (defaults to the Accedo One API URL) */
    var target: js.UndefOr[String] = js.native
  }
  object AccedoConfig {
    
    @scala.inline
    def apply(appKey: String): AccedoConfig = {
      val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoConfig]
    }
    
    @scala.inline
    implicit class AccedoConfigMutableBuilder[Self <: AccedoConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserInfoProvider(value: () => DeviceId): Self = StObject.set(x, "browserInfoProvider", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBrowserInfoProviderUndefined: Self = StObject.set(x, "browserInfoProvider", js.undefined)
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setOnDeviceIdGenerated(value: /* deviceId */ String => Unit): Self = StObject.set(x, "onDeviceIdGenerated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeviceIdGeneratedUndefined: Self = StObject.set(x, "onDeviceIdGenerated", js.undefined)
      
      @scala.inline
      def setOnSessionKeyChanged(value: /* sessionKey */ String => Unit): Self = StObject.set(x, "onSessionKeyChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSessionKeyChangedUndefined: Self = StObject.set(x, "onSessionKeyChanged", js.undefined)
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait AccedoEntryParams extends StObject {
    
    /** an array of entry aliases (strings) */
    var alias: js.UndefOr[js.Array[String]] = js.native
    
    /** when given, get the version at the given time */
    var at: js.UndefOr[String | js.Date] = js.native
    
    /** an array of entry ids (strings) */
    var id: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * if available, get the version for the given locale
      * (defaults to the default locale)
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Offset the result by that many pages */
    var offset: js.UndefOr[Double | String] = js.native
    
    /** when true, get the preview version */
    var preview: js.UndefOr[Boolean] = js.native
    
    /**
      * Limit to that many results per page (limits as per Accedo
      * One API, currently 1 to 50, default 20)
      */
    var size: js.UndefOr[Double | String] = js.native
    
    /** only return entries whose entry type has this alias */
    var typeAlias: js.UndefOr[String] = js.native
    
    /** only return entries of the given type ids (strings) */
    var typeId: js.UndefOr[js.Array[String]] = js.native
  }
  object AccedoEntryParams {
    
    @scala.inline
    def apply(): AccedoEntryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccedoEntryParams]
    }
    
    @scala.inline
    implicit class AccedoEntryParamsMutableBuilder[Self <: AccedoEntryParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setAt(value: String | js.Date): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtDate(value: js.Date): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      @scala.inline
      def setId(value: js.Array[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdVarargs(value: String*): Self = StObject.set(x, "id", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTypeAlias(value: String): Self = StObject.set(x, "typeAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAliasUndefined: Self = StObject.set(x, "typeAlias", js.undefined)
      
      @scala.inline
      def setTypeId(value: js.Array[String]): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeIdUndefined: Self = StObject.set(x, "typeId", js.undefined)
      
      @scala.inline
      def setTypeIdVarargs(value: String*): Self = StObject.set(x, "typeId", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AccedoLocale extends StObject {
    
    var code: String = js.native
    
    var countryInfo: Alpha2Code = js.native
    
    var displayName: String = js.native
  }
  object AccedoLocale {
    
    @scala.inline
    def apply(code: String, countryInfo: Alpha2Code, displayName: String): AccedoLocale = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryInfo = countryInfo.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoLocale]
    }
    
    @scala.inline
    implicit class AccedoLocaleMutableBuilder[Self <: AccedoLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryInfo(value: Alpha2Code): Self = StObject.set(x, "countryInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccedoProfile extends StObject {
    
    var profileDescription: String = js.native
    
    var profileId: String = js.native
    
    var profileLastModified: String = js.native
    
    var profileName: String = js.native
  }
  object AccedoProfile {
    
    @scala.inline
    def apply(profileDescription: String, profileId: String, profileLastModified: String, profileName: String): AccedoProfile = {
      val __obj = js.Dynamic.literal(profileDescription = profileDescription.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], profileLastModified = profileLastModified.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccedoProfile]
    }
    
    @scala.inline
    implicit class AccedoProfileMutableBuilder[Self <: AccedoProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfileDescription(value: String): Self = StObject.set(x, "profileDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileLastModified(value: String): Self = StObject.set(x, "profileLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    }
  }
}
