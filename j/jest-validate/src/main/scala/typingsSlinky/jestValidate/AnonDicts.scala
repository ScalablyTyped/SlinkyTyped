package typingsSlinky.jestValidate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestValidate.typesMod.DeprecatedOptions
import typingsSlinky.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDicts extends /* s */ StringDictionary[Options] {
  var deprecationEntries: DeprecatedOptions = js.native
}

object AnonDicts {
  @scala.inline
  def apply(deprecationEntries: DeprecatedOptions): AnonDicts = {
    val __obj = js.Dynamic.literal(deprecationEntries = deprecationEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDicts]
  }
  @scala.inline
  implicit class AnonDictsOps[Self <: AnonDicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecationEntries(value: DeprecatedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationEntries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

