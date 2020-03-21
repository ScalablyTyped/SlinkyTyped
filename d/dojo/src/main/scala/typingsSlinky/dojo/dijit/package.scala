package typingsSlinky.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dijit {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/BackgroundIframe.html
    *
    * For IE/FF z-index shenanigans. id attribute is required.
    * new dijit.BackgroundIframe(node).
    * 
    * Makes a background iframe as a child of node, that fills
    * area (and position) of node
    * 
    * @param node     
    */
  type BackgroundIframe = js.Function1[/* node */ org.scalajs.dom.raw.HTMLElement, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_BidiSupport.html
    *
    * Deprecated module for enabling textdir support in the dijit widgets.   New code should just define
    * has("dojo-bidi") to return true, rather than manually requiring this module.
    * 
    */
  type BidiSupport = js.Function0[scala.Unit]
  type Calendar = typingsSlinky.dojo.dijit.Calendar_
  type CalendarLite = typingsSlinky.dojo.dijit.CalendarLite_
  type ColorPalette = typingsSlinky.dojo.dijit.ColorPalette_
  type Dialog = typingsSlinky.dojo.dijit.Dialog_
  type InlineEditBox = typingsSlinky.dojo.dijit.InlineEditBox_
  type MenuBarItem = typingsSlinky.dojo.dijit.MenuBarItem_
  type OnDijitClickMixin = typingsSlinky.dojo.dijit.OnDijitClickMixin_
  type PaletteMixin = typingsSlinky.dojo.dijit.PaletteMixin_
  type TemplatedMixin = typingsSlinky.dojo.dijit.TemplatedMixin_
  type TimePicker = typingsSlinky.dojo.dijit.TimePicker_
  type Tooltip = typingsSlinky.dojo.dijit.Tooltip_
  type Tree_ = typingsSlinky.dojo.dijit.Tree__
  type base = typingsSlinky.dojo.dijit.base_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/hccss.html
    *
    * Test if computer is in high contrast mode, and sets dijit_a11y flag on <body> if it is.
    * Deprecated, use dojo/hccss instead.
    * 
    */
  type hccss = js.Function0[scala.Unit]
  type main = typingsSlinky.dojo.dijit.main_
  type place = typingsSlinky.dojo.dijit.place_
  type registry = typingsSlinky.dojo.dijit.registry_
}
