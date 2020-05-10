package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Entity linking expression
			 */
@js.native
trait LinkEntityExposedExpression extends js.Object {
  /**
  				 * The 'alias' for the link-entity relationship
  				 */
  var alias: String = js.native
  /**
  				 * The 'from' attribute in the link-entity relationship
  				 */
  var from: String = js.native
  /**
  				 * The 'type' of the link, referred by the link-entity attribute
  				 */
  var linkType: String = js.native
  /**
  				 * The 'name' of the entity to link to
  				 */
  var name: String = js.native
  /**
  				 * The 'to' attribute in the link-entity relationship
  				 */
  var to: String = js.native
}

object LinkEntityExposedExpression {
  @scala.inline
  def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkEntityExposedExpression]
  }
  @scala.inline
  implicit class LinkEntityExposedExpressionOps[Self <: LinkEntityExposedExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

