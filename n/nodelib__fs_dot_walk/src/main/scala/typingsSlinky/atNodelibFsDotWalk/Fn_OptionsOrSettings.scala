package typingsSlinky.atNodelibFsDotWalk

import typingsSlinky.atNodelibFsDotScandir.outSettingsMod.Options
import typingsSlinky.atNodelibFsDotScandir.outSettingsMod.default
import typingsSlinky.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsOrSettings extends js.Object {
  def apply(path: String): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
}

