package typingsSlinky.frctlFractal.mod.fractal

import typingsSlinky.frctlFractal.anon.ClifractalFractal
import typingsSlinky.frctlFractal.anon.Current
import typingsSlinky.frctlFractal.anon.Description
import typingsSlinky.frctlFractal.mod.CliTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.cli")
@js.native
object cli extends js.Object {
  
  @js.native
  class Cli () extends js.Object {
    
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ js.Any, /* done */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ js.Any, /* done */ js.Function0[Unit], Unit],
      opts: String
    ): Unit = js.native
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ js.Any, /* done */ js.Function0[Unit], Unit],
      opts: Description
    ): Unit = js.native
    
    var console: Console = js.native
    
    def error(message: String): Unit = js.native
    
    def exec(command: String): Unit = js.native
    
    def get(command: String): js.Any = js.native
    
    def has(command: String): Boolean = js.native
    
    def isInteractive(): Boolean = js.native
    
    def log(message: String): Unit = js.native
    
    @JSName("notify")
    var notify_FCli: Notifier = js.native
  }
  
  @js.native
  class Console () extends js.Object {
    
    def box(): this.type = js.native
    def box(header: js.UndefOr[scala.Nothing], body: js.UndefOr[scala.Nothing], footer: String): this.type = js.native
    def box(header: js.UndefOr[scala.Nothing], body: js.Array[String]): this.type = js.native
    def box(header: js.UndefOr[scala.Nothing], body: js.Array[String], footer: String): this.type = js.native
    def box(header: String): this.type = js.native
    def box(header: String, body: js.UndefOr[scala.Nothing], footer: String): this.type = js.native
    def box(header: String, body: js.Array[String]): this.type = js.native
    def box(header: String, body: js.Array[String], footer: String): this.type = js.native
    
    def br(): this.type = js.native
    
    def clear(): this.type = js.native
    
    def columns(data: js.Any): this.type = js.native
    def columns(data: js.Any, options: js.Any): this.type = js.native
    
    def debug(text: String): this.type = js.native
    def debug(text: String, data: js.Any): this.type = js.native
    
    def debugMode(status: Boolean): Unit = js.native
    
    def dump(data: js.Any): Unit = js.native
    
    def error(err: String, data: js.Error): this.type = js.native
    def error(err: js.Error): this.type = js.native
    
    def isSlogging(): Boolean = js.native
    
    def log(text: String): this.type = js.native
    
    def persist(): this.type = js.native
    
    def slog(): this.type = js.native
    
    def success(text: String): this.type = js.native
    
    var theme: CliTheme = js.native
    
    def unslog(): this.type = js.native
    
    def update(text: String): this.type = js.native
    def update(text: String, `type`: String): this.type = js.native
    
    def warn(text: String): this.type = js.native
    
    def write(str: String): Unit = js.native
    def write(str: String, `type`: String): Unit = js.native
  }
  
  @js.native
  class Notifier () extends js.Object {
    
    def updateAvailable(details: Current): Unit = js.native
    
    def versionMismatch(details: typingsSlinky.frctlFractal.anon.Cli): Unit = js.native
  }
}
