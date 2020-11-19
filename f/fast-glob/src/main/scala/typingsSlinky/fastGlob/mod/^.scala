package typingsSlinky.fastGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): js.Promise[js.Array[String]] = js.native
  def apply(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastGlob.typesMod.Entry]] = js.native
  def apply(source: typingsSlinky.fastGlob.typesMod.Pattern): js.Promise[js.Array[String]] = js.native
  def apply(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastGlob.typesMod.Entry]] = js.native
}
