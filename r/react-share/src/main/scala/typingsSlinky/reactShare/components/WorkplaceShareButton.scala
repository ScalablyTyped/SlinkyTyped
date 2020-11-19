package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropsquo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkplaceShareButton {
  
  @JSImport("react-share", "WorkplaceShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropsquo): SharedBuilder_CommonShareButtonPropsquo922984608 = new SharedBuilder_CommonShareButtonPropsquo922984608(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropsquo922984608 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropsquo922984608(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropsquo]))
  }
}
