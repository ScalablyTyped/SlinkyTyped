package typingsSlinky.lightpick.lightpickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.lightpick.Anon_Value
  import typingsSlinky.lightpick.lightpickMod.Lightpick
  import typingsSlinky.lightpick.lightpickMod.OutputDate

  type Dropdowns = Dropdowns_
  type Field = Element with Anon_Value
  type Locale = Locale_
  /**
    * Callback function for when the picker is hidden.
    */
  type OnCloseFn = js.ThisFunction0[/* this */ Lightpick, Unit]
  type OnErrorFn = js.ThisFunction1[/* this */ Lightpick, /* message */ String, Unit]
  /**
    * Callback function for when the months select is changed.
    */
  type OnMonthsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* month */ Double, Unit]
  /**
    * Callback function for when the picker becomes visible.
    */
  type OnOpenFn = js.ThisFunction0[/* this */ Lightpick, Unit]
  /**
    * Callback function for when a date is selected.
    */
  type OnSelectFn = js.ThisFunction2[/* this */ Lightpick, /* startDate */ OutputDate, /* endDate */ OutputDate, Unit]
  /**
    * Callback function for when either a start or an end date is selected.
    */
  type OnSelectStartEndFn = js.ThisFunction1[/* this */ Lightpick, /* date */ OutputDate, Unit]
  /**
    * Callback function for when the years select is changed.
    */
  type OnYearsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* year */ Double, Unit]
}
