package typingsSlinky.reactNativeCommunityAsyncStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait GetItem extends js.Object {
    
    def getItem(): js.Promise[String | Null] = js.native
    def getItem(callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit]): js.Promise[String | Null] = js.native
    
    def mergeItem(value: String): js.Promise[Unit] = js.native
    def mergeItem(value: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
    
    def removeItem(): js.Promise[Unit] = js.native
    def removeItem(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
    
    def setItem(value: String): js.Promise[Unit] = js.native
    def setItem(value: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
  }
}
