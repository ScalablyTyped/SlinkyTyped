package typingsSlinky.rrule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rrulesetMod {
  
  @JSImport("rrule/dist/esm/src/rruleset", JSImport.Default)
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class default () extends RRuleSet {
    def this(noCache: Boolean) = this()
  }
  
  @js.native
  trait RRuleSet
    extends typingsSlinky.rrule.rruleMod.default {
    
    var _dtstart: js.Any = js.native
    
    val _exdate: js.Array[js.Date] = js.native
    
    val _exrule: js.Array[typingsSlinky.rrule.rruleMod.default] = js.native
    
    val _rdate: js.Array[js.Date] = js.native
    
    val _rrule: js.Array[typingsSlinky.rrule.rruleMod.default] = js.native
    
    var _tzid: js.Any = js.native
    
    var dtstart: js.Any = js.native
    
    /**
      * Adds an EXDATE to the set
      *
      * @param {Date}
      */
    def exdate(date: js.Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of exdates
      */
    def exdates(): js.Array[js.Date] = js.native
    
    /**
      * Adds an EXRULE to the set
      *
      * @param {RRule}
      */
    def exrule(rrule: typingsSlinky.rrule.rruleMod.default): Unit = js.native
    
    /**
      * Get list of excluded rrules in this recurrence set.
      *
      * @return List of exrules
      */
    def exrules(): js.Array[typingsSlinky.rrule.rruleMod.default | RRuleSet] = js.native
    
    /**
      * Adds an RDate to the set
      *
      * @param {Date}
      */
    def rdate(date: js.Date): Unit = js.native
    
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of rdates
      */
    def rdates(): js.Array[js.Date] = js.native
    
    /**
      * Adds an RRule to the set
      *
      * @param {RRule}
      */
    def rrule(rrule: typingsSlinky.rrule.rruleMod.default): Unit = js.native
    
    /**
      * Get list of included rrules in this recurrence set.
      *
      * @return List of rrules
      */
    def rrules(): js.Array[typingsSlinky.rrule.rruleMod.default | RRuleSet] = js.native
    
    var tzid: js.Any = js.native
  }
}
