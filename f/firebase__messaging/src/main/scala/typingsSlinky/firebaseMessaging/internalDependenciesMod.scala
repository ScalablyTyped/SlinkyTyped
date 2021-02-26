package typingsSlinky.firebaseMessaging

import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import typingsSlinky.firebaseMessaging.appConfigMod.AppConfig
import typingsSlinky.firebaseMessaging.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalDependenciesMod {
  
  @js.native
  trait FirebaseInternalDependencies extends StObject {
    
    var analyticsProvider: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
      ] = js.native
    
    var app: FirebaseApp = js.native
    
    var appConfig: AppConfig = js.native
    
    var installations: FirebaseInstallations = js.native
  }
  object FirebaseInternalDependencies {
    
    @scala.inline
    def apply(
      analyticsProvider: Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
        ],
      app: FirebaseApp,
      appConfig: AppConfig,
      installations: FirebaseInstallations
    ): FirebaseInternalDependencies = {
      val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseInternalDependencies]
    }
    
    @scala.inline
    implicit class FirebaseInternalDependenciesMutableBuilder[Self <: FirebaseInternalDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsProvider(
        value: Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
            ]
      ): Self = StObject.set(x, "analyticsProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallations(value: FirebaseInstallations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    }
  }
}
