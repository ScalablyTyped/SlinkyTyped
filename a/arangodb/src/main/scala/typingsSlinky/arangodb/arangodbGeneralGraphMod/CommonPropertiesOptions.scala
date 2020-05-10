package typingsSlinky.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonPropertiesOptions extends js.Object {
  var ignoredProperties: js.UndefOr[js.Array[String] | String] = js.native
  var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
}

object CommonPropertiesOptions {
  @scala.inline
  def apply(): CommonPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonPropertiesOptions]
  }
  @scala.inline
  implicit class CommonPropertiesOptionsOps[Self <: CommonPropertiesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoredProperties(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withVertex1CollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex1CollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertex1CollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex1CollectionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withVertex2CollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex2CollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertex2CollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex2CollectionRestriction")(js.undefined)
        ret
    }
  }
  
}

