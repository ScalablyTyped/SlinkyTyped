package typingsSlinky.mimos.mod

import typingsSlinky.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimosOptionsValue extends MimeEntry {
  /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
  var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValue, MimosOptionsValue]] = js.native
  /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
  var `type`: js.UndefOr[String] = js.native
}

object MimosOptionsValue {
  @scala.inline
  def apply(): MimosOptionsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimosOptionsValue]
  }
  @scala.inline
  implicit class MimosOptionsValueOps[Self <: MimosOptionsValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredicate(value: /* mime */ MimosOptionsValue => MimosOptionsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

