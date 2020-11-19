package typingsSlinky.reactLifecycleComponent.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.reactLifecycleComponent.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LifecycleComponent {
  
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLifecycleComponent.mod.LifecycleComponent] {
    
    @scala.inline
    def UNSAFE_componentWillMount(value: () => Unit): this.type = set("UNSAFE_componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def UNSAFE_componentWillReceiveProps(value: (js.Any, /* nextContext */ js.Any) => Unit): this.type = set("UNSAFE_componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def UNSAFE_componentWillUpdate(value: (js.Any, js.Any, /* nextContext */ js.Any) => Unit): this.type = set("UNSAFE_componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def componentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): this.type = set("componentDidCatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def componentDidMount(value: () => Unit): this.type = set("componentDidMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentDidUpdate(value: (js.Any, js.Any, /* snapshot */ js.UndefOr[js.Any]) => Unit): this.type = set("componentDidUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def componentWillMount(value: () => Unit): this.type = set("componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentWillReceiveProps(value: (js.Any, /* nextContext */ js.Any) => Unit): this.type = set("componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def componentWillUnmount(value: () => Unit): this.type = set("componentWillUnmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentWillUpdate(value: (js.Any, js.Any, /* nextContext */ js.Any) => Unit): this.type = set("componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def getSnapshotBeforeUpdate(value: (js.Any, js.Any) => js.Any | Null): this.type = set("getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def shouldComponentUpdate(value: (js.Any, js.Any, /* nextContext */ js.Any) => Boolean): this.type = set("shouldComponentUpdate", js.Any.fromFunction3(value))
  }
  
  def withProps(p: Props[js.Any, js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(component: ReactComponentClass[js.Any]): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props[js.Any, js.Any]]))
  }
}
