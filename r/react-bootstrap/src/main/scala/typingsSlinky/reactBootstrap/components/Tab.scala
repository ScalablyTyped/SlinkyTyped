package typingsSlinky.reactBootstrap.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.tabContainerMod.TabContainerProps
import typingsSlinky.reactBootstrap.tabContentMod.TabContentProps
import typingsSlinky.reactBootstrap.tabMod.TabProps
import typingsSlinky.reactBootstrap.tabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  object Container {
    
    @JSImport("react-bootstrap", "Tab.Container")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Container.type): SharedBuilder_TabContainerProps_263453577[typingsSlinky.reactBootstrap.mod.Tab.Container] = new SharedBuilder_TabContainerProps_263453577[typingsSlinky.reactBootstrap.mod.Tab.Container](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps_263453577[typingsSlinky.reactBootstrap.mod.Tab.Container] = new SharedBuilder_TabContainerProps_263453577[typingsSlinky.reactBootstrap.mod.Tab.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("react-bootstrap", "Tab.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_TabContentProps_163508119[typingsSlinky.reactBootstrap.mod.Tab.Content] = new SharedBuilder_TabContentProps_163508119[typingsSlinky.reactBootstrap.mod.Tab.Content](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabContentProps): SharedBuilder_TabContentProps_163508119[typingsSlinky.reactBootstrap.mod.Tab.Content] = new SharedBuilder_TabContentProps_163508119[typingsSlinky.reactBootstrap.mod.Tab.Content](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Pane {
    
    @JSImport("react-bootstrap", "Tab.Pane")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Pane.type): SharedBuilder_TabPaneProps_1019548123[typingsSlinky.reactBootstrap.mod.Tab.Pane] = new SharedBuilder_TabPaneProps_1019548123[typingsSlinky.reactBootstrap.mod.Tab.Pane](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps_1019548123[typingsSlinky.reactBootstrap.mod.Tab.Pane] = new SharedBuilder_TabPaneProps_1019548123[typingsSlinky.reactBootstrap.mod.Tab.Pane](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-bootstrap", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Tab] {
    
    @scala.inline
    def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventKey(value: js.Any): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def tabClassName(value: String): this.type = set("tabClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
