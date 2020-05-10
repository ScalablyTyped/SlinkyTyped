package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.AnonSegmentThreshold
import typingsSlinky.arangodb.arangodbStrings.arangosearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArangoSearchViewProperties extends js.Object {
  var cleanupIntervalStep: Double = js.native
  var consolidationIntervalMsec: Double = js.native
  var consolidationPolicy: AnonSegmentThreshold = js.native
  var id: String = js.native
  var links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = js.native
  var name: String = js.native
  var `type`: arangosearch = js.native
}

object ArangoSearchViewProperties {
  @scala.inline
  def apply(
    cleanupIntervalStep: Double,
    consolidationIntervalMsec: Double,
    consolidationPolicy: AnonSegmentThreshold,
    id: String,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]],
    name: String,
    `type`: arangosearch
  ): ArangoSearchViewProperties = {
    val __obj = js.Dynamic.literal(cleanupIntervalStep = cleanupIntervalStep.asInstanceOf[js.Any], consolidationIntervalMsec = consolidationIntervalMsec.asInstanceOf[js.Any], consolidationPolicy = consolidationPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArangoSearchViewProperties]
  }
  @scala.inline
  implicit class ArangoSearchViewPropertiesOps[Self <: ArangoSearchViewProperties] (val x: Self) extends AnyVal {
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
    def withConsolidationIntervalMsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationIntervalMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsolidationPolicy(value: AnonSegmentThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consolidationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: arangosearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

