package typingsSlinky.autolinker

import typingsSlinky.autolinker.matcherMatcherMod.Matcher
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMatcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher/email-matcher", "EmailMatcher")
  @js.native
  class EmailMatcher protected () extends Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
    
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
