package typingsSlinky.isemail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    *  ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@e.com");
    * // => true
    * ```
    */
  def validate(email: String): Boolean = js.native
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    * ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@iana.org", { errorLevel: false });
    * // => true
    * ```
    */
  def validate(email: String, options: OptionsWithBool): Boolean = js.native
  /**
    * Check that an email address conforms to RFCs 5321, 5322, 6530 and others.
    *
    * ```
    * import * as IsEmail from "isemail";
    *
    * IsEmail.validate("test@iana.org", { errorLevel: true });
    * // => 0
    * IsEmail.validate("test @e.com", { errorLevel: 50 });
    * // => 0
    * IsEmail.validate('test @e.com', { errorLevel: true })
    * // => 49
    * ```
    */
  def validate(email: String, options: OptionsWithNumThreshold): Double = js.native
}
