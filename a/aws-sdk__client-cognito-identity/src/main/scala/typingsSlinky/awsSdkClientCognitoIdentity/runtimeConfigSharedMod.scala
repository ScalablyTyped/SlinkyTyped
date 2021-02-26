package typingsSlinky.awsSdkClientCognitoIdentity

import typingsSlinky.awsSdkTypes.loggerMod.Logger
import typingsSlinky.awsSdkTypes.utilMod.RegionInfo
import typingsSlinky.awsSdkTypes.utilMod.RegionInfoProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigSharedMod {
  
  object ClientSharedValues {
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.apiVersion")
    @js.native
    def apiVersion: String = js.native
    @scala.inline
    def apiVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.disableHostPrefix")
    @js.native
    def disableHostPrefix: Boolean = js.native
    @scala.inline
    def disableHostPrefix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHostPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.logger")
    @js.native
    def logger: Logger = js.native
    @scala.inline
    def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.regionInfoProvider")
    @js.native
    def regionInfoProvider: RegionInfoProvider = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.regionInfoProvider")
    @js.native
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.regionInfoProvider")
    @js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @scala.inline
    def regionInfoProvider_=(x: RegionInfoProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionInfoProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.signingName")
    @js.native
    def signingName: String = js.native
    @scala.inline
    def signingName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signingName")(x.asInstanceOf[js.Any])
  }
}
