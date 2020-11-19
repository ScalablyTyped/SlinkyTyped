package typingsSlinky.lightpick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Options {
  
  type Dropdowns = typingsSlinky.lightpick.mod.Options.Dropdowns_
  
  type Locale = typingsSlinky.lightpick.mod.Options.Locale_
  
  /**
    * Callback function for when the picker is hidden.
    */
  type OnCloseFn = js.ThisFunction0[/* this */ typingsSlinky.lightpick.mod.Lightpick, scala.Unit]
  
  type OnErrorFn = js.ThisFunction1[
    /* this */ typingsSlinky.lightpick.mod.Lightpick, 
    /* message */ java.lang.String, 
    scala.Unit
  ]
  
  /**
    * Callback function for when the months select is changed.
    */
  type OnMonthsChangeFn = js.ThisFunction1[
    /* this */ typingsSlinky.lightpick.mod.Lightpick, 
    /* month */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Callback function for when the picker becomes visible.
    */
  type OnOpenFn = js.ThisFunction0[/* this */ typingsSlinky.lightpick.mod.Lightpick, scala.Unit]
  
  /**
    * Callback function for when a date is selected.
    */
  type OnSelectFn = js.ThisFunction2[
    /* this */ typingsSlinky.lightpick.mod.Lightpick, 
    /* startDate */ typingsSlinky.lightpick.mod.OutputDate, 
    /* endDate */ typingsSlinky.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  
  /**
    * Callback function for when either a start or an end date is selected.
    */
  type OnSelectStartEndFn = js.ThisFunction1[
    /* this */ typingsSlinky.lightpick.mod.Lightpick, 
    /* date */ typingsSlinky.lightpick.mod.OutputDate, 
    scala.Unit
  ]
  
  /**
    * Callback function for when the years select is changed.
    */
  type OnYearsChangeFn = js.ThisFunction1[
    /* this */ typingsSlinky.lightpick.mod.Lightpick, 
    /* year */ scala.Double, 
    scala.Unit
  ]
}
