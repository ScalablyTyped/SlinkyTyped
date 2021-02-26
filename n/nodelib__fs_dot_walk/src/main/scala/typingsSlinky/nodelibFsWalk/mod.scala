package typingsSlinky.nodelibFsWalk

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.nodelibFsWalk.asyncMod.AsyncCallback
import typingsSlinky.nodelibFsWalk.settingsMod.Options
import typingsSlinky.nodelibFsWalk.settingsMod.default
import typingsSlinky.nodelibFsWalk.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.walk", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  @JSImport("@nodelib/fs.walk", "walk")
  @js.native
  def walk(directory: String, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.walk", "walk")
  @js.native
  def walk(directory: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.walk", "walk")
  @js.native
  def walk(directory: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  
  @JSImport("@nodelib/fs.walk", "walkStream")
  @js.native
  def walkStream(directory: String): Readable = js.native
  @JSImport("@nodelib/fs.walk", "walkStream")
  @js.native
  def walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
  @JSImport("@nodelib/fs.walk", "walkStream")
  @js.native
  def walkStream(directory: String, optionsOrSettings: default): Readable = js.native
  
  @JSImport("@nodelib/fs.walk", "walkSync")
  @js.native
  def walkSync(directory: String): js.Array[Entry] = js.native
  @JSImport("@nodelib/fs.walk", "walkSync")
  @js.native
  def walkSync(directory: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  @JSImport("@nodelib/fs.walk", "walkSync")
  @js.native
  def walkSync(directory: String, optionsOrSettings: default): js.Array[Entry] = js.native
}
