package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.loginItemMod.LoginItemProps
import typingsSlinky.antDesignPro.loginMod.LoginProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Login {
  
  @JSImport("ant-design-pro", "Login")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.Login] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmit(value: (/* error */ js.Any, /* values */ js.Any) => Unit): this.type = set("onSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def onTabChange(value: /* key */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Login.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Captcha {
    
    @JSImport("ant-design-pro", "Login.Captcha")
    @js.native
    object component extends js.Object
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
      `type`: String,
      updateActive: js.Any => Unit
    ): SharedBuilder_LoginItemProps638664218 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps638664218(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
  }
  
  object Mobile {
    
    @JSImport("ant-design-pro", "Login.Mobile")
    @js.native
    object component extends js.Object
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
      `type`: String,
      updateActive: js.Any => Unit
    ): SharedBuilder_LoginItemProps638664218 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps638664218(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
  }
  
  object Password {
    
    @JSImport("ant-design-pro", "Login.Password")
    @js.native
    object component extends js.Object
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
      `type`: String,
      updateActive: js.Any => Unit
    ): SharedBuilder_LoginItemProps638664218 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps638664218(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
  }
  
  object UserName {
    
    @JSImport("ant-design-pro", "Login.UserName")
    @js.native
    object component extends js.Object
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
      `type`: String,
      updateActive: js.Any => Unit
    ): SharedBuilder_LoginItemProps638664218 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps638664218(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
  }
}
