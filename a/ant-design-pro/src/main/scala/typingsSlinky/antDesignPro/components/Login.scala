package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.AddTab
import typingsSlinky.antDesignPro.loginItemMod.LoginItemProps
import typingsSlinky.antDesignPro.loginMod.LoginProps
import typingsSlinky.antDesignPro.loginTabMod.LoginTabProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Login {
  
  object Captcha {
    
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
    
    @JSImport("ant-design-pro", "Login.Captcha")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Mobile {
    
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
    
    @JSImport("ant-design-pro", "Login.Mobile")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Password {
    
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
    
    @JSImport("ant-design-pro", "Login.Password")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Tab {
    
    @scala.inline
    def apply(tabUtil: AddTab): SharedBuilder_LoginTabProps_1090029391[typingsSlinky.antDesignPro.mod.Login.Tab] = {
      val __props = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      new SharedBuilder_LoginTabProps_1090029391[typingsSlinky.antDesignPro.mod.Login.Tab](js.Array(this.component, __props.asInstanceOf[LoginTabProps]))
    }
    
    @JSImport("ant-design-pro", "Login.Tab")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginTabProps): SharedBuilder_LoginTabProps_1090029391[typingsSlinky.antDesignPro.mod.Login.Tab] = new SharedBuilder_LoginTabProps_1090029391[typingsSlinky.antDesignPro.mod.Login.Tab](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object UserName {
    
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
    
    @JSImport("ant-design-pro", "Login.UserName")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("ant-design-pro", "Login")
  @js.native
  val component: js.Object = js.native
  
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
  
  implicit def make(companion: Login.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
