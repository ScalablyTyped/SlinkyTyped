package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialRadio.anon.PartialMDCRadioAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radio {
  
  @JSImport("material-components-web", "radio.MDCRadio")
  @js.native
  class MDCRadio protected ()
    extends typingsSlinky.materialRadio.mod.MDCRadio {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialRadio.foundationMod.MDCRadioFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCRadio {
    
    @JSImport("material-components-web", "radio.MDCRadio.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialRadio.componentMod.MDCRadio = js.native
  }
  
  @JSImport("material-components-web", "radio.MDCRadioFoundation")
  @js.native
  class MDCRadioFoundation ()
    extends typingsSlinky.materialRadio.mod.MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "radio.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "radio.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    @scala.inline
    def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "radio.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
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
  object strings {
    
    @JSImport("material-components-web", "radio.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "radio.strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    @scala.inline
    def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
