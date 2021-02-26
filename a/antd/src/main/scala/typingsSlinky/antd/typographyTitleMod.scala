package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdNumbers.`1`
import typingsSlinky.antd.antdNumbers.`2`
import typingsSlinky.antd.antdNumbers.`3`
import typingsSlinky.antd.antdNumbers.`4`
import typingsSlinky.antd.antdNumbers.`5`
import typingsSlinky.antd.baseMod.BaseType
import typingsSlinky.antd.baseMod.CopyConfig
import typingsSlinky.antd.baseMod.EditConfig
import typingsSlinky.antd.baseMod.EllipsisConfig
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTitleMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Title", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TitleProps] = js.native
  
  /* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/typography/Base.BlockProps & {  level :[1, 2, 3, 4, 5][number] | undefined}, 'strong'> */
  @js.native
  trait TitleProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var code: js.UndefOr[Boolean] = js.native
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.native
    
    var delete: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.native
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var level: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[BaseType] = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
  object TitleProps {
    
    @scala.inline
    def apply(): TitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleProps]
    }
    
    @scala.inline
    implicit class TitlePropsMutableBuilder[Self <: TitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCopyable(value: Boolean | CopyConfig): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      @scala.inline
      def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | EditConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean | EllipsisConfig): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLevel(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `typographyTitleMod.foo` */
  override def _to: ReactComponentClass[TitleProps] = default
}
