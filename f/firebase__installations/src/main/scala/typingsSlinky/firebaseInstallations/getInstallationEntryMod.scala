package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.InstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstallationEntryMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/get-installation-entry", "getInstallationEntry")
  @js.native
  def getInstallationEntry(appConfig: AppConfig): js.Promise[InstallationEntryWithRegistrationPromise] = js.native
  
  @js.native
  trait InstallationEntryWithRegistrationPromise extends StObject {
    
    var installationEntry: InstallationEntry = js.native
    
    /** Exist iff the installationEntry is not registered. */
    var registrationPromise: js.UndefOr[js.Promise[RegisteredInstallationEntry]] = js.native
  }
  object InstallationEntryWithRegistrationPromise {
    
    @scala.inline
    def apply(installationEntry: InstallationEntry): InstallationEntryWithRegistrationPromise = {
      val __obj = js.Dynamic.literal(installationEntry = installationEntry.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallationEntryWithRegistrationPromise]
    }
    
    @scala.inline
    implicit class InstallationEntryWithRegistrationPromiseMutableBuilder[Self <: InstallationEntryWithRegistrationPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallationEntry(value: InstallationEntry): Self = StObject.set(x, "installationEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationPromise(value: js.Promise[RegisteredInstallationEntry]): Self = StObject.set(x, "registrationPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationPromiseUndefined: Self = StObject.set(x, "registrationPromise", js.undefined)
    }
  }
}
