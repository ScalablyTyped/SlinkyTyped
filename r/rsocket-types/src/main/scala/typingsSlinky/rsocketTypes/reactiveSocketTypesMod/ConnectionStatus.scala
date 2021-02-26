package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketTypes.rsocketTypesStrings.CLOSED
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CONNECTED
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CONNECTING
import typingsSlinky.rsocketTypes.rsocketTypesStrings.ERROR
import typingsSlinky.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketTypes.anon.Kind
  - typingsSlinky.rsocketTypes.anon.`0`
  - typingsSlinky.rsocketTypes.anon.`1`
  - typingsSlinky.rsocketTypes.anon.`2`
  - typingsSlinky.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  @scala.inline
  def `0`(kind: CONNECTING): typingsSlinky.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.anon.`0`]
  }
  
  @scala.inline
  def `1`(kind: CONNECTED): typingsSlinky.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.anon.`1`]
  }
  
  @scala.inline
  def `2`(kind: CLOSED): typingsSlinky.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.anon.`2`]
  }
  
  @scala.inline
  def Error(error: js.Error, kind: ERROR): typingsSlinky.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.anon.Error]
  }
  
  @scala.inline
  def Kind(kind: NOT_CONNECTED): typingsSlinky.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rsocketTypes.anon.Kind]
  }
}
