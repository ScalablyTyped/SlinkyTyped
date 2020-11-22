package typingsSlinky.ow

import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @js.native
  /**
    @hidden
    */
  class ErrorPredicate ()
    extends Predicate[js.Error] {
    def this(options: PredicateOptions) = this()
    
    /**
      Test an Error to be an EvalError.
      */
    def evalError: this.type = js.native
    
    /**
      Test the error object to have specific keys.
      @param keys - One or more keys which should be part of the error object.
      */
    def hasKeys(keys: String*): this.type = js.native
    
    /**
      Test an error to be of a specific instance type.
      @param instance - The expected instance type of the error.
      */
    def instanceOf(instance: js.Function): this.type = js.native
    
    /**
      Test an error to have a specific message.
      @param expected - Expected message of the Error.
      */
    def message(expected: String): this.type = js.native
    
    /**
      Test the error message to include a specific message.
      @param message - Message that should be included in the error.
      */
    def messageIncludes(message: String): this.type = js.native
    
    /**
      Test an error to have a specific name.
      @param expected - Expected name of the Error.
      */
    def name(expected: String): this.type = js.native
    
    /**
      Test an Error to be a RangeError.
      */
    def rangeError: this.type = js.native
    
    /**
      Test an Error to be a ReferenceError.
      */
    def referenceError: this.type = js.native
    
    /**
      Test an Error to be a SyntaxError.
      */
    def syntaxError: this.type = js.native
    
    /**
      Test an Error to be a TypeError.
      */
    def typeError: this.type = js.native
    
    /**
      Test an Error to be a URIError.
      */
    def uriError: this.type = js.native
  }
}
