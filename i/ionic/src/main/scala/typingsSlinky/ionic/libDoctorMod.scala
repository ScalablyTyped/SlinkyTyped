package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor", JSImport.Namespace)
@js.native
object libDoctorMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.CordovaPlatformsCommitted
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.DefaultCordovaBundleIdUsed
  
  @js.native
  class GitConfigInvalid ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.GitConfigInvalid
  
  @js.native
  class GitNotUsed ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.GitNotUsed
  
  @js.native
  class IonicCLIInstalledLocally ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.IonicCLIInstalledLocally
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.IonicNativeOldVersionInstalled
  
  @js.native
  class NpmInstalledLocally ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.NpmInstalledLocally
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.UnsavedCordovaPlatforms
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsSlinky.ionic.libDoctorAilmentsMod.ViewportFitNotSet
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

