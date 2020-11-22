package typingsSlinky.mendixmodelsdk.navigationMod.navigation

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Project
import typingsSlinky.mendixmodelsdk.projectsMod.projects.ProjectDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IProjectDocument because Already inherited
- typingsSlinky.mendixmodelsdk.navigationMod.navigation.INavigationDocument because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected () extends ProjectDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  @JSName("containerAsProject")
  def containerAsProject_MNavigationDocument: Project = js.native
  
  /**
    * In version 7.2.0: deleted
    */
  def desktopProfile: NavigationProfile = js.native
  def desktopProfile_=(newValue: NavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  def hybridPhoneProfile: NavigationProfile = js.native
  
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  def hybridPhoneProfile6: NavigationProfile = js.native
  def hybridPhoneProfile6_=(newValue: NavigationProfile): Unit = js.native
  
  def hybridPhoneProfile_=(newValue: NavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  def hybridTabletProfile: NavigationProfile = js.native
  
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  def hybridTabletProfile6: NavigationProfile = js.native
  def hybridTabletProfile6_=(newValue: NavigationProfile): Unit = js.native
  
  def hybridTabletProfile_=(newValue: NavigationProfile): Unit = js.native
  
  /**
    * In version 7.0.2: deleted
    */
  def offlinePhoneProfile: NavigationProfile = js.native
  def offlinePhoneProfile_=(newValue: NavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: deleted
    */
  def phoneProfile: NavigationProfile = js.native
  def phoneProfile_=(newValue: NavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: introduced
    */
  def profiles: IList[NavigationProfileBase] = js.native
  /**
    * In version 7.2.0: introduced
    */
  @JSName("profiles")
  val profiles_FNavigationDocument: IList[INavigationProfileBase] = js.native
  
  /**
    * In version 7.2.0: deleted
    */
  def tabletProfile: NavigationProfile = js.native
  def tabletProfile_=(newValue: NavigationProfile): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): NavigationDocument = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
