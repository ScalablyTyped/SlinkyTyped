package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
  * (ERB). Change the following template settings to use alternative delimiters.
  **/
@js.native
trait TemplateSettings extends js.Object {
  
  /**
    * The "escape" delimiter.
    **/
  var escape: js.UndefOr[js.RegExp] = js.native
  
  /**
    * The "evaluate" delimiter.
    **/
  var evaluate: js.UndefOr[js.RegExp] = js.native
  
  /**
    * An object to import into the template as local variables.
    */
  var imports: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * The "interpolate" delimiter.
    */
  var interpolate: js.UndefOr[js.RegExp] = js.native
  
  /**
    * Used to reference the data object in the template text.
    */
  var variable: js.UndefOr[java.lang.String] = js.native
}
object TemplateSettings {
  
  @scala.inline
  def apply(): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSettings]
  }
  
  @scala.inline
  implicit class TemplateSettingsOps[Self <: TemplateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEscape(value: js.RegExp): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setEvaluate(value: js.RegExp): Self = this.set("evaluate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    
    @scala.inline
    def setImports(value: Dictionary[_]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    
    @scala.inline
    def setInterpolate(value: js.RegExp): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    
    @scala.inline
    def setVariable(value: java.lang.String): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
