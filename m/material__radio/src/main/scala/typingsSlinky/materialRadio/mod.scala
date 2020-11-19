package typingsSlinky.materialRadio

import org.scalajs.dom.raw.Element
import typingsSlinky.materialRadio.adapterMod.MDCRadioAdapter
import typingsSlinky.materialRadio.anon.DISABLED
import typingsSlinky.materialRadio.anon.NATIVECONTROLSELECTOR
import typingsSlinky.materialRadio.anon.PartialMDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/radio", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCRadio ()
    extends typingsSlinky.materialRadio.componentMod.MDCRadio
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialRadio.componentMod.MDCRadio = js.native
  }
  
  @js.native
  class MDCRadioFoundation ()
    extends typingsSlinky.materialRadio.foundationMod.MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    
    def cssClasses: DISABLED = js.native
    
    def defaultAdapter: MDCRadioAdapter = js.native
    
    def strings: NATIVECONTROLSELECTOR = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var DISABLED: String = js.native
    
    var ROOT: String = js.native
  }
  
  /**
    * @license
    * Copyright 2016 Google Inc.
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
  object strings extends js.Object {
    
    var NATIVE_CONTROL_SELECTOR: String = js.native
  }
}
