package typingsSlinky.rollupPluginUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginURLOptions extends js.Object {
  
  var destDist: js.UndefOr[String] = js.native
  
  var emitFile: js.UndefOr[Boolean] = js.native
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[js.Array[String]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var publicPath: js.UndefOr[String] = js.native
  
  var sourceDir: js.UndefOr[String] = js.native
}
object PluginURLOptions {
  
  @scala.inline
  def apply(): PluginURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginURLOptions]
  }
  
  @scala.inline
  implicit class PluginURLOptionsOps[Self <: PluginURLOptions] (val x: Self) extends AnyVal {
    
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
    def setDestDist(value: String): Self = this.set("destDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestDist: Self = this.set("destDist", js.undefined)
    
    @scala.inline
    def setEmitFile(value: Boolean): Self = this.set("emitFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitFile: Self = this.set("emitFile", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
  }
}
