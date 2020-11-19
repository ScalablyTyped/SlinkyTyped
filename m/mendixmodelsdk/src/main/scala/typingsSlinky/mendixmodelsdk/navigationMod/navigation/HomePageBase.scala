package typingsSlinky.mendixmodelsdk.navigationMod.navigation

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
abstract class HomePageBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsNavigationProfile: NavigationProfile = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FHomePageBase: IModel = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
