package typingsSlinky.hapiVision.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View Manager
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#view-manager}
  */
@js.native
trait ViewManager extends js.Object {
  
  /**
    * Registers a helper, on all configured engines that have a registerHelper() method, for use during template rendering.
    * Engines without a registerHelper() method will be skipped.
    * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
    * @param name
    * @param helper
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerregisterhelpername-helper}
    */
  def registerHelper(name: String, helper: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /**
    * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
    */
  def render(template: String): js.Promise[String] = js.native
  def render(template: String, context: js.UndefOr[scala.Nothing], options: ServerViewsConfiguration): js.Promise[String] = js.native
  def render(template: String, context: js.Any): js.Promise[String] = js.native
  def render(template: String, context: js.Any, options: ServerViewsConfiguration): js.Promise[String] = js.native
  /**
    * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
    */
  @JSName("render")
  var render_Original: RenderMethod = js.native
}
