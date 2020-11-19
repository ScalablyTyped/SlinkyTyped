package typingsSlinky.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserIDsOptions extends js.Object {
  
  /**
    * If specified, only clusters assigned to this cluster can be returned.
    * */
  val cluster: js.UndefOr[String] = js.native
  
  /**
    * Number of users to return by page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.native
}
object SearchUserIDsOptions {
  
  @scala.inline
  def apply(): SearchUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserIDsOptions]
  }
  
  @scala.inline
  implicit class SearchUserIDsOptionsOps[Self <: SearchUserIDsOptions] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
}
