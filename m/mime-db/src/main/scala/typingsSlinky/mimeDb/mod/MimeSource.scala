package typingsSlinky.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sources:
  * http://www.iana.org/assignments/media-types/media-types.xhtml
  * http://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types
  * http://hg.nginx.org/nginx/raw-file/default/conf/mime.types
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mimeDb.mimeDbStrings.iana
  - typingsSlinky.mimeDb.mimeDbStrings.apache
  - typingsSlinky.mimeDb.mimeDbStrings.nginx
*/
trait MimeSource extends js.Object

object MimeSource {
  @scala.inline
  def apache: typingsSlinky.mimeDb.mimeDbStrings.apache = "apache".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.apache]
  @scala.inline
  def iana: typingsSlinky.mimeDb.mimeDbStrings.iana = "iana".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.iana]
  @scala.inline
  def nginx: typingsSlinky.mimeDb.mimeDbStrings.nginx = "nginx".asInstanceOf[typingsSlinky.mimeDb.mimeDbStrings.nginx]
}

