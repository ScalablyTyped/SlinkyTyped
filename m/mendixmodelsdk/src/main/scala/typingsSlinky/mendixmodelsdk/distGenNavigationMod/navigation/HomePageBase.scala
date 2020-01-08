package typingsSlinky.mendixmodelsdk.distGenNavigationMod.navigation

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  @JSName("model")
  var model_FHomePageBase: IModel = js.native
  def containerAsNavigationProfile(): NavigationProfile = js.native
  def microflow(): IMicroflow | Null = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Any(): js.Any = js.native
  def page(): IPage | Null = js.native
  def page(newValue: IPage): js.Any = js.native
  def pageQualifiedName(): String | Null = js.native
  @JSName("page")
  def page_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

