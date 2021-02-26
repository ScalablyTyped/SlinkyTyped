package typingsSlinky.rcMenu

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcMenu.anon.Hover
import typingsSlinky.rcMenu.anon.Open
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  type BuiltinPlacements = Record[String, js.Any]
  
  type DestroyEventHandler = js.Function1[/* key */ Key, Unit]
  
  type HoverEventHandler = js.Function1[/* info */ Hover, Unit]
  
  type LegacyFunctionRef = js.Function1[/* node */ ReactInstance, Unit]
  
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  
  type MenuHoverEventHandler = js.Function1[/* info */ typingsSlinky.rcMenu.anon.Key, Unit]
  
  @js.native
  trait MenuInfo extends StObject {
    
    var domEvent: SyntheticMouseEvent[HTMLElement] = js.native
    
    var item: ReactInstance = js.native
    
    var key: Key = js.native
    
    var keyPath: js.Array[Key] = js.native
  }
  object MenuInfo {
    
    @scala.inline
    def apply(domEvent: SyntheticMouseEvent[HTMLElement], item: ReactInstance, key: Key, keyPath: js.Array[Key]): MenuInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInfo]
    }
    
    @scala.inline
    implicit class MenuInfoMutableBuilder[Self <: MenuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemElement(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPath(value: js.Array[Key]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathVarargs(value: Key*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcMenu.rcMenuStrings.horizontal
    - typingsSlinky.rcMenu.rcMenuStrings.vertical
    - typingsSlinky.rcMenu.rcMenuStrings.`vertical-left`
    - typingsSlinky.rcMenu.rcMenuStrings.`vertical-right`
    - typingsSlinky.rcMenu.rcMenuStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    @scala.inline
    def horizontal: typingsSlinky.rcMenu.rcMenuStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.horizontal]
    
    @scala.inline
    def `inline`: typingsSlinky.rcMenu.rcMenuStrings.`inline` = "inline".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.`inline`]
    
    @scala.inline
    def vertical: typingsSlinky.rcMenu.rcMenuStrings.vertical = "vertical".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.vertical]
    
    @scala.inline
    def `vertical-left`: typingsSlinky.rcMenu.rcMenuStrings.`vertical-left` = "vertical-left".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.`vertical-left`]
    
    @scala.inline
    def `vertical-right`: typingsSlinky.rcMenu.rcMenuStrings.`vertical-right` = "vertical-right".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.`vertical-right`]
  }
  
  @js.native
  trait MiniStore extends StObject {
    
    def getState(): js.Any = js.native
    
    def setState(state: js.Any): Unit = js.native
    
    def subscribe(listener: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
  object MiniStore {
    
    @scala.inline
    def apply(
      getState: () => js.Any,
      setState: js.Any => Unit,
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): MiniStore = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[MiniStore]
    }
    
    @scala.inline
    implicit class MiniStoreMutableBuilder[Self <: MiniStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => js.Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: js.Any => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type OpenAnimation = String | (Record[String, js.Any])
  
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Open, Unit]
  
  type RenderIconType = ReactElement | (js.Function1[/* props */ js.Any, ReactElement])
  
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  
  @js.native
  trait SelectInfo extends MenuInfo {
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
  }
  object SelectInfo {
    
    @scala.inline
    def apply(domEvent: SyntheticMouseEvent[HTMLElement], item: ReactInstance, key: Key, keyPath: js.Array[Key]): SelectInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    @scala.inline
    implicit class SelectInfoMutableBuilder[Self <: SelectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcMenu.rcMenuStrings.click
    - typingsSlinky.rcMenu.rcMenuStrings.hover
  */
  trait TriggerSubMenuAction extends StObject
  object TriggerSubMenuAction {
    
    @scala.inline
    def click: typingsSlinky.rcMenu.rcMenuStrings.click = "click".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.click]
    
    @scala.inline
    def hover: typingsSlinky.rcMenu.rcMenuStrings.hover = "hover".asInstanceOf[typingsSlinky.rcMenu.rcMenuStrings.hover]
  }
}
