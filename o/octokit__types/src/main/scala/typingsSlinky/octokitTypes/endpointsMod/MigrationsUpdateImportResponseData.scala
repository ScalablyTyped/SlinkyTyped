package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationsUpdateImportResponseData extends StObject {
  
  var authors_count: Double = js.native
  
  var authors_url: String = js.native
  
  var commit_count: Double = js.native
  
  var has_large_files: Boolean = js.native
  
  var html_url: String = js.native
  
  var large_files_count: Double = js.native
  
  var large_files_size: Double = js.native
  
  var percent: Double = js.native
  
  var repository_url: String = js.native
  
  var status: String = js.native
  
  var status_text: String = js.native
  
  var tfvc_project: String = js.native
  
  var url: String = js.native
  
  var use_lfs: String = js.native
  
  var vcs: String = js.native
  
  var vcs_url: String = js.native
}
object MigrationsUpdateImportResponseData {
  
  @scala.inline
  def apply(
    authors_count: Double,
    authors_url: String,
    commit_count: Double,
    has_large_files: Boolean,
    html_url: String,
    large_files_count: Double,
    large_files_size: Double,
    percent: Double,
    repository_url: String,
    status: String,
    status_text: String,
    tfvc_project: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsUpdateImportResponseData = {
    val __obj = js.Dynamic.literal(authors_count = authors_count.asInstanceOf[js.Any], authors_url = authors_url.asInstanceOf[js.Any], commit_count = commit_count.asInstanceOf[js.Any], has_large_files = has_large_files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], large_files_count = large_files_count.asInstanceOf[js.Any], large_files_size = large_files_size.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_text = status_text.asInstanceOf[js.Any], tfvc_project = tfvc_project.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportResponseData]
  }
  
  @scala.inline
  implicit class MigrationsUpdateImportResponseDataMutableBuilder[Self <: MigrationsUpdateImportResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors_count(value: Double): Self = StObject.set(x, "authors_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors_url(value: String): Self = StObject.set(x, "authors_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_count(value: Double): Self = StObject.set(x, "commit_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_large_files(value: Boolean): Self = StObject.set(x, "has_large_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_count(value: Double): Self = StObject.set(x, "large_files_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_size(value: Double): Self = StObject.set(x, "large_files_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_text(value: String): Self = StObject.set(x, "status_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_lfs(value: String): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs(value: String): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_url(value: String): Self = StObject.set(x, "vcs_url", value.asInstanceOf[js.Any])
  }
}
