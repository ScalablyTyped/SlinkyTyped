package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropstitBeforeOnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ViberShareButton {
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitBeforeOnClick1988889879 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitBeforeOnClick1988889879(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitBeforeOnClick]))
  }
  
  @JSImport("react-share", "ViberShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CommonShareButtonPropstitBeforeOnClick): SharedBuilder_CommonShareButtonPropstitBeforeOnClick1988889879 = new SharedBuilder_CommonShareButtonPropstitBeforeOnClick1988889879(js.Array(this.component, p.asInstanceOf[js.Any]))
}
