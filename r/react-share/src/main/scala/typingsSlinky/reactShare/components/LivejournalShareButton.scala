package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropstitDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LivejournalShareButton {
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitDescription_565732901 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitDescription_565732901(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitDescription]))
  }
  
  @JSImport("react-share", "LivejournalShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CommonShareButtonPropstitDescription): SharedBuilder_CommonShareButtonPropstitDescription_565732901 = new SharedBuilder_CommonShareButtonPropstitDescription_565732901(js.Array(this.component, p.asInstanceOf[js.Any]))
}
