package typingsSlinky.nodelibFsWalk.anon

import typingsSlinky.nodelibFsScandir.settingsMod.Options
import typingsSlinky.nodelibFsScandir.settingsMod.default
import typingsSlinky.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(path: String): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
}
