package typingsSlinky.aureliaTemplating.mod

import typingsSlinky.aureliaLoader.mod.TemplateRegistryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "TemplateRegistryViewStrategy")
@js.native
class TemplateRegistryViewStrategy protected () extends js.Object {
  /**
    * Creates an instance of TemplateRegistryViewStrategy.
    * @param moduleId The associated moduleId of the view to be loaded.
    * @param entry The template registry entry used in loading the view factory.
    */
  def this(moduleId: String, entry: TemplateRegistryEntry) = this()
  
  /**
    * Loads a view factory.
    * @param viewEngine The view engine to use during the load process.
    * @param compileInstruction Additional instructions to use during compilation of the view.
    * @param loadContext The loading context used for loading all resources and dependencies.
    * @param target A class from which to extract metadata of additional resources to load.
    * @return A promise for the view factory that is produced by this strategy.
    */
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: js.UndefOr[scala.Nothing],
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
}
