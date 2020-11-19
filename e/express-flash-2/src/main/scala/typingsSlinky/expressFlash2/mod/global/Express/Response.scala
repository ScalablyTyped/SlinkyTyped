package typingsSlinky.expressFlash2.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  /**
    * Queue flash `msg` of the given `type`.
    *
    * Examples:
    *
    *      req.flash('info', 'email sent');
    *      req.flash('error', 'email delivery failed');
    *      req.flash('info', 'email re-sent');
    *
    *
    * Formatting:
    *
    * Flash notifications also support arbitrary formatting support.
    * For example you may pass variable arguments to `req.flash()`
    * and use the %s specifier to be replaced by the associated argument:
    *
    *     req.flash('info', 'email has been sent to %s.', userName);
    *
    * Formatting uses `util.format()`, which is available on Node 0.6+.
    */
  def flash(`type`: String, msg: String): Unit = js.native
  def flash(`type`: String, msg: js.Array[_]): Unit = js.native
  
  var locals: typingsSlinky.expressFlash2.anon.Flash = js.native
}
