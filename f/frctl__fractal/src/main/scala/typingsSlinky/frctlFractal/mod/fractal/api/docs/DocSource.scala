package typingsSlinky.frctlFractal.mod.fractal.api.docs

import typingsSlinky.frctlFractal.mod.fractal.api.files.File
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocSource extends EntitySource[Doc, DocConfig] {
  
  def docs(): this.type = js.native
  
  def isPage(file: String): Boolean = js.native
  
  def isTemplate(file: String): Boolean = js.native
  
  def pages(): this.type = js.native
  
  def render(page: String): js.Promise[String] = js.native
  def render(page: String, context: js.UndefOr[scala.Nothing], env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(page: String, context: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
  def render(page: String, context: js.UndefOr[scala.Nothing], env: js.Any, opts: js.Object): js.Promise[String] = js.native
  def render(page: String, context: js.Any): js.Promise[String] = js.native
  def render(page: String, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(page: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
  def render(page: String, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
  def render(page: File): js.Promise[String] = js.native
  def render(page: File, context: js.UndefOr[scala.Nothing], env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(page: File, context: js.UndefOr[scala.Nothing], env: js.Any): js.Promise[String] = js.native
  def render(page: File, context: js.UndefOr[scala.Nothing], env: js.Any, opts: js.Object): js.Promise[String] = js.native
  def render(page: File, context: js.Any): js.Promise[String] = js.native
  def render(page: File, context: js.Any, env: js.UndefOr[scala.Nothing], opts: js.Object): js.Promise[String] = js.native
  def render(page: File, context: js.Any, env: js.Any): js.Promise[String] = js.native
  def render(page: File, context: js.Any, env: js.Any, opts: js.Object): js.Promise[String] = js.native
  
  def renderString(str: String, context: js.Any): js.Promise[String] = js.native
  def renderString(str: String, context: js.Any, env: js.Any): js.Promise[String] = js.native
  
  def resolve(context: js.Any): js.Any = js.native
  
  def toc(page: File): js.Promise[String] = js.native
  def toc(page: File, maxDepth: Double): js.Promise[String] = js.native
}
