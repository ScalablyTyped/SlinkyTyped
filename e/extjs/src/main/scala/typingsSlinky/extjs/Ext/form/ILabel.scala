package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabel extends IComponent {
  
  /** [Config Option] (String) */
  var forId: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[String] = js.native
  
  /** [Method] Updates the label s innerHTML with the specified string
    * @param text String The new label text
    * @param encode Boolean False to skip HTML-encoding the text when rendering it to the label. This might be useful if you want to include tags in the label's innerHTML rather than rendering them as string literals per the default logic.
    * @returns Ext.form.Label this
    */
  var setText: js.UndefOr[
    js.Function2[/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean], this.type]
  ] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}
object ILabel {
  
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  @scala.inline
  implicit class ILabelMutableBuilder[Self <: ILabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForId(value: String): Self = StObject.set(x, "forId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForIdUndefined: Self = StObject.set(x, "forId", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setSetText(value: (/* text */ js.UndefOr[String], /* encode */ js.UndefOr[Boolean]) => ILabel): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
