package typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod

import typingsSlinky.autolinker.distCommonjsAutolinkerMod.HashtagServices
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher/hashtag-matcher", "HashtagMatcher")
@js.native
class HashtagMatcher protected () extends Matcher {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match instance,
    *   specified in an Object (map).
    */
  def this(cfg: HashtagMatcherConfig) = this()
  /**
    * The regular expression to match Hashtags. Example match:
    *
    *     #asdf
    *
    * @protected
    * @property {RegExp} matcherRegex
    */
  var matcherRegex: js.RegExp = js.native
  /**
    * The regular expression to use to check the character before a username match to
    * make sure we didn't accidentally match an email address.
    *
    * For example, the string "asdf@asdf.com" should not match "@asdf" as a username.
    *
    * @protected
    * @property {RegExp} nonWordCharRegex
    */
  var nonWordCharRegex: js.RegExp = js.native
  /**
    * @cfg {String} serviceName
    *
    * The service to point hashtag matches to. See {@link Autolinker#hashtag}
    * for available values.
    */
  val serviceName: HashtagServices = js.native
}

