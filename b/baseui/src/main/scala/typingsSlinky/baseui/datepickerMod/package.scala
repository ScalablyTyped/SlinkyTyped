package typingsSlinky.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datepickerMod {
  
  @scala.inline
  def DISPLAY_FORMAT: typingsSlinky.baseui.baseuiStrings.L = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DISPLAY_FORMAT").asInstanceOf[typingsSlinky.baseui.baseuiStrings.L]
  
  @scala.inline
  def ISO_FORMAT: typingsSlinky.baseui.baseuiStrings.`YYYY-MM-DD` = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_FORMAT").asInstanceOf[typingsSlinky.baseui.baseuiStrings.`YYYY-MM-DD`]
  
  @scala.inline
  def ISO_MONTH_FORMAT: typingsSlinky.baseui.baseuiStrings.`YYYY-MM` = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_MONTH_FORMAT").asInstanceOf[typingsSlinky.baseui.baseuiStrings.`YYYY-MM`]
  
  type StateReducer = js.Function3[
    /* stateType */ typingsSlinky.baseui.baseuiStrings.mouseLeave | typingsSlinky.baseui.baseuiStrings.moveRight | typingsSlinky.baseui.baseuiStrings.moveDown | typingsSlinky.baseui.baseuiStrings.moveUp | typingsSlinky.baseui.baseuiStrings.mouseOver | typingsSlinky.baseui.baseuiStrings.change_ | typingsSlinky.baseui.baseuiStrings.moveLeft, 
    /* nextState */ typingsSlinky.baseui.datepickerMod.ContainerState, 
    /* currentState */ typingsSlinky.baseui.datepickerMod.ContainerState, 
    typingsSlinky.baseui.datepickerMod.ContainerState
  ]
  
  @scala.inline
  def StatefulCalendar: slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsCa] = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulCalendar").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsCa]]
  
  @scala.inline
  def StatefulDatePicker_ : slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsDa] = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulDatePicker").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsDa]]
  
  @scala.inline
  def StatefulDatepicker: slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsDa] = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulDatepicker").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.anon.StatefulDatepickerPropsDa]]
  
  type StatefulDatepickerProps[T] = T with typingsSlinky.baseui.datepickerMod.StatefulContainerProps[T] with typingsSlinky.baseui.anon.Children[T]
  
  @scala.inline
  def WEEKDAYS: js.Tuple7[
    typingsSlinky.baseui.baseuiNumbers.`0`, 
    typingsSlinky.baseui.baseuiNumbers.`1`, 
    typingsSlinky.baseui.baseuiNumbers.`2`, 
    typingsSlinky.baseui.baseuiNumbers.`3`, 
    typingsSlinky.baseui.baseuiNumbers.`4`, 
    typingsSlinky.baseui.baseuiNumbers.`5`, 
    typingsSlinky.baseui.baseuiNumbers.`6`
  ] = typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("WEEKDAYS").asInstanceOf[js.Tuple7[
    typingsSlinky.baseui.baseuiNumbers.`0`, 
    typingsSlinky.baseui.baseuiNumbers.`1`, 
    typingsSlinky.baseui.baseuiNumbers.`2`, 
    typingsSlinky.baseui.baseuiNumbers.`3`, 
    typingsSlinky.baseui.baseuiNumbers.`4`, 
    typingsSlinky.baseui.baseuiNumbers.`5`, 
    typingsSlinky.baseui.baseuiNumbers.`6`
  ]]
  
  @scala.inline
  def formatDate(date: js.Array[js.Date], formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = (typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String]]
  @scala.inline
  def formatDate(date: js.Date, formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = (typingsSlinky.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String]]
  
  type onChange = js.Function1[/* args */ typingsSlinky.baseui.anon.Date, js.Any]
}
