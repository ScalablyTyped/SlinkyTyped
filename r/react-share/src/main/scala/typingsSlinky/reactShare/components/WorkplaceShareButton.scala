package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropsquo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkplaceShareButton {
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropsquo922984608 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropsquo922984608(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropsquo]))
  }
  
  @JSImport("react-share", "WorkplaceShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CommonShareButtonPropsquo): SharedBuilder_CommonShareButtonPropsquo922984608 = new SharedBuilder_CommonShareButtonPropsquo922984608(js.Array(this.component, p.asInstanceOf[js.Any]))
}
