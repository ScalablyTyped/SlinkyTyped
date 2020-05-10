package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A section contains a collection of widgets that are rendered (vertically)
  * in the order that they are specified. Across all platforms, cards have a
  * narrow fixed width, so there is currently no need for layout properties
  * (e.g. float).
  */
@js.native
trait SchemaSection extends js.Object {
  /**
    * The header of the section, text formatted supported.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[SchemaWidgetMarkup]] = js.native
}

object SchemaSection {
  @scala.inline
  def apply(): SchemaSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSection]
  }
  @scala.inline
  implicit class SchemaSectionOps[Self <: SchemaSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgets(value: js.Array[SchemaWidgetMarkup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(js.undefined)
        ret
    }
  }
  
}

