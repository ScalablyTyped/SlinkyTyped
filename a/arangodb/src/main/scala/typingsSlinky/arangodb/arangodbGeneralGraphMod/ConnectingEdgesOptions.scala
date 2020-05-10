package typingsSlinky.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectingEdgesOptions extends js.Object {
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var edgeExamples: js.UndefOr[Example] = js.native
  var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
}

object ConnectingEdgesOptions {
  @scala.inline
  def apply(): ConnectingEdgesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectingEdgesOptions]
  }
  @scala.inline
  implicit class ConnectingEdgesOptionsOps[Self <: ConnectingEdgesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgeCollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeCollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCollectionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeExamples(value: Example): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeExamplesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(null)
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

