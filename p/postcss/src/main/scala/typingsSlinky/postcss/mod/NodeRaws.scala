package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeRaws extends js.Object {
  /**
    * The space symbols after the last child of the node to the end of
    * the node.
    */
  var after: js.UndefOr[String] = js.native
  /**
    * The space between the at-rule's name and parameters.
    */
  var afterName: js.UndefOr[String] = js.native
  /**
    * The space symbols before the node. It also stores `*` and `_`
    * symbols before the declaration (IE hack).
    */
  var before: js.UndefOr[String] = js.native
  /**
    * The symbols between the property and value for declarations,
    * selector and "{" for rules, last parameter and "{" for at-rules.
    */
  var between: js.UndefOr[String] = js.native
  /**
    * The content of important statement, if it is not just "!important".
    */
  var important: js.UndefOr[String] = js.native
  /**
    * The space symbols between "/ *" and comment's text.
    */
  var left: js.UndefOr[String] = js.native
  /**
    * The space symbols between comment's text and "*\/".
    */
  var right: js.UndefOr[String] = js.native
  /**
    * True if last child has (optional) semicolon.
    */
  var semicolon: js.UndefOr[Boolean] = js.native
}

object NodeRaws {
  @scala.inline
  def apply(): NodeRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeRaws]
  }
  @scala.inline
  implicit class NodeRawsOps[Self <: NodeRaws] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterName")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBetween(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.undefined)
        ret
    }
    @scala.inline
    def withImportant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolon")(js.undefined)
        ret
    }
  }
  
}

