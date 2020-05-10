package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A criteria that matches a specific string of text in a shape or table.
  */
@js.native
trait SchemaSubstringMatchCriteria extends js.Object {
  /**
    * Indicates whether the search should respect case:  - `True`: the search
    * is case sensitive. - `False`: the search is case insensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * The text to search for in the shape or table.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaSubstringMatchCriteria {
  @scala.inline
  def apply(): SchemaSubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubstringMatchCriteria]
  }
  @scala.inline
  implicit class SchemaSubstringMatchCriteriaOps[Self <: SchemaSubstringMatchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

