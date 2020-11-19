package typingsSlinky.openui5.sap.ui.test

import typingsSlinky.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.test.gherkin")
@js.native
object gherkin extends js.Object {
  
  @js.native
  trait StepDefinitions extends Object {
    
    /**
      * Closes the application and cleans up any mess made by the tests. To avoid erroneous exceptions
      * during testexecution, make sure that it is safe to run this method even if the application was never
      * started.
      */
    def closeApplication(): Unit = js.native
    
    /**
      * Registers the step definitions by calling the method 'register'. The order of the register calls is
      * important.The first step definition whose regular expression matches the step text is the one that
      * will be executed,however, the step definitions are checked in REVERSE ORDER (i.e. the last one you
      * wrote is checked first).
      */
    def init(): Unit = js.native
    
    /**
      * Registers a step definition.
      * @param rRegex the regular expression that matches the feature file step (with leading 'Given',
      * 'When',                         'Then' or 'But' removed). E.g. if the feature file has the step     
      *                    "Then I should be served a coffee" it will truncated to "I should be served a
      * coffee"                         and tested against 'rRegex' to check for a match. The simple regular
      * expression                         /^I should be served a coffee$/i would match this text. The
      * regular                         expression can specify capturing groups, which will be passed as
      * parameters to 'fnFunc'.
      * @param fnFunc the function to execute in the event that the regular expression matches. Receives    
      *                       regular expression capturing groups as parameters in the same order that they
      * are                           specified in the regular expression. If a data table is specified for
      * the step, it                           will be passed as an additional final parameter. At execution
      * time, all functions                           within a particular scenario will execute within the
      * same 'this' context.
      */
    def register(rRegex: js.RegExp, fnFunc: js.Any): Unit = js.native
  }
}
