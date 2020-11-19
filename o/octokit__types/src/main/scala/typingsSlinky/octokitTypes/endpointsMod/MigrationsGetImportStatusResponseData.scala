package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsGetImportStatusResponseData extends js.Object {
  
  var authors_count: Double = js.native
  
  var authors_url: String = js.native
  
  var has_large_files: Boolean = js.native
  
  var html_url: String = js.native
  
  var large_files_count: Double = js.native
  
  var large_files_size: Double = js.native
  
  var repository_url: String = js.native
  
  var status: String = js.native
  
  var status_text: String = js.native
  
  var url: String = js.native
  
  var use_lfs: String = js.native
  
  var vcs: String = js.native
  
  var vcs_url: String = js.native
}
object MigrationsGetImportStatusResponseData {
  
  @scala.inline
  def apply(
    authors_count: Double,
    authors_url: String,
    has_large_files: Boolean,
    html_url: String,
    large_files_count: Double,
    large_files_size: Double,
    repository_url: String,
    status: String,
    status_text: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsGetImportStatusResponseData = {
    val __obj = js.Dynamic.literal(authors_count = authors_count.asInstanceOf[js.Any], authors_url = authors_url.asInstanceOf[js.Any], has_large_files = has_large_files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], large_files_count = large_files_count.asInstanceOf[js.Any], large_files_size = large_files_size.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_text = status_text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetImportStatusResponseData]
  }
  
  @scala.inline
  implicit class MigrationsGetImportStatusResponseDataOps[Self <: MigrationsGetImportStatusResponseData] (val x: Self) extends AnyVal {
    
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
    def setAuthors_count(value: Double): Self = this.set("authors_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors_url(value: String): Self = this.set("authors_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_large_files(value: Boolean): Self = this.set("has_large_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_count(value: Double): Self = this.set("large_files_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_size(value: Double): Self = this.set("large_files_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = this.set("repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_text(value: String): Self = this.set("status_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_lfs(value: String): Self = this.set("use_lfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs(value: String): Self = this.set("vcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_url(value: String): Self = this.set("vcs_url", value.asInstanceOf[js.Any])
  }
}
