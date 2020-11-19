package typingsSlinky.meteorUniverseI18n.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactComponentProps extends js.Object {
  
  var _containerType: js.UndefOr[String] = js.native
  
  var _locale: js.UndefOr[String] = js.native
  
  var _namespace: js.UndefOr[String] = js.native
  
  var _props: js.UndefOr[HTMLAttributes[ReactComponentClass[js.Object]]] = js.native
  
  var _tagType: js.UndefOr[String] = js.native
  
  var _translateProps: js.UndefOr[js.Array[String]] = js.native
}
object ReactComponentProps {
  
  @scala.inline
  def apply(): ReactComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactComponentProps]
  }
  
  @scala.inline
  implicit class ReactComponentPropsOps[Self <: ReactComponentProps] (val x: Self) extends AnyVal {
    
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
    def set_containerType(value: String): Self = this.set("_containerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_containerType: Self = this.set("_containerType", js.undefined)
    
    @scala.inline
    def set_locale(value: String): Self = this.set("_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_locale: Self = this.set("_locale", js.undefined)
    
    @scala.inline
    def set_namespace(value: String): Self = this.set("_namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_namespace: Self = this.set("_namespace", js.undefined)
    
    @scala.inline
    def set_props(value: HTMLAttributes[ReactComponentClass[js.Object]]): Self = this.set("_props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_props: Self = this.set("_props", js.undefined)
    
    @scala.inline
    def set_tagType(value: String): Self = this.set("_tagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_tagType: Self = this.set("_tagType", js.undefined)
    
    @scala.inline
    def set_translatePropsVarargs(value: String*): Self = this.set("_translateProps", js.Array(value :_*))
    
    @scala.inline
    def set_translateProps(value: js.Array[String]): Self = this.set("_translateProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_translateProps: Self = this.set("_translateProps", js.undefined)
  }
}
