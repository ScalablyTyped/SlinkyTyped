package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.INavigationProfile
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
@js.native
class NavigationSource protected () extends MenuSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.2.0: introduced
    */
  def navigationProfile: INavigationProfile = js.native
  
  def navigationProfileQualifiedName: String = js.native
  
  def navigationProfile_=(newValue: INavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: deleted
    */
  def profileType: ProfileType = js.native
  def profileType_=(newValue: ProfileType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
@js.native
object NavigationSource extends js.Object {
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NavigationSource = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * The new NavigationSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  def createIn(container: MenuWidget): NavigationSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
