package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.Calendar.MonthDropDown
import typingsSlinky.dojo.dijit.Calendar.MonthDropDownButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCalendar extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Calendar._MonthDropDown.html
    *
    * The list-of-months drop down from the MonthDropDownButton
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _MonthDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    MonthDropDown
  ] = js.native
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Calendar._MonthDropDownButton.html
    *
    * DropDownButton for the current month.    Displays name of current month
    * and a list of month names in the drop down
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _MonthDropDownButton: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    MonthDropDownButton
  ] = js.native
}

object TypeofCalendar {
  @scala.inline
  def apply(
    _MonthDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      MonthDropDown
    ],
    _MonthDropDownButton: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      MonthDropDownButton
    ]
  ): TypeofCalendar = {
    val __obj = js.Dynamic.literal(_MonthDropDown = _MonthDropDown.asInstanceOf[js.Any], _MonthDropDownButton = _MonthDropDownButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalendar]
  }
  @scala.inline
  implicit class TypeofCalendarOps[Self <: TypeofCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_MonthDropDown(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          MonthDropDown
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_MonthDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_MonthDropDownButton(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          MonthDropDownButton
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_MonthDropDownButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

