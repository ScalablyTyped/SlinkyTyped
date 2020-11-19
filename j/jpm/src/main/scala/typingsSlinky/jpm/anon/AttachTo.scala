package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.ContentWorker
import typingsSlinky.jpm.jpmStrings.end
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.start
import typingsSlinky.jpm.pageModMod.attachmentMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachTo extends js.Object {
  
  var attachTo: js.UndefOr[attachmentMode | js.Array[attachmentMode]] = js.native
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp = js.native
  
  var onAttach: js.UndefOr[js.Function1[/* worker */ ContentWorker, _]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.native
}
object AttachTo {
  
  @scala.inline
  def apply(include: String | (js.Array[js.RegExp | String]) | js.RegExp): AttachTo = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachTo]
  }
  
  @scala.inline
  implicit class AttachToOps[Self <: AttachTo] (val x: Self) extends AnyVal {
    
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
    def setIncludeVarargs(value: (js.RegExp | String)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToVarargs(value: attachmentMode*): Self = this.set("attachTo", js.Array(value :_*))
    
    @scala.inline
    def setAttachTo(value: attachmentMode | js.Array[attachmentMode]): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = this.set("contentScript", js.Array(value :_*))
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = this.set("contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScript: Self = this.set("contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = this.set("contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = this.set("contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptFile: Self = this.set("contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = this.set("contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptOptions: Self = this.set("contentScriptOptions", js.undefined)
    
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = this.set("contentScriptWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptWhen: Self = this.set("contentScriptWhen", js.undefined)
    
    @scala.inline
    def setContentStyleVarargs(value: String*): Self = this.set("contentStyle", js.Array(value :_*))
    
    @scala.inline
    def setContentStyle(value: String | js.Array[String]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleFileVarargs(value: String*): Self = this.set("contentStyleFile", js.Array(value :_*))
    
    @scala.inline
    def setContentStyleFile(value: String | js.Array[String]): Self = this.set("contentStyleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyleFile: Self = this.set("contentStyleFile", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setOnAttach(value: /* worker */ ContentWorker => _): Self = this.set("onAttach", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAttach: Self = this.set("onAttach", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ js.Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
}
