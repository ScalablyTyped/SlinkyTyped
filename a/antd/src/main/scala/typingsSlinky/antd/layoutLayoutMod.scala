package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.AddSider
import typingsSlinky.antd.antdStrings.footer
import typingsSlinky.antd.antdStrings.header
import typingsSlinky.antd.antdStrings.main
import typingsSlinky.antd.antdStrings.section
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutLayoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout/layout", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Content")
  @js.native
  val Content: ReactComponentClass[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Footer")
  @js.native
  val Footer: ReactComponentClass[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "Header")
  @js.native
  val Header: ReactComponentClass[BasicProps] = js.native
  
  @JSImport("antd/lib/layout/layout", "LayoutContext")
  @js.native
  val LayoutContext: Context[LayoutContextProps] = js.native
  
  @js.native
  trait BasicProps extends HTMLAttributes[HTMLDivElement] {
    
    var hasSider: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object BasicProps {
    
    @scala.inline
    def apply(): BasicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicProps]
    }
    
    @scala.inline
    implicit class BasicPropsMutableBuilder[Self <: BasicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasSider(value: Boolean): Self = StObject.set(x, "hasSider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSiderUndefined: Self = StObject.set(x, "hasSider", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait GeneratorProps extends StObject {
    
    var displayName: String = js.native
    
    var suffixCls: String = js.native
    
    var tagName: header | footer | main | section = js.native
  }
  object GeneratorProps {
    
    @scala.inline
    def apply(displayName: String, suffixCls: String, tagName: header | footer | main | section): GeneratorProps = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], suffixCls = suffixCls.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorProps]
    }
    
    @scala.inline
    implicit class GeneratorPropsMutableBuilder[Self <: GeneratorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixCls(value: String): Self = StObject.set(x, "suffixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: header | footer | main | section): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutContextProps extends StObject {
    
    var siderHook: AddSider = js.native
  }
  object LayoutContextProps {
    
    @scala.inline
    def apply(siderHook: AddSider): LayoutContextProps = {
      val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContextProps]
    }
    
    @scala.inline
    implicit class LayoutContextPropsMutableBuilder[Self <: LayoutContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSiderHook(value: AddSider): Self = StObject.set(x, "siderHook", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[BasicProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutLayoutMod.foo` */
  override def _to: ReactComponentClass[BasicProps] = default
}
