package typingsSlinky.jsDashGit.JSGit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAuthor extends js.Object {
  var date: js.Date
  var email: String
  var name: String
}

object GitAuthor {
  @scala.inline
  def apply(date: js.Date, email: String, name: String): GitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitAuthor]
  }
}

