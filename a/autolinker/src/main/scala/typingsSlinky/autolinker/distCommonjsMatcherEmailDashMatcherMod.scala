package typingsSlinky.autolinker

import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher/email-matcher", JSImport.Namespace)
@js.native
object distCommonjsMatcherEmailDashMatcherMod extends js.Object {
  @js.native
  class EmailMatcher () extends Matcher {
    /**
      * Valid characters that can be used in the "local" part of an email address,
      * i.e. the "name" part of "name@site.com"
      */
    var localPartCharRegex: js.RegExp = js.native
    /**
      * Stricter TLD regex which adds a beginning and end check to ensure
      * the string is a valid TLD
      */
    var strictTldRegex: js.RegExp = js.native
  }
  
}

