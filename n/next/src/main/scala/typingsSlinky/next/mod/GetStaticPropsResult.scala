package typingsSlinky.next.mod

import typingsSlinky.next.nextBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.anon.Props[P]
  - typingsSlinky.next.anon.Redirect
  - typingsSlinky.next.anon.NotFound
*/
trait GetStaticPropsResult[P] extends js.Object
object GetStaticPropsResult {
  
  @scala.inline
  def Props[P](props: P): GetStaticPropsResult[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticPropsResult[P]]
  }
  
  @scala.inline
  def Redirect[P](redirect: typingsSlinky.next.mod.Redirect): GetStaticPropsResult[P] = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticPropsResult[P]]
  }
  
  @scala.inline
  def NotFound[P](notFound: `true`): GetStaticPropsResult[P] = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticPropsResult[P]]
  }
}
