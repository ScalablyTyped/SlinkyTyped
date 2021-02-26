package typingsSlinky.cmdShim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cmd-shim", JSImport.Namespace)
  @js.native
  def apply(from: String, to: String, cb: js.Function1[/* err */ js.Any, Unit]): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Create a cmd shim at `to` for the command line program at `from`, but will just
    * continue if the file does not exist.
    *
    *     var cmdShim = require('cmd-shim');
    *     cmdShim.ifExists(__dirname + '/cli.js', '/usr/bin/command-name', function (err) {
    *         if (err) throw err;
    *     });
    */
  @JSImport("cmd-shim", "ifExists")
  @js.native
  def ifExists(from: String, to: String, cb: js.Function1[/* err */ js.Any, Unit]): js.UndefOr[scala.Nothing] = js.native
}
