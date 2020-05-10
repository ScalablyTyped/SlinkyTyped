package typingsSlinky.postcssReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default plugin options
  */
@js.native
trait DefaultOptions extends js.Object {
  /**
    * If true, no exclamatory triangle icons will be printed next to warnings.
    * @default false
    */
  var noIcon: js.UndefOr[Boolean] = js.native
  /**
    * If true, plugin names will not be printed in brackets after messages.
    * @default false
    */
  var noPlugin: js.UndefOr[Boolean] = js.native
  /**
    * If false, messages will not be sorted by line/column position.
    * @default true
    */
  var sortByPosition: js.UndefOr[Boolean] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPlugin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPlugin")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortByPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByPosition")(js.undefined)
        ret
    }
  }
  
}

