package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing an equation.
  */
@js.native
trait SchemaEquation extends js.Object {
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A Equation may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaEquation {
  @scala.inline
  def apply(): SchemaEquation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEquation]
  }
  @scala.inline
  implicit class SchemaEquationOps[Self <: SchemaEquation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestedDeletionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDeletionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedInsertionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedInsertionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionIds")(js.undefined)
        ret
    }
  }
  
}

