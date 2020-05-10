package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit._editor.plugins.FontChoice.FontDropDown
import typingsSlinky.dojo.dijit._editor.plugins.FontChoice.FontNameDropDown
import typingsSlinky.dojo.dijit._editor.plugins.FontChoice.FontSizeDropDown
import typingsSlinky.dojo.dijit._editor.plugins.FontChoice.FormatBlockDropDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFontChoice extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontDropDown.html
    *
    * Base class for widgets that contains a label (like "Font:")
    * and a FilteringSelect drop down to pick a value.
    * Used as Toolbar entry.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    FontDropDown
  ] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontNameDropDown.html
    *
    * Dropdown to select a font; goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontNameDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    FontNameDropDown
  ] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontSizeDropDown.html
    *
    * Dropdown to select a font size; goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontSizeDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    FontSizeDropDown
  ] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FormatBlockDropDown.html
    *
    * Dropdown to select a format (like paragraph or heading); goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FormatBlockDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    FormatBlockDropDown
  ] = js.native
}

object TypeofFontChoice {
  @scala.inline
  def apply(
    _FontDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      FontDropDown
    ],
    _FontNameDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      FontNameDropDown
    ],
    _FontSizeDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      FontSizeDropDown
    ],
    _FormatBlockDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      FormatBlockDropDown
    ]
  ): TypeofFontChoice = {
    val __obj = js.Dynamic.literal(_FontDropDown = _FontDropDown.asInstanceOf[js.Any], _FontNameDropDown = _FontNameDropDown.asInstanceOf[js.Any], _FontSizeDropDown = _FontSizeDropDown.asInstanceOf[js.Any], _FormatBlockDropDown = _FormatBlockDropDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFontChoice]
  }
  @scala.inline
  implicit class TypeofFontChoiceOps[Self <: TypeofFontChoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_FontDropDown(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          FontDropDown
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_FontDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_FontNameDropDown(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          FontNameDropDown
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_FontNameDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_FontSizeDropDown(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          FontSizeDropDown
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_FontSizeDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_FormatBlockDropDown(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          FormatBlockDropDown
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_FormatBlockDropDown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

