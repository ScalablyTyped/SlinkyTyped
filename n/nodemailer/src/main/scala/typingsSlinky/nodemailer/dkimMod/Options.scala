package typingsSlinky.nodemailer.dkimMod

import typingsSlinky.nodemailer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.dkimMod.SingleKeyOptions
  - typingsSlinky.nodemailer.dkimMod.MultipleKeysOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def SingleKeyOptions(domainName: String, keySelector: String, privateKey: String | Key): Options = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def MultipleKeysOptions(keys: js.Array[SingleKeyOptions]): Options = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

