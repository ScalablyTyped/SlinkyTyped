package typingsSlinky.materialUiLab.timelineConnectorTimelineConnectorMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeliRoot
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineConnector/TimelineConnector.TimelineConnectorClassKey, never> */
@js.native
trait TimelineConnectorProps extends js.Object {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[PartialClassNameMapTimeliRoot] = js.native
  
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TimelineConnectorProps {
  
  @scala.inline
  def apply(): TimelineConnectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineConnectorProps]
  }
  
  @scala.inline
  implicit class TimelineConnectorPropsOps[Self <: TimelineConnectorProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapTimeliRoot): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_] | ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
