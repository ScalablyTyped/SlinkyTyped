package typingsSlinky.reactResponsive.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassType
import typingsSlinky.reactResponsive.anon.PartialMediaQueryMatchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryProps
  extends MediaQueryFeatures
     with MediaQueryTypes {
  
  var children: js.UndefOr[ReactElement | (js.Function1[/* matches */ Boolean, ReactElement])] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[String | ReactComponentClass[_] | (ClassType[_, _, _])] = js.native
  
  var device: js.UndefOr[MediaQueryMatchers] = js.native
  
  var onBeforeChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var values: js.UndefOr[PartialMediaQueryMatchers] = js.native
}
object MediaQueryProps {
  
  @scala.inline
  def apply(): MediaQueryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryProps]
  }
  
  @scala.inline
  implicit class MediaQueryPropsOps[Self <: MediaQueryProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* matches */ Boolean => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement | (js.Function1[/* matches */ Boolean, ReactElement])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String | ReactComponentClass[_] | (ClassType[_, _, _])): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDevice(value: MediaQueryMatchers): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setOnBeforeChange(value: /* matches */ Boolean => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* matches */ Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValues(value: PartialMediaQueryMatchers): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
