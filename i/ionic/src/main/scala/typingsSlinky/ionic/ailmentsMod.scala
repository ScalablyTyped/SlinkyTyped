package typingsSlinky.ionic

import typingsSlinky.ionic.ailmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.definitionsMod.IAilment
import typingsSlinky.ionic.ionicStrings.`viewport-fit-not-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
@js.native
object ailmentsMod extends js.Object {
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
  
  @js.native
  abstract class Ailment protected ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsSlinky.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class GitConfigInvalid ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class GitNotUsed ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionic.definitionsMod.IAilment because Already inherited
  - typingsSlinky.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class IonicCLIInstalledLocally ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment {
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionic.definitionsMod.IAilment because Already inherited
  - typingsSlinky.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class NpmInstalledLocally ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment {
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsSlinky.ionic.ailmentsBaseMod.Ailment {
    
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
}
