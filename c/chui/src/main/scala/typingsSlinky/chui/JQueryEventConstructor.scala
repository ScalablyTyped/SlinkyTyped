package typingsSlinky.chui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used to construct jQuery events (with $.Event). It is
  * defined separately instead of inline in JQueryStatic to allow
  * overriding the construction function with specific strings
  * returning specific event objects.
  */
@js.native
trait JQueryEventConstructor
  extends Instantiable1[/* name */ String, JQueryEventObject]
     with Instantiable2[/* name */ String, /* eventProperties */ js.Any, JQueryEventObject] {
  
  def apply(name: String): JQueryEventObject = js.native
  def apply(name: String, eventProperties: js.Any): JQueryEventObject = js.native
}
