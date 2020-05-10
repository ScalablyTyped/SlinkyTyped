package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.arangodbStrings.id
import typingsSlinky.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArangoSearchViewCollectionLink extends js.Object {
  var analyzers: js.UndefOr[js.Array[String]] = js.native
  var fields: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.native
  var includeAllFields: js.UndefOr[Boolean] = js.native
  var storeValues: js.UndefOr[none | id] = js.native
  var trackListPositions: js.UndefOr[Boolean] = js.native
}

object ArangoSearchViewCollectionLink {
  @scala.inline
  def apply(): ArangoSearchViewCollectionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewCollectionLink]
  }
  @scala.inline
  implicit class ArangoSearchViewCollectionLinkOps[Self <: ArangoSearchViewCollectionLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzers")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAllFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllFields")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreValues(value: none | id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackListPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackListPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackListPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackListPositions")(js.undefined)
        ret
    }
  }
  
}

