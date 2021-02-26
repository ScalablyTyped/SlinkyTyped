package typingsSlinky.psi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(url: java.lang.String): js.Promise[typingsSlinky.psi.mod.ResponseData] = typingsSlinky.psi.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.psi.mod.ResponseData]]
  @scala.inline
  def apply(url: java.lang.String, options: typingsSlinky.psi.mod.Options): js.Promise[typingsSlinky.psi.mod.ResponseData] = (typingsSlinky.psi.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.psi.mod.ResponseData]]
  
  /**
    * Output the formatted report to the terminal.
    */
  @scala.inline
  def output(url: java.lang.String): js.Promise[typingsSlinky.psi.mod.ResponseData] = typingsSlinky.psi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.psi.mod.ResponseData]]
  @scala.inline
  def output(url: java.lang.String, options: typingsSlinky.psi.mod.Options): js.Promise[typingsSlinky.psi.mod.ResponseData] = (typingsSlinky.psi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.psi.mod.ResponseData]]
}
