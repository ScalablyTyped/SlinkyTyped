package typingsSlinky.materialMenu

import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenu.anon.PartialMDCMenuAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @JSImport("@material/menu", "Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialMenuSurface.constantsMod.Corner with Double] = js.native
    
    /* 13 */ val BOTTOM_END: typingsSlinky.materialMenuSurface.constantsMod.Corner.BOTTOM_END with Double = js.native
    
    /* 1 */ val BOTTOM_LEFT: typingsSlinky.materialMenuSurface.constantsMod.Corner.BOTTOM_LEFT with Double = js.native
    
    /* 5 */ val BOTTOM_RIGHT: typingsSlinky.materialMenuSurface.constantsMod.Corner.BOTTOM_RIGHT with Double = js.native
    
    /* 9 */ val BOTTOM_START: typingsSlinky.materialMenuSurface.constantsMod.Corner.BOTTOM_START with Double = js.native
    
    /* 12 */ val TOP_END: typingsSlinky.materialMenuSurface.constantsMod.Corner.TOP_END with Double = js.native
    
    /* 0 */ val TOP_LEFT: typingsSlinky.materialMenuSurface.constantsMod.Corner.TOP_LEFT with Double = js.native
    
    /* 4 */ val TOP_RIGHT: typingsSlinky.materialMenuSurface.constantsMod.Corner.TOP_RIGHT with Double = js.native
    
    /* 8 */ val TOP_START: typingsSlinky.materialMenuSurface.constantsMod.Corner.TOP_START with Double = js.native
  }
  
  @JSImport("@material/menu", "DefaultFocusState")
  @js.native
  object DefaultFocusState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialMenu.constantsMod.DefaultFocusState with Double] = js.native
    
    /* 2 */ val FIRST_ITEM: typingsSlinky.materialMenu.constantsMod.DefaultFocusState.FIRST_ITEM with Double = js.native
    
    /* 3 */ val LAST_ITEM: typingsSlinky.materialMenu.constantsMod.DefaultFocusState.LAST_ITEM with Double = js.native
    
    /* 1 */ val LIST_ROOT: typingsSlinky.materialMenu.constantsMod.DefaultFocusState.LIST_ROOT with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.materialMenu.constantsMod.DefaultFocusState.NONE with Double = js.native
  }
  
  @JSImport("@material/menu", "MDCMenu")
  @js.native
  class MDCMenu protected ()
    extends typingsSlinky.materialMenu.componentMod.MDCMenu {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialMenu.foundationMod.MDCMenuFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCMenu {
    
    @JSImport("@material/menu", "MDCMenu.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialMenu.componentMod.MDCMenu = js.native
  }
  
  @JSImport("@material/menu", "MDCMenuFoundation")
  @js.native
  class MDCMenuFoundation ()
    extends typingsSlinky.materialMenu.foundationMod.MDCMenuFoundation {
    def this(adapter: PartialMDCMenuAdapter) = this()
  }
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  object cssClasses {
    
    @JSImport("@material/menu", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "cssClasses.MENU_SELECTED_LIST_ITEM")
    @js.native
    def MENU_SELECTED_LIST_ITEM: String = js.native
    @scala.inline
    def MENU_SELECTED_LIST_ITEM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTED_LIST_ITEM")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "cssClasses.MENU_SELECTION_GROUP")
    @js.native
    def MENU_SELECTION_GROUP: String = js.native
    @scala.inline
    def MENU_SELECTION_GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTION_GROUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/menu", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "numbers.FOCUS_ROOT_INDEX")
    @js.native
    def FOCUS_ROOT_INDEX: Double = js.native
    @scala.inline
    def FOCUS_ROOT_INDEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUS_ROOT_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/menu", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu", "strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    @scala.inline
    def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.ARIA_DISABLED_ATTR")
    @js.native
    def ARIA_DISABLED_ATTR: String = js.native
    @scala.inline
    def ARIA_DISABLED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.CHECKBOX_SELECTOR")
    @js.native
    def CHECKBOX_SELECTOR: String = js.native
    @scala.inline
    def CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.LIST_SELECTOR")
    @js.native
    def LIST_SELECTOR: String = js.native
    @scala.inline
    def LIST_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu", "strings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    @scala.inline
    def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
  }
}
