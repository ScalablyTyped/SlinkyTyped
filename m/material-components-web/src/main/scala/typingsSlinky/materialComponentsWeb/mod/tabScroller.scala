package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typingsSlinky.materialTabScroller.anon.ANIMATING
import typingsSlinky.materialTabScroller.anon.AREASELECTOR
import typingsSlinky.materialTabScroller.anon.PartialMDCTabScrollerAdap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "tabScroller")
@js.native
object tabScroller extends js.Object {
  
  @js.native
  class MDCTabScroller ()
    extends typingsSlinky.materialTabScroller.mod.MDCTabScroller
  /* static members */
  @js.native
  object MDCTabScroller extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabScroller.componentMod.MDCTabScroller = js.native
  }
  
  @js.native
  class MDCTabScrollerFoundation ()
    extends typingsSlinky.materialTabScroller.mod.MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
  }
  /* static members */
  @js.native
  object MDCTabScrollerFoundation extends js.Object {
    
    def cssClasses: ANIMATING = js.native
    
    def defaultAdapter: MDCTabScrollerAdapter = js.native
    
    def strings: AREASELECTOR = js.native
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
    
    var ANIMATING: String = js.native
    
    var SCROLL_AREA_SCROLL: String = js.native
    
    var SCROLL_TEST: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var AREA_SELECTOR: String = js.native
    
    var CONTENT_SELECTOR: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
    def computeHorizontalScrollbarHeight(documentObj: Document): Double = js.native
    def computeHorizontalScrollbarHeight(documentObj: Document, shouldCacheResult: Boolean): Double = js.native
  }
}
