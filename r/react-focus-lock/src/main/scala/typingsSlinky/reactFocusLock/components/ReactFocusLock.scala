package typingsSlinky.reactFocusLock.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFocusLock.anon.ChildrenChildrenType
import typingsSlinky.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsSlinky.reactFocusLock.reactFocusLockStrings.tail
import typingsSlinky.std.FocusOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFocusLock {
  
  @JSImport("react-focus-lock", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def allowTextSelection(value: Boolean): this.type = set("allowTextSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[(Record[String, js.Any]) with ChildrenChildrenType[ReactElement]]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asComponentClass(value: ReactComponentClass[(Record[String, js.Any]) with ChildrenChildrenType[ReactElement]]): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: String | ReactElement): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def crossFrame(value: Boolean): this.type = set("crossFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lockProps(value: Record[String, js.Any]): this.type = set("lockProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noFocusGuards(value: Boolean | tail): this.type = set("noFocusGuards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActivation(value: /* node */ HTMLElement => Unit): this.type = set("onActivation", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeactivation(value: /* node */ HTMLElement => Unit): this.type = set("onDeactivation", js.Any.fromFunction1(value))
    
    @scala.inline
    def persistentFocus(value: Boolean): this.type = set("persistentFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def returnFocus(value: Boolean | FocusOptions): this.type = set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shardsVarargs(value: (ReactRef[js.Any] | HTMLElement)*): this.type = set("shards", js.Array(value :_*))
    
    @scala.inline
    def shards(value: js.Array[ReactRef[_] | HTMLElement]): this.type = set("shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def whiteList(value: /* activeElement */ HTMLElement => Boolean): this.type = set("whiteList", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ReactFocusLockProps[ReactElement, Record[String, js.Any]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactFocusLock.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
