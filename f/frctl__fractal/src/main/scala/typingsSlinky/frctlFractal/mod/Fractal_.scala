package typingsSlinky.frctlFractal.mod

import typingsSlinky.frctlFractal.mod.fractal.api.assets.AssetSourceCollection
import typingsSlinky.frctlFractal.mod.fractal.api.components.ComponentSource
import typingsSlinky.frctlFractal.mod.fractal.api.docs.DocSource
import typingsSlinky.frctlFractal.mod.fractal.cli.Cli
import typingsSlinky.frctlFractal.mod.fractal.core.mixins.ConfigurableEmitter
import typingsSlinky.frctlFractal.mod.fractal.web.Web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "Fractal")
@js.native
class Fractal_ () extends ConfigurableEmitter[FractalConfig] {
  def this(config: FractalConfig) = this()
  
  val assets: AssetSourceCollection = js.native
  
  val cli: Cli = js.native
  
  val components: ComponentSource = js.native
  
  val debug: Boolean = js.native
  
  val docs: DocSource = js.native
  
  def extend(plugin: String): this.type = js.native
  def extend(plugin: js.ThisFunction1[/* this */ this.type, /* core */ js.Any, Unit]): this.type = js.native
  
  def load(): js.Promise[Unit] = js.native
  
  def unwatch(): this.type = js.native
  
  val version: String = js.native
  
  def watch(): this.type = js.native
  
  val web: Web = js.native
}
