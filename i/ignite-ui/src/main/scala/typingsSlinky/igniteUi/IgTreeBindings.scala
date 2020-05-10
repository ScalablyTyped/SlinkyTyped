package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeBindings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets the next layer of bindings in a recursive fashion.
  	 *
  	 */
  var bindings: js.UndefOr[IgTreeBindingsBindings] = js.native
  /**
  	 * Gets the name of the data source property the value of which would hold the node's
  	 * check state. The check state itself is represented by a string enumeration with the
  	 * checked|partially checked|unchecked states being respectively "on|partial|off".
  	 *
  	 */
  var checkedKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property that holds the child data of the current layer node.
  	 *
  	 */
  var childDataProperty: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the child data node. Used in client-only binding directly to XML.
  	 *
  	 */
  var childDataXPath: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would hold the node`s
  	 * expanded state. The expanded state is represented by a boolean.
  	 *
  	 */
  var expandedKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would be used as a URL for the node image.
  	 *
  	 */
  var imageUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the image URL attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var imageUrlXPath: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would be used as an href attribute for the node anchor.
  	 *
  	 */
  var navigateUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the navigate URL attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var navigateUrlXPath: js.UndefOr[String] = js.native
  /**
  	 * Gets the node content template for the current layer of bindings. The igTree utilizes igTemplating
  	 * for generating node content templates. A good example of how to setup templating can be found here http://www.infragistics.com/community/blogs/marina_stoyanova/archive/2014/06/17/how-to-use-templates-to-style-the-different-nodes-of-the-ignite-ui-tree-control.aspx
  	 *
  	 */
  var nodeContentTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which is the primary key attribute
  	 * for the data. This property is used when load on demand is enabled and if specified the node paths
  	 * would be generated using primary keys instead of indices.
  	 *
  	 */
  var primaryKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the root data node. Used in client-only binding directly to XML.
  	 *
  	 */
  var searchFieldXPath: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would be used as a target
  	 * attribute for the node anchor.
  	 *
  	 */
  var targetKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would be the node text.
  	 *
  	 */
  var textKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the text attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var textXPath: js.UndefOr[String] = js.native
  /**
  	 * Gets the name of the data source property the value of which would be the node value.
  	 *
  	 */
  var valueKey: js.UndefOr[String] = js.native
  /**
  	 * Gets the XPath to the value attribute/node. Used in client-only binding directly to XML.
  	 *
  	 */
  var valueXPath: js.UndefOr[String] = js.native
}

object IgTreeBindings {
  @scala.inline
  def apply(): IgTreeBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeBindings]
  }
  @scala.inline
  implicit class IgTreeBindingsOps[Self <: IgTreeBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: IgTreeBindingsBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withChildDataProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDataProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withChildDataXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDataXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataXPath")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrlXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrlXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlXPath")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateUrlXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrlXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateUrlXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrlXPath")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeContentTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeContentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchFieldXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFieldXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchFieldXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchFieldXPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTextXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textXPath")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValueXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueXPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueXPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueXPath")(js.undefined)
        ret
    }
  }
  
}

