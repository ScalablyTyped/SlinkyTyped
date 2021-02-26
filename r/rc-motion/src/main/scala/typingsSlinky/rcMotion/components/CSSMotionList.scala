package typingsSlinky.rcMotion.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMotion.anon.Dictkey
import typingsSlinky.rcMotion.anon.Dictname
import typingsSlinky.rcMotion.cssmotionMod.MotionName
import typingsSlinky.rcMotion.cssmotionlistMod.CSSMotionListProps
import typingsSlinky.rcMotion.interfaceMod.MotionEvent
import typingsSlinky.rcMotion.rcMotionBooleans.`false`
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSSMotionList {
  
  @scala.inline
  def apply(keys: js.Array[Key | Dictname]): Builder = {
    val __props = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CSSMotionListProps]))
  }
  
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcMotion.mod.CSSMotionList] {
    
    @scala.inline
    def children(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ js.Any, Unit]) => ReactElement): this.type = set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def component(value: String | ReactComponentClass[js.Object] | `false`): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventProps(value: js.Object): this.type = set("eventProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def internalRef(value: Ref[_]): this.type = set("internalRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def internalRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("internalRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def internalRefNull: this.type = set("internalRef", null)
    
    @scala.inline
    def internalRefRefObject(value: ReactRef[_]): this.type = set("internalRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leavedClassName(value: String): this.type = set("leavedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionAppear(value: Boolean): this.type = set("motionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionDeadline(value: Double): this.type = set("motionDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionEnter(value: Boolean): this.type = set("motionEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionLeave(value: Boolean): this.type = set("motionLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionLeaveImmediately(value: Boolean): this.type = set("motionLeaveImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionName(value: MotionName): this.type = set("motionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onAppearActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def onAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onAppearEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def onAppearPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): this.type = set("onAppearPrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onAppearStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onEnterActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def onEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onEnterEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def onEnterPrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): this.type = set("onEnterPrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onEnterStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onLeaveActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onLeaveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLeavePrepare(value: /* element */ HTMLElement => js.Promise[js.Any] | Unit): this.type = set("onLeavePrepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onLeaveStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVisibleChanged(value: (/* visible */ Boolean, /* info */ typingsSlinky.rcMotion.anon.Key) => Unit): this.type = set("onVisibleChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def removeOnLeave(value: Boolean): this.type = set("removeOnLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CSSMotionListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
