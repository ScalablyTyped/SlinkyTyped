package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.ionicNumbers.`true`
import typingsSlinky.ionic.ionicStrings.`cordova-platforms-committed`
import typingsSlinky.ionic.ionicStrings.`default-cordova-bundle-id-used`
import typingsSlinky.ionic.ionicStrings.`git-config-invalid`
import typingsSlinky.ionic.ionicStrings.`git-not-used`
import typingsSlinky.ionic.ionicStrings.`ionic-installed-locally`
import typingsSlinky.ionic.ionicStrings.`ionic-native-old-version-installed`
import typingsSlinky.ionic.ionicStrings.`npm-installed-locally`
import typingsSlinky.ionic.ionicStrings.`unsaved-cordova-platforms`
import typingsSlinky.ionic.ionicStrings.`viewport-fit-not-set`
import typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
@js.native
object libDoctorAilmentsMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_CordovaPlatformsCommitted: `cordova-platforms-committed` = js.native
  }
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_DefaultCordovaBundleIdUsed: `default-cordova-bundle-id-used` = js.native
  }
  
  @js.native
  class GitConfigInvalid ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitConfigInvalid: `git-config-invalid` = js.native
  }
  
  @js.native
  class GitNotUsed ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitNotUsed: `git-not-used` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class IonicCLIInstalledLocally ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicCLIInstalledLocally: `ionic-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicNativeOldVersionInstalled: `ionic-native-old-version-installed` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionic.definitionsMod.IAilment because Already inherited
  - typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class NpmInstalledLocally ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_NpmInstalledLocally: `npm-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_UnsavedCordovaPlatforms: `unsaved-cordova-platforms` = js.native
  }
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.Ailment {
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

