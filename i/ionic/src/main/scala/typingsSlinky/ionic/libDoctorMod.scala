package typingsSlinky.ionic

import typingsSlinky.ionic.ailmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.definitionsMod.IAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor", JSImport.Namespace)
@js.native
object libDoctorMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typingsSlinky.ionic.ailmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsSlinky.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsSlinky.ionic.ailmentsMod.CordovaPlatformsCommitted
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsSlinky.ionic.ailmentsMod.DefaultCordovaBundleIdUsed
  
  @js.native
  class GitConfigInvalid ()
    extends typingsSlinky.ionic.ailmentsMod.GitConfigInvalid
  
  @js.native
  class GitNotUsed ()
    extends typingsSlinky.ionic.ailmentsMod.GitNotUsed
  
  @js.native
  class IonicCLIInstalledLocally ()
    extends typingsSlinky.ionic.ailmentsMod.IonicCLIInstalledLocally
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsSlinky.ionic.ailmentsMod.IonicNativeOldVersionInstalled
  
  @js.native
  class NpmInstalledLocally ()
    extends typingsSlinky.ionic.ailmentsMod.NpmInstalledLocally
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsSlinky.ionic.ailmentsMod.UnsavedCordovaPlatforms
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsSlinky.ionic.ailmentsMod.ViewportFitNotSet
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

