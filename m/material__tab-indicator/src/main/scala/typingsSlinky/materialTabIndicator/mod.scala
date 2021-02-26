package typingsSlinky.materialTabIndicator

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab-indicator", "MDCFadingTabIndicatorFoundation")
  @js.native
  class MDCFadingTabIndicatorFoundation ()
    extends typingsSlinky.materialTabIndicator.fadingFoundationMod.MDCFadingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator", "MDCSlidingTabIndicatorFoundation")
  @js.native
  class MDCSlidingTabIndicatorFoundation ()
    extends typingsSlinky.materialTabIndicator.slidingFoundationMod.MDCSlidingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator", "MDCTabIndicator")
  @js.native
  class MDCTabIndicator protected ()
    extends typingsSlinky.materialTabIndicator.componentMod.MDCTabIndicator {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("@material/tab-indicator", "MDCTabIndicator.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabIndicator.componentMod.MDCTabIndicator = js.native
  }
  
  @JSImport("@material/tab-indicator", "MDCTabIndicatorFoundation")
  @js.native
  abstract class MDCTabIndicatorFoundation ()
    extends typingsSlinky.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
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
    
    @JSImport("@material/tab-indicator", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-indicator", "cssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    @scala.inline
    def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-indicator", "cssClasses.FADE")
    @js.native
    def FADE: String = js.native
    @scala.inline
    def FADE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FADE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-indicator", "cssClasses.NO_TRANSITION")
    @js.native
    def NO_TRANSITION: String = js.native
    @scala.inline
    def NO_TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_TRANSITION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab-indicator", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-indicator", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    @scala.inline
    def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
