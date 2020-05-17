package typingsSlinky.googleCloudPubsub.pubsubMod.google.`type`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Expr. */
@js.native
trait IExpr extends js.Object {
  /** Expr description */
  var description: js.UndefOr[String | Null] = js.native
  /** Expr expression */
  var expression: js.UndefOr[String | Null] = js.native
  /** Expr location */
  var location: js.UndefOr[String | Null] = js.native
  /** Expr title */
  var title: js.UndefOr[String | Null] = js.native
}

object IExpr {
  @scala.inline
  def apply(): IExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpr]
  }
  @scala.inline
  implicit class IExprOps[Self <: IExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(null)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

