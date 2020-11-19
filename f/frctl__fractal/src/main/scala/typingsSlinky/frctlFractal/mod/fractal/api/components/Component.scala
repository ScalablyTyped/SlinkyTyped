package typingsSlinky.frctlFractal.mod.fractal.api.components

import typingsSlinky.frctlFractal.frctlFractalBooleans.`true`
import typingsSlinky.frctlFractal.mod.fractal.api.assets.AssetCollection
import typingsSlinky.frctlFractal.mod.fractal.api.files.FileCollection
import typingsSlinky.frctlFractal.mod.fractal.api.variants.VariantCollection
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.api.components.Component")
@js.native
class Component protected () extends Entity {
  def this(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity) = this()
  
  val baseHandle: String = js.native
  
  def component(): this.type = js.native
  
  var configData: String = js.native
  
  val content: String = js.native
  
  var defaultName: String = js.native
  
  var editorMode: String = js.native
  
  var editorScope: String = js.native
  
  def flatten(): VariantCollection = js.native
  
  def getPreviewContent(): js.Promise[String] = js.native
  
  def getPreviewContext(): js.Promise[_] = js.native
  
  def hasTag(tag: String): Boolean = js.native
  
  val isAsset: js.UndefOr[scala.Nothing] = js.native
  
  def isCollated(): Boolean = js.native
  
  @JSName("isCollection")
  val isCollection_Component: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("isComponent")
  val isComponent_Component: `true` = js.native
  
  @JSName("isDoc")
  val isDoc_Component: js.UndefOr[scala.Nothing] = js.native
  
  val isFile: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("isVariant")
  val isVariant_Component: js.UndefOr[scala.Nothing] = js.native
  
  var lang: String = js.native
  
  val notes: String = js.native
  
  val referencedBy: js.Array[_] = js.native
  
  val references: js.Array[_] = js.native
  
  var relViewPath: String = js.native
  
  def render(context: js.Any, env: js.Any, opts: js.Any): js.Promise[String] = js.native
  
  def resources(): AssetCollection = js.native
  
  def resourcesJSON(): js.Object = js.native
  
  def setVariants(variantCollection: VariantCollection): Unit = js.native
  
  def variants(): VariantCollection = js.native
  
  var viewDir: String = js.native
  
  var viewPath: String = js.native
}
/* static members */
@JSImport("@frctl/fractal", "fractal.api.components.Component")
@js.native
object Component extends js.Object {
  
  def create(config: js.Object, files: FileCollection, resources: AssetCollection, parent: Entity): IterableIterator[js.Object | VariantCollection | Component] = js.native
}
