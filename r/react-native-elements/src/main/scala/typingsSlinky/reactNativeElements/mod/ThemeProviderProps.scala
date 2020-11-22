package typingsSlinky.reactNativeElements.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProviderProps[T] extends js.Object {
  
  var children: ReactElement = js.native
  
  var theme: js.UndefOr[Theme[T]] = js.native
  
  var useDark: js.UndefOr[Boolean] = js.native
}
object ThemeProviderProps {
  
  @scala.inline
  def apply[T](): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
  
  @scala.inline
  implicit class ThemeProviderPropsOps[Self <: ThemeProviderProps[_], T] (val x: Self with ThemeProviderProps[T]) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme[T]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUseDark(value: Boolean): Self = this.set("useDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDark: Self = this.set("useDark", js.undefined)
  }
}
