package typingsSlinky.mdxJsReact.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDXProviderProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var components: MDXProviderComponentsProp = js.native
}
object MDXProviderProps {
  
  @scala.inline
  def apply(components: MDXProviderComponentsProp): MDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderProps]
  }
  
  @scala.inline
  implicit class MDXProviderPropsOps[Self <: MDXProviderProps] (val x: Self) extends AnyVal {
    
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
    def setComponentsFunction1(value: /* components */ MDXProviderComponents => MDXProviderComponents): Self = this.set("components", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponents(value: MDXProviderComponentsProp): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
