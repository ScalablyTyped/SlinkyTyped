package typingsSlinky.fastGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", "sync")
@js.native
object sync extends js.Object {
  def apply(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): js.Array[String] = js.native
  def apply(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[typingsSlinky.fastGlob.typesMod.Entry] = js.native
  def apply(source: typingsSlinky.fastGlob.typesMod.Pattern): js.Array[String] = js.native
  def apply(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[typingsSlinky.fastGlob.typesMod.Entry] = js.native
}

