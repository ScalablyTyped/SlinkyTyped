package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ink.appMod.Props
import typingsSlinky.ink.appMod.default
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  @scala.inline
  def apply(
    exitOnCtrlC: Boolean,
    onExit: js.UndefOr[js.Error] => Unit,
    stderr: WriteStream,
    stdin: ReadStream,
    stdout: WriteStream,
    writeToStderr: String => Unit,
    writeToStdout: String => Unit
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], onExit = js.Any.fromFunction1(onExit), stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], writeToStderr = js.Any.fromFunction1(writeToStderr), writeToStdout = js.Any.fromFunction1(writeToStdout))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("ink/build/components/App", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
