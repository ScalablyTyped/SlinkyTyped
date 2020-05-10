package typingsSlinky.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MozillaOptions extends js.Object {
  /**
    * Default: false
    */
  var comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var starlessGenerator: js.UndefOr[Boolean] = js.native
}

object MozillaOptions {
  @scala.inline
  def apply(): MozillaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MozillaOptions]
  }
  @scala.inline
  implicit class MozillaOptionsOps[Self <: MozillaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComprehensionExpressionStartsWithAssignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehensionExpressionStartsWithAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComprehensionExpressionStartsWithAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comprehensionExpressionStartsWithAssignment")(js.undefined)
        ret
    }
    @scala.inline
    def withParenthesizedComprehensionBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parenthesizedComprehensionBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParenthesizedComprehensionBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parenthesizedComprehensionBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withStarlessGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starlessGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarlessGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starlessGenerator")(js.undefined)
        ret
    }
  }
  
}

