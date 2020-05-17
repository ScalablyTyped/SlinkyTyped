package typingsSlinky.commonTags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conjunction extends js.Object {
  var conjunction: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var serial: js.UndefOr[Boolean] = js.native
}

object Conjunction {
  @scala.inline
  def apply(): Conjunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conjunction]
  }
  @scala.inline
  implicit class ConjunctionOps[Self <: Conjunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConjunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(js.undefined)
        ret
    }
  }
  
}

