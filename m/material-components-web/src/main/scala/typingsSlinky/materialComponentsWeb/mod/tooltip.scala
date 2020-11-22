package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTooltip.adapterMod.MDCTooltipAdapter
import typingsSlinky.materialTooltip.anon.PartialMDCTooltipAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "tooltip")
@js.native
object tooltip extends js.Object {
  
  /**
    * Enum for possible anchor boundary types. This determines the gap between the
    * bottom of the anchor and the tooltip element.
    * Bounded anchors have an identifiable boundary (e.g. buttons).
    * Unbounded anchors don't have a visually declared boundary (e.g. plain text).
    */
  @js.native
  object AnchorBoundaryType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialTooltip.constantsMod.AnchorBoundaryType with Double] = js.native
    
    /* 0 */ val BOUNDED: typingsSlinky.materialTooltip.constantsMod.AnchorBoundaryType.BOUNDED with Double = js.native
    
    /* 1 */ val UNBOUNDED: typingsSlinky.materialTooltip.constantsMod.AnchorBoundaryType.UNBOUNDED with Double = js.native
  }
  
  /**
    * @license
    * Copyright 2020 Google Inc.
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
  object CssClasses extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.materialTooltip.constantsMod.CssClasses with String] = js.native
    
    /* "mdc-tooltip--hide" */ val HIDE: typingsSlinky.materialTooltip.constantsMod.CssClasses.HIDE with String = js.native
    
    /* "mdc-tooltip--hide-transition" */ val HIDE_TRANSITION: typingsSlinky.materialTooltip.constantsMod.CssClasses.HIDE_TRANSITION with String = js.native
    
    /* "mdc-tooltip--multiline" */ val MULTILINE_TOOLTIP: typingsSlinky.materialTooltip.constantsMod.CssClasses.MULTILINE_TOOLTIP with String = js.native
    
    /* "mdc-tooltip--showing" */ val SHOWING: typingsSlinky.materialTooltip.constantsMod.CssClasses.SHOWING with String = js.native
    
    /* "mdc-tooltip--showing-transition" */ val SHOWING_TRANSITION: typingsSlinky.materialTooltip.constantsMod.CssClasses.SHOWING_TRANSITION with String = js.native
    
    /* "mdc-tooltip--shown" */ val SHOWN: typingsSlinky.materialTooltip.constantsMod.CssClasses.SHOWN with String = js.native
  }
  
  @js.native
  class MDCTooltip ()
    extends typingsSlinky.materialTooltip.mod.MDCTooltip
  /* static members */
  @js.native
  object MDCTooltip extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTooltip.componentMod.MDCTooltip = js.native
  }
  
  @js.native
  class MDCTooltipFoundation ()
    extends typingsSlinky.materialTooltip.mod.MDCTooltipFoundation {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTooltipFoundation extends js.Object {
    
    def defaultAdapter: MDCTooltipAdapter = js.native
  }
  
  /** Enum for possible tooltip positioning relative to its anchor element. */
  @js.native
  object XPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialTooltip.constantsMod.XPosition with Double] = js.native
    
    /* 2 */ val CENTER: typingsSlinky.materialTooltip.constantsMod.XPosition.CENTER with Double = js.native
    
    /* 0 */ val DETECTED: typingsSlinky.materialTooltip.constantsMod.XPosition.DETECTED with Double = js.native
    
    /* 3 */ val END: typingsSlinky.materialTooltip.constantsMod.XPosition.END with Double = js.native
    
    /* 1 */ val START: typingsSlinky.materialTooltip.constantsMod.XPosition.START with Double = js.native
  }
  
  @js.native
  object YPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialTooltip.constantsMod.YPosition with Double] = js.native
    
    /* 1 */ val ABOVE: typingsSlinky.materialTooltip.constantsMod.YPosition.ABOVE with Double = js.native
    
    /* 2 */ val BELOW: typingsSlinky.materialTooltip.constantsMod.YPosition.BELOW with Double = js.native
    
    /* 0 */ val DETECTED: typingsSlinky.materialTooltip.constantsMod.YPosition.DETECTED with Double = js.native
  }
  
  @js.native
  object events extends js.Object {
    
    var HIDDEN: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var BOUNDED_ANCHOR_GAP: Double = js.native
    
    var HIDE_DELAY_MS: Double = js.native
    
    var MAX_WIDTH: Double = js.native
    
    var MIN_HEIGHT: Double = js.native
    
    var MIN_VIEWPORT_TOOLTIP_THRESHOLD: Double = js.native
    
    var SHOW_DELAY_MS: Double = js.native
    
    var UNBOUNDED_ANCHOR_GAP: Double = js.native
  }
}
