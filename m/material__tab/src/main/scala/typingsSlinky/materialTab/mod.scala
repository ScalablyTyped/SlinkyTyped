package typingsSlinky.materialTab

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTab.anon.PartialMDCTabAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab", "MDCTab")
  @js.native
  class MDCTab protected ()
    extends typingsSlinky.materialTab.componentMod.MDCTab {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typingsSlinky.materialTab.foundationMod.MDCTabFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tab", "MDCTab.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTab.componentMod.MDCTab = js.native
  }
  
  @JSImport("@material/tab", "MDCTabFoundation")
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.materialTab.foundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
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
    
    @JSImport("@material/tab", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab", "cssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    @scala.inline
    def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab", "strings.ARIA_SELECTED")
    @js.native
    def ARIA_SELECTED: String = js.native
    @scala.inline
    def ARIA_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    @scala.inline
    def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.INTERACTED_EVENT")
    @js.native
    def INTERACTED_EVENT: String = js.native
    @scala.inline
    def INTERACTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.RIPPLE_SELECTOR")
    @js.native
    def RIPPLE_SELECTOR: String = js.native
    @scala.inline
    def RIPPLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.TABINDEX")
    @js.native
    def TABINDEX: String = js.native
    @scala.inline
    def TABINDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABINDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.TAB_INDICATOR_SELECTOR")
    @js.native
    def TAB_INDICATOR_SELECTOR: String = js.native
    @scala.inline
    def TAB_INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
