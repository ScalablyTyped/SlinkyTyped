package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Property
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extended argument for commands like "open"
  *
  * We're extending {@link OpenCommandArgument} even more, to provide some opening flags on to webdav.
  * @see XCommandProcessor
  */
@js.native
trait OpenCommandArgument3 extends OpenCommandArgument2 {
  
  /**
    * Flags to use for opening.
    *
    * WebDav e.g. uses "KeepAlive" to enable/disable the respective http feature.
    */
  var OpeningFlags: SafeArray[NamedValue] = js.native
}
object OpenCommandArgument3 {
  
  @scala.inline
  def apply(
    Mode: Double,
    OpeningFlags: SafeArray[NamedValue],
    Priority: Double,
    Properties: SafeArray[Property],
    Sink: XInterface,
    SortingInfo: SafeArray[NumberedSortingInfo]
  ): OpenCommandArgument3 = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], OpeningFlags = OpeningFlags.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any], SortingInfo = SortingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCommandArgument3]
  }
  
  @scala.inline
  implicit class OpenCommandArgument3MutableBuilder[Self <: OpenCommandArgument3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpeningFlags(value: SafeArray[NamedValue]): Self = StObject.set(x, "OpeningFlags", value.asInstanceOf[js.Any])
  }
}
