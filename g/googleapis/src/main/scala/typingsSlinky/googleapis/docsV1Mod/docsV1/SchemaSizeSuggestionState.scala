package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Size have been
  * changed in this suggestion. For any field set to true, the Size has a new
  * suggested value.
  */
@js.native
trait SchemaSizeSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to height.
    */
  var heightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaSizeSuggestionState {
  @scala.inline
  def apply(): SchemaSizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizeSuggestionState]
  }
  @scala.inline
  implicit class SchemaSizeSuggestionStateOps[Self <: SchemaSizeSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSuggested")(js.undefined)
        ret
    }
  }
  
}

