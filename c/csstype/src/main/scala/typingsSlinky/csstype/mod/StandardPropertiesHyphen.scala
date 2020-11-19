package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardPropertiesHyphen[TLength, TTime]
  extends StandardLonghandPropertiesHyphen[TLength, TTime]
     with StandardShorthandPropertiesHyphen[TLength, TTime]
object StandardPropertiesHyphen {
  
  @scala.inline
  def apply[TLength, TTime](): StandardPropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropertiesHyphen[TLength, TTime]]
  }
}
