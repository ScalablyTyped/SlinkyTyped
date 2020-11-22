package typingsSlinky.mendixmodelsdk.mod.navigation

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
class HomePage protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.HomePage {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
object HomePage extends js.Object {
  
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
  
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * The new HomePage will be automatically stored in the 'homePage' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile): typingsSlinky.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
