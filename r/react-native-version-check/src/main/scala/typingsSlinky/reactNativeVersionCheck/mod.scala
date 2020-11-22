package typingsSlinky.reactNativeVersionCheck

import typingsSlinky.reactNativeVersionCheck.anon.AppID
import typingsSlinky.reactNativeVersionCheck.anon.CurrentVersion
import typingsSlinky.reactNativeVersionCheck.anon.FetchOptions
import typingsSlinky.reactNativeVersionCheck.anon.IgnoreErrors
import typingsSlinky.reactNativeVersionCheck.anon.IsNeeded
import typingsSlinky.reactNativeVersionCheck.anon.PackageName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-version-check", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * Returns url of App Store of app.
      */
    def getAppStoreUrl(): js.Promise[String] = js.native
    def getAppStoreUrl(option: IgnoreErrors): js.Promise[String] = js.native
    
    /**
      * Returns device's country code of 2 characters.
      */
    def getCountry(): js.Promise[String] = js.native
    
    /**
      * Returns current app build number.
      */
    def getCurrentBuildNumber(): Double = js.native
    
    /**
      * Returns current app version.
      */
    def getCurrentVersion(): String = js.native
    
    /**
      * Returns the latest app version parsed from url. Returns null when parsing error occurs.
      */
    def getLatestVersion(): js.Promise[String] = js.native
    def getLatestVersion(option: FetchOptions): js.Promise[String] = js.native
    
    /**
      * Returns package name of app.
      */
    def getPackageName(): String = js.native
    
    /**
      * Returns url of Play Store of app.
      */
    def getPlayStoreUrl(): js.Promise[String] = js.native
    def getPlayStoreUrl(option: PackageName): js.Promise[String] = js.native
    
    /**
      * Returns url of Play Market or App Store of app.
      */
    def getStoreUrl(): js.Promise[String] = js.native
    def getStoreUrl(option: AppID): js.Promise[String] = js.native
    
    /**
      * Returns an object contains with boolean value whether update needed, current version and latest version.
      * Current and the latest app versions are first split by delimiter, and check each split numbers into depth.
      */
    def needUpdate(): js.Promise[IsNeeded] = js.native
    def needUpdate(option: CurrentVersion): js.Promise[IsNeeded] = js.native
  }
}
