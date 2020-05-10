package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWafExpressionSet extends js.Object {
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic
    * suffix like &quot;stable&quot; is particularly useful if a policy likes
    * to avail newer set of expressions without having to change the policy. A
    * given alias name can&#39;t be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of available expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaWafExpressionSetExpression]] = js.native
  /**
    * Google specified expression set ID. The format should be: - E.g.
    * XSS-20170329
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaWafExpressionSet {
  @scala.inline
  def apply(): SchemaWafExpressionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSet]
  }
  @scala.inline
  implicit class SchemaWafExpressionSetOps[Self <: SchemaWafExpressionSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressions(value: js.Array[SchemaWafExpressionSetExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

