package typingsSlinky.autolinker.mentionMatcherMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.autolinker.autolinkerMod.MentionServices
import typingsSlinky.autolinker.matcherMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autolinker/dist/commonjs/matcher/mention-matcher", "MentionMatcher")
@js.native
class MentionMatcher protected () extends Matcher {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match instance,
    *   specified in an Object (map).
    */
  def this(cfg: MentionMatcherConfig) = this()
  
  /**
    * Hash of regular expression to match username handles. Example match:
    *
    *     @asdf
    *
    * @private
    * @property {Object} matcherRegexes
    */
  val matcherRegexes: StringDictionary[js.RegExp] = js.native
  
  /**
    * The regular expression to use to check the character before a username match to
    * make sure we didn't accidentally match an email address.
    *
    * For example, the string "asdf@asdf.com" should not match "@asdf" as a username.
    *
    * @private
    * @property {RegExp} nonWordCharRegex
    */
  val nonWordCharRegex: js.RegExp = js.native
  
  /**
    * @cfg {'twitter'/'instagram'/'soundcloud'} protected
    *
    * The name of service to link @mentions to.
    *
    * Valid values are: 'twitter', 'instagram', or 'soundcloud'
    */
  var serviceName: MentionServices = js.native
}
