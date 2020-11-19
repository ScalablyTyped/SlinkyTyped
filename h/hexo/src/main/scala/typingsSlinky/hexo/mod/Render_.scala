package typingsSlinky.hexo.mod

import typingsSlinky.hexo.mod.Render.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render_ extends js.Object {
  
  /**
    * Get the Output Extension
    */
  def getOutput(path: String): String = js.native
  
  /**
    * Check whether a file is renderable synchronously.
    */
  def isRenderable(path: String): Boolean = js.native
  
  /**
    * Check whether a file is renderable.
    */
  def isRenderableSync(path: String): Boolean = js.native
  
  def render(data: Data): js.Promise[String] = js.native
  def render(data: Data, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  def render(
    data: Data,
    option: js.UndefOr[scala.Nothing],
    fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]
  ): js.Promise[String] = js.native
  def render(data: Data, option: js.Any): js.Promise[String] = js.native
  def render(data: Data, option: js.Any, fn: js.Function2[/* err */ js.Any, /* result */ String, Unit]): js.Promise[String] = js.native
  
  def renderSync(data: Data): String = js.native
  def renderSync(data: Data, option: js.Any): String = js.native
}
