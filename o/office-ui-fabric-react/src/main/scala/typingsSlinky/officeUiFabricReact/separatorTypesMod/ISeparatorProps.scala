package typingsSlinky.officeUiFabricReact.separatorTypesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeparatorProps extends HTMLAttributes[HTMLElement] {
  
  /**
    * Where the content should be aligned in the separator.
    * @defaultValue 'center'
    */
  var alignContent: js.UndefOr[start | center | end] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]] = js.native
  
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Whether the element is a vertical separator.
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object ISeparatorProps {
  
  @scala.inline
  def apply(): ISeparatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeparatorProps]
  }
  
  @scala.inline
  implicit class ISeparatorPropsOps[Self <: ISeparatorProps] (val x: Self) extends AnyVal {
    
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
    def setAlignContent(value: start | center | end): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ISeparatorStyleProps => DeepPartial[ISeparatorStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
