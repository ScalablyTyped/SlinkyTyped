package typingsSlinky.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists Analytics custom data sources to which the user has access. Each
  * resource in the collection corresponds to a single Analytics custom data
  * source.
  */
@js.native
trait SchemaCustomDataSources extends js.Object {
  
  /**
    * Collection of custom data sources.
    */
  var items: js.UndefOr[js.Array[SchemaCustomDataSource]] = js.native
  
  /**
    * The maximum number of resources the response can contain, regardless of
    * the actual number of resources returned. Its value ranges from 1 to 1000
    * with a value of 1000 by default, or otherwise specified by the
    * max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Link to next page for this custom data source collection.
    */
  var nextLink: js.UndefOr[String] = js.native
  
  /**
    * Link to previous page for this custom data source collection.
    */
  var previousLink: js.UndefOr[String] = js.native
  
  /**
    * The starting index of the resources, which is 1 by default or otherwise
    * specified by the start-index query parameter.
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * The total number of results for the query, regardless of the number of
    * results in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
  
  /**
    * Email ID of the authenticated user
    */
  var username: js.UndefOr[String] = js.native
}
object SchemaCustomDataSources {
  
  @scala.inline
  def apply(): SchemaCustomDataSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDataSources]
  }
  
  @scala.inline
  implicit class SchemaCustomDataSourcesOps[Self <: SchemaCustomDataSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: SchemaCustomDataSource*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaCustomDataSource]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    
    @scala.inline
    def setPreviousLink(value: String): Self = this.set("previousLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousLink: Self = this.set("previousLink", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
