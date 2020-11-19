package typingsSlinky.materialUiCore.inputBaseInputBaseMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBaseComponentProps
  extends HTMLAttributes[HTMLInputElement | HTMLTextAreaElement]
     with // Accommodate arbitrary additional props coming from the `inputProps` prop
/* arbitrary */ StringDictionary[js.Any]
object InputBaseComponentProps {
  
  @scala.inline
  def apply(): InputBaseComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBaseComponentProps]
  }
}
