package typingsSlinky.ecmarkup.biblioMod

import typingsSlinky.ecmarkup.ecmarkupStrings.op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmBiblioEntry
  extends BiblioEntryBase
     with BiblioEntry {
  @JSName("aoid")
  var aoid_AlgorithmBiblioEntry: String = js.native
  @JSName("type")
  var type_AlgorithmBiblioEntry: op = js.native
}

object AlgorithmBiblioEntry {
  @scala.inline
  def apply(aoid: String, referencingIds: js.Array[String], `type`: op): AlgorithmBiblioEntry = {
    val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmBiblioEntry]
  }
  @scala.inline
  implicit class AlgorithmBiblioEntryOps[Self <: AlgorithmBiblioEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAoid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: op): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

