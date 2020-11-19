package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typingsSlinky.materialLineRipple.anon.LINERIPPLEACTIVE
import typingsSlinky.materialLineRipple.anon.PartialMDCLineRippleAdapt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "lineRipple")
@js.native
object lineRipple extends js.Object {
  
  @js.native
  class MDCLineRipple ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRipple
  /* static members */
  @js.native
  object MDCLineRipple extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialLineRipple.componentMod.MDCLineRipple = js.native
  }
  
  @js.native
  class MDCLineRippleFoundation ()
    extends typingsSlinky.materialLineRipple.mod.MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
  }
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    
    def cssClasses: LINERIPPLEACTIVE = js.native
    
    /**
      * See {@link MDCLineRippleAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCLineRippleAdapter = js.native
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
  @js.native
  object cssClasses extends js.Object {
    
    var LINE_RIPPLE_ACTIVE: String = js.native
    
    var LINE_RIPPLE_DEACTIVATING: String = js.native
  }
}
