package typingsSlinky.ionic

import typingsSlinky.ionic.ailmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.ionicAngularMod.IonicAngularProject
import typingsSlinky.ionic.libDoctorMod.Ailment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularAilmentsMod {
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsMajorUpdateAvailable")
  @js.native
  class AppScriptsMajorUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionic.definitionsMod.IAilment because Already inherited
  - typingsSlinky.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsUpdateAvailable")
  @js.native
  class AppScriptsUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularAilment")
  @js.native
  abstract class IonicAngularAilment protected () extends Ailment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    @JSName("project")
    val project_IonicAngularAilment: IonicAngularProject = js.native
    
    @JSName("projects")
    val projects_IonicAngularAilment: js.Array[ProjectType] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularMajorUpdateAvailable")
  @js.native
  class IonicAngularMajorUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularPackageJsonHasDefaultIonicBuildCommand")
  @js.native
  class IonicAngularPackageJsonHasDefaultIonicBuildCommand protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularPackageJsonHasDefaultIonicServeCommand")
  @js.native
  class IonicAngularPackageJsonHasDefaultIonicServeCommand protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularUpdateAvailable")
  @js.native
  class IonicAngularUpdateAvailable protected () extends IonicAngularAilment {
    def this(deps: IonicAngularAilmentDeps) = this()
    
    var currentVersion: js.UndefOr[String] = js.native
    
    def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
    
    var latestVersion: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait IonicAngularAilmentDeps extends AilmentDeps {
    
    @JSName("project")
    val project_IonicAngularAilmentDeps: IonicAngularProject = js.native
  }
  object IonicAngularAilmentDeps {
    
    @scala.inline
    def apply(
      client: IClient,
      config: IConfig,
      log: ILogger,
      project: IonicAngularProject,
      session: ISession,
      shell: IShell
    ): IonicAngularAilmentDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicAngularAilmentDeps]
    }
    
    @scala.inline
    implicit class IonicAngularAilmentDepsMutableBuilder[Self <: IonicAngularAilmentDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: IonicAngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
