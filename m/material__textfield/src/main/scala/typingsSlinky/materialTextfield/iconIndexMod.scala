package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTextfield.anon.ICONEVENT
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldIconAd
import typingsSlinky.materialTextfield.anon.ROOT
import typingsSlinky.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/icon/index", JSImport.Namespace)
@js.native
object iconIndexMod extends js.Object {
  
  @js.native
  class MDCTextFieldIcon ()
    extends typingsSlinky.materialTextfield.iconComponentMod.MDCTextFieldIcon
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTextfield.iconComponentMod.MDCTextFieldIcon = js.native
  }
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typingsSlinky.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    /**
      * See {@link MDCTextFieldIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldIconAdapter = js.native
    
    def strings: ICONEVENT = js.native
  }
  
  @js.native
  object iconCssClasses extends js.Object {
    
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
  object iconStrings extends js.Object {
    
    var ICON_EVENT: String = js.native
    
    var ICON_ROLE: String = js.native
  }
}
