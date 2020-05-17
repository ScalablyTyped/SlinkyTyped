package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.anon.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[Double] = js.native
  var consolidationIntervalMsec: js.UndefOr[Double] = js.native
  var consolidationPolicy: js.UndefOr[Threshold] = js.native
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.native
}

object ArangoSearchViewPropertiesOptions {
  @scala.inline
  def apply(): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
  @scala.inline
  implicit class ArangoSearchViewPropertiesOptionsOps[Self <: ArangoSearchViewPropertiesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanupIntervalStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupIntervalStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupIntervalStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupIntervalStep")(js.undefined)
        ret
    }
    @scala.inline
    def withConsolidationIntervalMsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationIntervalMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsolidationIntervalMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationIntervalMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withConsolidationPolicy(value: Threshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsolidationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
  }
  
}

