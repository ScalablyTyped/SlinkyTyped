package typingsSlinky.jupyterlabApputils.windowresolverMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindowResolver extends js.Object {
  /**
    * A window name to use as a handle among shared resources.
    */
  val name: String = js.native
}

@JSImport("@jupyterlab/apputils/lib/windowresolver", "IWindowResolver")
@js.native
object IWindowResolver extends TopLevel[Token[IWindowResolver]]

