package typingsSlinky.babelWebpackPlugin.mod

import typingsSlinky.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends TransformOptions {
  
  var exclude: js.UndefOr[Matcher] = js.native
  
  var include: js.UndefOr[Matcher] = js.native
  
  var test: js.UndefOr[Matcher] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: (js.RegExp | String)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeRegExp(value: js.RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: Matcher): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (js.RegExp | String)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: Matcher): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: (js.RegExp | String)*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Matcher): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
