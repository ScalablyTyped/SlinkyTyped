package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tooltip")
@js.native
class Tooltip protected ()
  extends typingsSlinky.ejWebAll.ej.Tooltip {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Tooltip {
  
  @JSGlobal("ej.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tooltip.Associate")
  @js.native
  object Associate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tooltip.Associate with Double] = js.native
    
    /* 3 */ val Axis: typingsSlinky.ejWebAll.ej.Tooltip.Associate.Axis with Double = js.native
    
    /* 2 */ val MouseEnter: typingsSlinky.ejWebAll.ej.Tooltip.Associate.MouseEnter with Double = js.native
    
    /* 1 */ val MouseFollow: typingsSlinky.ejWebAll.ej.Tooltip.Associate.MouseFollow with Double = js.native
    
    /* 0 */ val Target: typingsSlinky.ejWebAll.ej.Tooltip.Associate.Target with Double = js.native
    
    /* 4 */ val Window: typingsSlinky.ejWebAll.ej.Tooltip.Associate.Window with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.CloseMode")
  @js.native
  object CloseMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tooltip.CloseMode with Double] = js.native
    
    /* 1 */ val Auto: typingsSlinky.ejWebAll.ej.Tooltip.CloseMode.Auto with Double = js.native
    
    /* 2 */ val None: typingsSlinky.ejWebAll.ej.Tooltip.CloseMode.None with Double = js.native
    
    /* 0 */ val Sticky: typingsSlinky.ejWebAll.ej.Tooltip.CloseMode.Sticky with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.Collision")
  @js.native
  object Collision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tooltip.Collision with Double] = js.native
    
    /* 1 */ val Fit: typingsSlinky.ejWebAll.ej.Tooltip.Collision.Fit with Double = js.native
    
    /* 0 */ val Flip: typingsSlinky.ejWebAll.ej.Tooltip.Collision.Flip with Double = js.native
    
    /* 2 */ val FlipFit: typingsSlinky.ejWebAll.ej.Tooltip.Collision.FlipFit with Double = js.native
    
    /* 3 */ val None: typingsSlinky.ejWebAll.ej.Tooltip.Collision.None with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tooltip.Trigger")
  @js.native
  object Trigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tooltip.Trigger with Double] = js.native
    
    /* 0 */ val Click: typingsSlinky.ejWebAll.ej.Tooltip.Trigger.Click with Double = js.native
    
    /* 2 */ val Focus: typingsSlinky.ejWebAll.ej.Tooltip.Trigger.Focus with Double = js.native
    
    /* 1 */ val Hover: typingsSlinky.ejWebAll.ej.Tooltip.Trigger.Hover with Double = js.native
  }
  
  @JSGlobal("ej.Tooltip.effect")
  @js.native
  object effect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tooltip.effect with Double] = js.native
    
    /* 2 */ val Fade: typingsSlinky.ejWebAll.ej.Tooltip.effect.Fade with Double = js.native
    
    /* 0 */ val None: typingsSlinky.ejWebAll.ej.Tooltip.effect.None with Double = js.native
    
    /* 1 */ val Slide: typingsSlinky.ejWebAll.ej.Tooltip.effect.Slide with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tooltip.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Tooltip = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
