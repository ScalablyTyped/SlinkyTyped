package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadataConfiguration extends js.Object {
  /**
    * The name of the index field.
    */
  var Name: DocumentMetadataConfigurationName = js.native
  /**
    * Provides manual tuning parameters to determine how the field affects the search results.
    */
  var Relevance: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Relevance] = js.native
  /**
    * Provides information about how the field is used during a search.
    */
  var Search: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Search] = js.native
  /**
    * The data type of the index field. 
    */
  var Type: DocumentAttributeValueType = js.native
}

object DocumentMetadataConfiguration {
  @scala.inline
  def apply(Name: DocumentMetadataConfigurationName, Type: DocumentAttributeValueType): DocumentMetadataConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadataConfiguration]
  }
  @scala.inline
  implicit class DocumentMetadataConfigurationOps[Self <: DocumentMetadataConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: DocumentMetadataConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DocumentAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelevance(value: Relevance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relevance")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Search")(js.undefined)
        ret
    }
  }
  
}

