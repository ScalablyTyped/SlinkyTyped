package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialLineRipple.anon.PartialMDCLineRippleAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineRipple {
  
  @JSImport("material-components-web", "lineRipple.MDCLineRipple")
  @js.native
  class MDCLineRipple protected ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRipple {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialLineRipple.foundationMod.MDCLineRippleFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCLineRipple {
    
    @JSImport("material-components-web", "lineRipple.MDCLineRipple.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialLineRipple.componentMod.MDCLineRipple = js.native
  }
  
  @JSImport("material-components-web", "lineRipple.MDCLineRippleFoundation")
  @js.native
  class MDCLineRippleFoundation ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
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
    
    @JSImport("material-components-web", "lineRipple.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "lineRipple.cssClasses.LINE_RIPPLE_ACTIVE")
    @js.native
    def LINE_RIPPLE_ACTIVE: String = js.native
    @scala.inline
    def LINE_RIPPLE_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "lineRipple.cssClasses.LINE_RIPPLE_DEACTIVATING")
    @js.native
    def LINE_RIPPLE_DEACTIVATING: String = js.native
    @scala.inline
    def LINE_RIPPLE_DEACTIVATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_DEACTIVATING")(x.asInstanceOf[js.Any])
  }
}
