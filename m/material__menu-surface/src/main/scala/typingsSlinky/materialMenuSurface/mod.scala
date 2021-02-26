package typingsSlinky.materialMenuSurface

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.materialMenuSurface.anon.PartialMDCMenuSurfaceAdap
import typingsSlinky.materialMenuSurface.utilMod.CssTransformPropertyName
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
  @JSImport("@material/menu-surface", "Corner")
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
  
  /**
    * Enum for bits in the {@see Corner) bitmap.
    */
  @JSImport("@material/menu-surface", "CornerBit")
  @js.native
  object CornerBit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialMenuSurface.constantsMod.CornerBit with Double] = js.native
    
    /* 1 */ val BOTTOM: typingsSlinky.materialMenuSurface.constantsMod.CornerBit.BOTTOM with Double = js.native
    
    /* 2 */ val CENTER: typingsSlinky.materialMenuSurface.constantsMod.CornerBit.CENTER with Double = js.native
    
    /* 8 */ val FLIP_RTL: typingsSlinky.materialMenuSurface.constantsMod.CornerBit.FLIP_RTL with Double = js.native
    
    /* 4 */ val RIGHT: typingsSlinky.materialMenuSurface.constantsMod.CornerBit.RIGHT with Double = js.native
  }
  
  @JSImport("@material/menu-surface", "MDCMenuSurface")
  @js.native
  class MDCMenuSurface protected ()
    extends typingsSlinky.materialMenuSurface.componentMod.MDCMenuSurface {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialMenuSurface.foundationMod.MDCMenuSurfaceFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCMenuSurface {
    
    @JSImport("@material/menu-surface", "MDCMenuSurface.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialMenuSurface.componentMod.MDCMenuSurface = js.native
  }
  
  @JSImport("@material/menu-surface", "MDCMenuSurfaceFoundation")
  @js.native
  class MDCMenuSurfaceFoundation ()
    extends typingsSlinky.materialMenuSurface.foundationMod.MDCMenuSurfaceFoundation {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
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
    
    @JSImport("@material/menu-surface", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu-surface", "cssClasses.ANCHOR")
    @js.native
    def ANCHOR: String = js.native
    @scala.inline
    def ANCHOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.ANIMATING_CLOSED")
    @js.native
    def ANIMATING_CLOSED: String = js.native
    @scala.inline
    def ANIMATING_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.ANIMATING_OPEN")
    @js.native
    def ANIMATING_OPEN: String = js.native
    @scala.inline
    def ANIMATING_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.FIXED")
    @js.native
    def FIXED: String = js.native
    @scala.inline
    def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.IS_OPEN_BELOW")
    @js.native
    def IS_OPEN_BELOW: String = js.native
    @scala.inline
    def IS_OPEN_BELOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_OPEN_BELOW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/menu-surface", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    /** Ratio of anchor width to menu-surface width for switching from corner positioning to center positioning. */
    @JSImport("@material/menu-surface", "numbers.ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")
    @js.native
    def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    @scala.inline
    def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")(x.asInstanceOf[js.Any])
    
    /** Margin left to the edge of the viewport when menu-surface is at maximum possible height. Also used as a viewport margin. */
    @JSImport("@material/menu-surface", "numbers.MARGIN_TO_EDGE")
    @js.native
    def MARGIN_TO_EDGE: Double = js.native
    @scala.inline
    def MARGIN_TO_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN_TO_EDGE")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface close animation. */
    @JSImport("@material/menu-surface", "numbers.TRANSITION_CLOSE_DURATION")
    @js.native
    def TRANSITION_CLOSE_DURATION: Double = js.native
    @scala.inline
    def TRANSITION_CLOSE_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CLOSE_DURATION")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface open animation. */
    @JSImport("@material/menu-surface", "numbers.TRANSITION_OPEN_DURATION")
    @js.native
    def TRANSITION_OPEN_DURATION: Double = js.native
    @scala.inline
    def TRANSITION_OPEN_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_OPEN_DURATION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/menu-surface", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu-surface", "strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    @scala.inline
    def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "strings.FOCUSABLE_ELEMENTS")
    @js.native
    def FOCUSABLE_ELEMENTS: String = js.native
    @scala.inline
    def FOCUSABLE_ELEMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_ELEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface", "strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    @scala.inline
    def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    /**
      * Returns the name of the correct transform property to use on the current browser.
      */
    @JSImport("@material/menu-surface", "util.getTransformPropertyName")
    @js.native
    def getTransformPropertyName(globalObj: Window): CssTransformPropertyName = js.native
    @JSImport("@material/menu-surface", "util.getTransformPropertyName")
    @js.native
    def getTransformPropertyName(globalObj: Window, forceRefresh: Boolean): CssTransformPropertyName = js.native
  }
}
